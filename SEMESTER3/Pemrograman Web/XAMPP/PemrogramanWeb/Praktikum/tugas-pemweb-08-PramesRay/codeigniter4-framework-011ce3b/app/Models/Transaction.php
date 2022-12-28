<?php

namespace App\Models;

use CodeIgniter\Model;

class Transaction extends Model
{
    protected $table            = 'data';
    protected $primaryKey       = 'key';
    protected $protectFields    = true;
    protected $allowedFields    = ['key', 'desc','date', 'income', 'expense'];

    public function getTransaction($key = false){
        if($key === false) {
            return $this->findAll();
        }else {
            return $this->where('key',$key)->first();
        }
    }

    public function saveTransaction($data) {
        return $this->insert($data);
    }

    public function updateTransaction($key, $data) {
        return $this->update($key, $data);
    }

    public function deleteTransaction($key) {
        return $this->delete($key);
    }
}