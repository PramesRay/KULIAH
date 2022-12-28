<?php

namespace App\Controllers;

use App\Controllers\BaseController;
use App\Models\Customer as CustomerModel;

class Customer extends BaseController
{
    public function index()
    {
        $model = new CustomerModel();
        $data = [
            'customers' => $model->getCustomer(),
        ];
        return view('customer',$data);
    }

    public function create() {
        return view('add');
    }

    public function save() {
        $model = new CustomerModel();
        $data = [
            'first_name' => $this->request->getPost('first_name'), 
            'last_name' => $this->request->getPost('last_name'), 
        ];
        $model->saveCustomer($data);
        return redirect()->to('/');
    }

    public function edit($id) {
        $model = new CustomerModel();
        $data = [
            'customer' => $model->getCustomer($id),
        ];
        return view('edit',$data);
    }

    public function update($id) {
        $model = new CustomerModel();
        $data = [
            'first_name' => $this->request->getPost('first_name'), 
            'last_name' => $this->request->getPost('last_name'), 
        ];
        $model->updateCustomer($id, $data);
        return redirect()->to('/');
    }

    public function delete($id) {
        $model = new CustomerModel();
        $model->deleteCustomer($id);
        return redirect()->to('/');
    }
}
