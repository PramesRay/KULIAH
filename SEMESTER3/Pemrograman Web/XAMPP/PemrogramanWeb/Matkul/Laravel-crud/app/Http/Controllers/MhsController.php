<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Mahasiswa;

class MhsController extends Controller
{
    public function index()
    {
        $datamhs= Mahasiswa::all();
        return view('index',['data' => $datamhs]);
    }

    public function create()
    {
        return view('inputdata');
    }

    public function simpan (Request $request) {
        $mhs = Mahasiswa::create([
            'NPM'       => $request -> NPM,
            'NAMA'      => $request -> NAMA,
            'ALAMAT'    => $request -> ALAMAT,
            'JK'        => $request -> JK,
            'TGL_LAHIR' => date('Y-m-d', strtotime($request -> TGL_LAHIR)),
            'EMAIL'     => $request -> EMAIL
        ]);
        
        return redirect('/mhs');
    }

    public function delete($id)
    {
        $query = Mahasiswa::find($id);
        $query -> delete();
        return redirect() -> back();
    }

    public function edit($id)
    {
        $mhs = Mahasiswa::find($id);

        return view('editdata', ['data' => $mhs]);
    }

    public function update($id, Request $request)
    {
        $mhs = Mahasiswa::find($id);
        $mhs -> NPM        = $request -> NPM;
        $mhs -> NAMA       = $request -> NAMA;
        $mhs -> ALAMAT     = $request -> ALAMAT;
        $mhs -> JK         = $request -> JK;
        $mhs -> TGL_LAHIR  = date( 'Y-m-d', strtotime($request -> TGL_LAHIR));
        $mhs -> EMAIL      = $request -> EMAIL;
        $mhs -> save();
        return redirect('/mhs');
    }
}