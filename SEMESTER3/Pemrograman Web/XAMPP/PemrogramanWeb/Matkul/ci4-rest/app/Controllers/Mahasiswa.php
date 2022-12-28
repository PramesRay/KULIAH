<?php

namespace App\Controllers;

use App\Controllers\BaseController;
use CodeIgniter\RESTful\ResourceController;
use CodeIgniter\API\ResponseTrait;
use App\Models\Mahasiswa as MahasiswaModel;

class Mahasiswa extends BaseController
{
    public function index()
    {
        $model = new MahasiswaModel();
        $data = [
            'mahasiswas' => $model->getMahasiswa(),
        ];
        return view('mahasiswa', $data);
    }

    public function create() {
        return view('add');
    }

    public function save() {
        $model = new MahasiswaModel();
        $data = [
          'NPM'       => $this->request->getPost('NPM'), 
          'NAMA'      => $this->request->getPost('NAMA'), 
          'ALAMAT'    => $this->request->getPost('ALAMAT'), 
          'TGL_LAHIR' => $this->request->getPost('TGL_LAHIR'),
          'JK'        => $this->request->getPost('JK'),
          'EMAIL'     => $this->request->getPost('EMAIL')
        ];
        $model->saveMahasiswa($data);
        return redirect()->to('/');
    }

    public function edit($key) {
        $model = new MahasiswaModel();
        $data = [
          'mahasiswas' => $model->getMahasiswa($key),
        ];
        return view('edit',$data);
    }

    public function update($key) {
        $model = new MahasiswaModel();
        $data = [
          'NPM'       => $this->request->getPost('NPM'), 
          'NAMA'      => $this->request->getPost('NAMA'), 
          'ALAMAT'    => $this->request->getPost('ALAMAT'), 
          'TGL_LAHIR' => $this->request->getPost('TGL_LAHIR'),
          'JK'        => $this->request->getPost('JK'),
          'EMAIL'     => $this->request->getPost('EMAIL')
        ];
        $model->updateMahasiswa($key, $data);
        return redirect()->to('/');
    }

    public function delete($key) {
        $model = new MahasiswaModel();
        $model->deleteMahasiswa($key);
        return redirect()->to('/');
    }
}