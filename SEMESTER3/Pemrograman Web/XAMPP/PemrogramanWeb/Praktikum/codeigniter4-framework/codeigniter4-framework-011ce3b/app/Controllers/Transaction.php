<?php

namespace App\Controllers;

use App\Controllers\BaseController;
use App\Models\Transaction as TransactionModel;

class Transaction extends BaseController
{
    public function index()
    {
        $model = new TransactionModel();
        $data = [
            'transactions' => $model->getTransaction(),
        ];
        return view('transaction', $data);
    }

    public function create() {
        return view('add');
    }

    public function save() {
        $model = new TransactionModel();
        $data = [
            'key'     => $this->request->getPost('key'), 
            'desc'    => $this->request->getPost('desc'), 
            'date'    => $this->request->getPost('date'), 
            'income'  => $this->request->getPost('income'),
            'expense' => $this->request->getPost('expense')
        ];
        $model->saveTransaction($data);
        return redirect()->to('/');
    }

    public function edit($key) {
        $model = new TransactionModel();
        $data = [
          'transactions' => $model->getTransaction($key),
        ];
        return view('edit',$data);
    }

    public function update($key) {
        $model = new TransactionModel();
        $data = [
          'key' => $this->request->getPost('key'), 
          'desc' => $this->request->getPost('desc'), 
          'date' => $this->request->getPost('date'), 
          'income' => $this->request->getPost('income'), 
          'expense' => $this->request->getPost('expense'), 
        ];
        $model->updateTransaction($key, $data);
        return redirect()->to('/');
    }

    public function delete($key) {
        $model = new TransactionModel();
        $model->deleteTransaction($key);
        return redirect()->to('/');
    }
}