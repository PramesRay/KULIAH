<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Mahasiswa extends Model
{
    use HasFactory;
    protected $table ='identitas';
    protected $primaryKey = 'NPM';
    public $timestamps = false;
    protected $fillable=['NPM','NAMA','ALAMAT','TGL_LAHIR','JK','EMAIL'];
}
