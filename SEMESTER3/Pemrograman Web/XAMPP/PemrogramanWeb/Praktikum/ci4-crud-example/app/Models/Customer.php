<?php

namespace App\Models;

use CodeIgniter\Model;

class Customer extends Model
{
    protected $table            = 'customers';
    protected $primaryKey       = 'id';
    protected $protectFields    = true;
    protected $allowedFields    = [
        'first_name','last_name'
    ];

    public function getCustomer($id = false){
        if($id === false) {
            return $this->findAll();
        }else {
            return $this->where('id',$id)->first();
        }
    }

    public function saveCustomer($data) {
        return $this->insert($data);
    }

    public function updateCustomer($id, $data) {
        return $this->update($id, $data);
    }

    public function deleteCustomer($id) {
        return $this->delete($id);
    }
}
