<?php

require "../sql.php";

$invalid=FALSE; // Kalo ada kesalahan pada update, ditandain sama variabel ini
$kodeBuku=$_GET["kode"];
$data=$conn->query("SELECT * FROM tb_buku WHERE kode_buku='$kodeBuku'")->fetch_assoc();

if(isset($_POST["save"])) {
    if(update($kodeBuku, $_POST)) {
        header("Location: ../index.php");
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
        
        <link rel="stylesheet" href="../assets/bootstrap/css/bootstrap.css">
        <link rel="stylesheet" href="../assets/styles/form.css">
    </head>
    <body>
        <h1 class="text-center">Update Data</h1>
        <?php if($invalid) : ?>
            <div class="bg-danger">
                <p class="p-1 text-light">Invalid update</p>
            </div>
        <?php endif; ?>
        <form action="#" method="post">
            <div class="mb-3">
                <label for="kode-buku" class="form-label">Kode Buku</label>
                <input 
                    type="text" 
                    name="kode_buku"
                    id="kode-buku"
                    class="form-control"
                    autocomplete="off"
                    value="<?= $data['kode_buku'] ?>"
                    required
                >
            </div>
            <div class="mb-3">
                <label for="judul" class="form-label">Judul</label>
                <input 
                    type="text" 
                    name="judul"
                    id="judul"
                    autocomplete="off"
                    value="<?= $data['judul'] ?>"
                    class="form-control"
                    required
                >
            </div>
            <div class="mb-3"> 
                <label for="penulis" class="form-label">Penulis</label>
                <input 
                    type="text" 
                    name="penulis"
                    id="penulis"
                    autocomplete="off"
                    value="<?= $data['penulis'] ?>"
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
                    value="<?= $data['tgl_masuk'] ?>"
                    class="form-control"
                    required
                >
            </div>
            <div class="mb-3">
                <label for="penerbit" class="form-label">Penerbit</label>
                <input 
                    type="text" 
                    name="penerbit"
                    id="penerbit"
                    autocomplete="off"
                    value="<?= $data['penerbit'] ?>"
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
                    value="<?= $data['tahun_terbit'] ?>"
                    class="form-control"
                >
            </div>
            <div class="mb-3">
                <label for="stok" class="form-label">Stok</label>
                <input 
                    type="number" 
                    name="stok"
                    id="stok"
                    value="<?= $data['stok'] ?>"
                    class="form-control"
                >
            </div>
            <div id="options">
                <button type="submit" name="save" class="btn btn-success">Simpan</button>
                <button type="button" onclick="location.href='../index.php'" class="btn btn-outline-warning">Kembali</button>
            </div>
        </form>

        <script src="../assets/bootstrap/js/bootstrap.js"></script>
    </body>
</html>