<?php

require "../sql.php";

$invalid=FALSE; // Kalo ada kesalahan pada insert, ditandain sama variabel ini

if(isset($_POST["save"])) {
    if(insert($_POST) === TRUE) {
        header("Location: ../index.php");
    } else {
        $invalid=TRUE;
    }
}

?>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Tambah Data</title>
        
        <link rel="stylesheet" href="../assets/bootstrap/css/bootstrap.css">
        <link rel="stylesheet" href="../assets/styles/form.css">
    </head>
    <body>
        <h1 class="text-center">Tambah Data</h1>
        <?php if($invalid) : ?>
            <div class="bg-danger">
                <p class="p-1 text-light">Invalid insert</p>
            </div>
        <?php endif; ?>
        <form action="#" method="post">
            <div class="mb-3">
                <label for="kode-buku" class="form-label">Kode Buku</label>
                <input 
                    type="number" 
                    name="kode_buku"
                    id="kode-buku"
                    class="form-control"
                    autocomplete="off"
                    required
                >
            </div>
            <div class="mb-3">
                <label for="Judul" class="form-label">Judul</label>
                <input 
                    type="text" 
                    name="Judul"
                    id="Judul"
                    autocomplete="off"
                    class="form-control"
                    required
                >
            </div>
            <div class="mb-3"> 
                <label for="Penulis" class="form-label">Penulis</label>
                <input 
                    type="text" 
                    name="Penulis"
                    id="Penulis"
                    autocomplete="off"
                    class="form-control"
                    required
                >
            </div>
            <div class="mb-3">
                <label for="tgl-masuk" class="form-label">Tanggal Masuk</label>
                <input 
                    type="date" 
                    name="tgl_masuk"
                    id="tgl-masuk"
                    class="form-control"
                    required
                >
            </div>
            <div class="mb-3">
                <label for="Penerbit" class="form-label">Penerbit</label>
                <input 
                    type="text" 
                    name="Penerbit"
                    id="Penerbit"
                    autocomplete="off"
                    class="form-control"
                >
            </div>
            <div class="mb-3">
                <label for="thn-terbit" class="form-label">Tahun Terbit</label>
                <input 
                    type="text" 
                    name="thn_terbit"
                    id="thn-terbit"
                    autocomplete="off"
                    class="form-control"
                >
            </div>
            <div class="mb-3">
                <label for="Stok" class="form-label">Stok</label>
                <input 
                    type="number" 
                    name="Stok"
                    id="Stok"
                    class="form-control"
                >
            </div>
            <div id="options">
                <button type="submit" name="save" class="btn btn-success">Tambah</button>
                <button onclick="location.href='../index.php'" class="btn btn-outline-warning">Kembali</button>
            </div>
        </form>

        <script src="../assets/bootstrap/js/bootstrap.js"></script>
    </body>
</html>