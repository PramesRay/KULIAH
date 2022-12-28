<?php

namespace App\Models;

use CodeIgniter\Model;

class Mahasiswa extends Model
{
    protected $table            = 'identitas';
    protected $primaryKey       = 'NPM';
    protected $protectFields    = true;
    protected $allowedFields    = ['NPM', 'NAMA','ALAMAT', 'TGL_LAHIR', 'JK', 'EMAIL'];

    public function getMahasiswa($key = false){
        if($key === false) {
            return $this->findAll();
        }else {
            return $this->where('NPM',$key)->first();
        }
    }

    public function saveMahasiswa($data) {
        return $this->insert($data);
    }

    public function updateMahasiswa($key, $data) {
        return $this->update($key, $data);
    }

    public function deleteMahasiswa($key) {
        return $this->delete($key);
    }
}