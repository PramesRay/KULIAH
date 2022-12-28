<?php

namespace App\Models;

use CodeIgniter\Model;

class Client extends Model
{
    protected $table            = 'identitas';
    protected $primaryKey       = 'NPM';
    protected $protectFields    = true;
    protected $allowedFields    = [
        'NPM', 'NAMA','ALAMAT', 'JK', 'TGL_LHR', 'EMAIL'
    ];

    public function getClient($id = false){
        if($id === false) {
            return $this->findAll();
        }else {
            return $this->where('NPM',$id)->first();
        }
    }

    public function saveClient($data) {
        return $this->insert($data);
    }

    public function updateClient($id, $data) {
        return $this->update($id, $data);
    }

    public function deleteClient($id) {
        return $this->delete($id);
    }
}
