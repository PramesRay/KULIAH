<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\MhsController;


/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/',[MhsController::class,'index']);
Route::get('mhs',[MhsController::class,'index']);
Route::get('mhs/edit/{NPM}',[MhsController::class,'edit']);
Route::get('mhs/new',[MhsController::class,'create']);
Route::get('mhs/hapus/{NPM}',[MhsController::class,'delete']);
Route::post('mhs/update/{NPM}', [MhsController::class,'update']);
Route::post('mhs/simpan', [MhsController::class,'simpan']);