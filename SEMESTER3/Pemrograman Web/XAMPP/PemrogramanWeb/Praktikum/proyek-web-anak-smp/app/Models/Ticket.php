<?php

namespace App\Models;

use CodeIgniter\Model;

class Ticket extends Model
{
    protected $table            = 'tiket';
    protected $primaryKey       = 'NO_TIKET';
    protected $protectFields    = true;
    protected $allowedFields    = [
        'NO_TIKET', 'KATEGORI', 'LOMBA', 'NPM'
    ];

    public function getTicket($id = false){
        if($id === false) {
            return $this->findAll();
        }else {
            return $this->where('NO_TIKET',$id)->first();
        }
    }

    public function saveTicket($data) {
        return $this->insert($data);
    }

    public function updateTicket($id, $data) {
        return $this->update($id, $data);
    }

    public function deleteTicket($id) {
        return $this->delete($id);
    }
}
