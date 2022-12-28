<?php

require "config.php";

$invalid=FALSE; // Kalo ada kesalahan pada update, ditandain sama variabel ini
$kodeBuku=$_GET["kode"];
$data=$conn->query("SELECT * FROM tb_buku WHERE kode_buku='$kodeBuku'")->fetch_assoc();

if(isset($_POST["save"])) {
    if(update($kodeBuku, $_POST)) {
        header("Location: index.php");
    } else {
        $invalid=true;
    }
}

?>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Update Data</title>
        <style>
          #table {
            font-family: Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: 100%;
          }

          #table td, #table th {
            border: 1px solid #ddd;
            padding: 8px;
          }

          #table tr:nth-child(even){background-color: #f2f2f2;}

          #table tr:hover {background-color: #ddd;}

          #table th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: left;
            background-color: #04AA6D;
            color: white;
          }

          button {
            background-color: #4CAF50; /* Green */
            border: none;
            color: white;
            padding: 5px 10px;
            border-radius: 5px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
          }

          .text-center {
            text-align: center;
          }
        </style>
    </head>
    <body>
        <h1>Update Data</h1>
        <?php if($invalid) : ?>
            <div>
                <p>Invalid update</p>
            </div>
        <?php endif; ?>
        <form action="#" method="post">
          <table id="table">

            <tr>
              <td>  
                <label for="kode-buku">Kode Buku</label>
              </td>
              <td>
                <input 
                    type="text" 
                    name="kode_buku"
                    id="kode-buku"
                    class="form-control"
                    autocomplete="off"
                    value="<?= $data['kode_buku'] ?>"
                    required
                >
              </td>
            </tr>
            <tr>
              <td>  
                <label for="Judul">Judul</label>
              </td>
              <td>
                <input 
                    type="text" 
                    name="Judul"
                    id="Judul"
                    autocomplete="off"
                    value="<?= $data['Judul'] ?>"
                    class="form-control"
                    required
                >
              </td>
            </tr>
            <tr> 
              <td>  
                <label for="Penulis">Penulis</label>
              </td>
              <td>
                <input 
                    type="text" 
                    name="Penulis"
                    id="Penulis"
                    autocomplete="off"
                    value="<?= $data['Penulis'] ?>"
                    class="form-control"
                    required
                >
              </td>
            </tr>
            <tr>
              <td>  
                <label for="tgl-masuk">Tanggal Masuk</label>
              </td>
              <td>
                <input 
                    type="date" 
                    name="tgl_masuk"
                    id="tgl-masuk"
                    value="<?= $data['tgl_masuk'] ?>"
                    class="form-control"
                    required
                >
              </td>
            </tr>
            <tr>
              <td>  
                <label for="Penerbit">Penerbit</label>
              </td>
              <td>
                <input 
                    type="text" 
                    name="Penerbit"
                    id="Penerbit"
                    autocomplete="off"
                    value="<?= $data['Penerbit'] ?>"
                    class="form-control"
                >
              </td>
            </tr>
            <tr>
              <td>  
                <label for="thn-terbit">Tahun Terbit</label>
              </td>
              <td>
                <input 
                    type="text" 
                    name="thn_terbit"
                    id="thn-terbit"
                    autocomplete="off"
                    value="<?= $data['tahun_terbit'] ?>"
                    class="form-control"
                >
              </td>
            </tr>
            <tr>
              <td>  
                <label for="Stok">Stok</label>
              </td>
              <td>
                <input 
                    type="number" 
                    name="Stok"
                    id="Stok"
                    value="<?= $data['Stok'] ?>"
                    class="form-control"
                >
              </td>
            </tr>
            <div id="options">
                <button type="submit" name="save">Simpan</button>
                <button type="button" onclick="location.href='index.php'">Kembali</button>
            </div>
          </table>
        </form>
    </body>
</html>