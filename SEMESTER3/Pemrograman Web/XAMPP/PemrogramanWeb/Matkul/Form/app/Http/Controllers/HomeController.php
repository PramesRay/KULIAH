<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class HomeController extends Controller
{
    public function index() {
        return view('form');
    }
    
    public function result() {
        return view('hasil');
    }
}
