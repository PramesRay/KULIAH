<?php namespace App\Controllers;

class Page extends BaseController {
  public function home() { 
    return view('/home');
  }
  public function tugas1() { 
    return view('pages/tugas-pemweb-01-PramesRay/Input.html');
  }
  
  public function tugas2() { 
    return view('pages/tugas-pemweb-02-PramesRay/Tokoh.html');
  }
  
  public function tugas4_1() { 
    return view('pages/tugas-pemweb-04-PramesRay/bio.html');
  }
  
  public function tugas4_2() { 
    return view('pages/tugas-pemweb-04-PramesRay/calc.html');
  }
  
  public function tugas5_1() { 
    return view('pages/tugas-pemweb-05-PramesRay/FormBarang/form.html');
  }
  
  public function tugas5_2() { 
    return view('pages/tugas-pemweb-05-PramesRay/Mahasiswa/mahasiswa');
  }

}
?>