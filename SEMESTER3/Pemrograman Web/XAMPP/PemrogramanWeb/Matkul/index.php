<?php 

require "sql.php";

session_start();

$isLoggedIn=false;

if(isset($_SESSION["username"])) {
    $isLoggedIn=true;
    $dataBuku=$conn->query("SELECT * FROM tb_buku");
}


?>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Home Page</title>

        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.css">
        <link rel="stylesheet" href="assets/styles/index.css">
    </head>
    <body>
        <header>
            <h1 class="text-center">Data Buku Perpustakaan</h1>
        </header>
        <main>
            <?php if($isLoggedIn) : ?>
                <button class="btn btn-success" onclick="location.href='./process/insert.php'">
                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus-lg" viewBox="0 0 16 16">
                        <path fill-rule="evenodd" d="M8 2a.5.5 0 0 1 .5.5v5h5a.5.5 0 0 1 0 1h-5v5a.5.5 0 0 1-1 0v-5h-5a.5.5 0 0 1 0-1h5v-5A.5.5 0 0 1 8 2Z"/>
                    </svg>
                    Tambah Data
                </button>

                <?php if($dataBuku !== false && $dataBuku->num_rows > 0) : ?>
                    <table class="table">
                        <thead>
                            <th scope="col">Kode Buku</th>
                            <th scope="col">Judul</th>
                            <th scope="col">Penulis</th>
                            <th scope="col">Tanggal Masuk</th>
                            <th scope="col">Penerbit</th>
                            <th scope="col">Tahun Terbit</th>
                            <th scope="col">Stok</th>
                            <th scope="col">Action</th>
                        </thead>
                        <tbody>
                            <?php foreach($dataBuku as $buku) : ?>
                                <tr>
                                    <td><?= $buku["kode_buku"] ?></td>
                                    <td><?= $buku["Judul"] ?></td>
                                    <td><?= $buku["Penulis"] ?></td>
                                    <td><?= $buku["tgl_masuk"] ?></td>
                                    <td><?= $buku["Penerbit"] ?></td>
                                    <td><?= $buku["tahun_terbit"] ?></td>
                                    <td><?= $buku["Stok"] ?></td>
                                    <td>
                                        <?php
                                        
                                        $kodeBuku=$buku["kode_buku"];

                                        ?>

                                        <button onclick="location.href='./process/update.php?kode=<?= $kodeBuku ?>'" class="btn btn-outline-primary">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pencil" viewBox="0 0 16 16">
                                                <path d="M12.146.146a.5.5 0 0 1 .708 0l3 3a.5.5 0 0 1 0 .708l-10 10a.5.5 0 0 1-.168.11l-5 2a.5.5 0 0 1-.65-.65l2-5a.5.5 0 0 1 .11-.168l10-10zM11.207 2.5 13.5 4.793 14.793 3.5 12.5 1.207 11.207 2.5zm1.586 3L10.5 3.207 4 9.707V10h.5a.5.5 0 0 1 .5.5v.5h.5a.5.5 0 0 1 .5.5v.5h.293l6.5-6.5zm-9.761 5.175-.106.106-1.528 3.821 3.821-1.528.106-.106A.5.5 0 0 1 5 12.5V12h-.5a.5.5 0 0 1-.5-.5V11h-.5a.5.5 0 0 1-.468-.325z"/>
                                            </svg>
                                            Edit
                                        </button>
                                        <button onclick="location.href='./process/delete.php?kode=<?= $kodeBuku ?>'" class="btn btn-danger">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash" viewBox="0 0 16 16">
                                                <path d="M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6z"/>
                                                <path fill-rule="evenodd" d="M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z"/>
                                            </svg>
                                            Delete
                                        </button>
                                    </td>
                                </tr>
                            <?php endforeach; ?>
                        </tbody>
                    </table>
                <?php else : ?>
                    <p class="p-2 text-center">Tidak ada data pada database</p>

                <?php endif; ?>

                <button onclick="location.href='./logout.php'" class="btn btn-outline-warning">
                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-box-arrow-left" viewBox="0 0 16 16">
                        <path fill-rule="evenodd" d="M6 12.5a.5.5 0 0 0 .5.5h8a.5.5 0 0 0 .5-.5v-9a.5.5 0 0 0-.5-.5h-8a.5.5 0 0 0-.5.5v2a.5.5 0 0 1-1 0v-2A1.5 1.5 0 0 1 6.5 2h8A1.5 1.5 0 0 1 16 3.5v9a1.5 1.5 0 0 1-1.5 1.5h-8A1.5 1.5 0 0 1 5 12.5v-2a.5.5 0 0 1 1 0v2z"/>
                        <path fill-rule="evenodd" d="M.146 8.354a.5.5 0 0 1 0-.708l3-3a.5.5 0 1 1 .708.708L1.707 7.5H10.5a.5.5 0 0 1 0 1H1.707l2.147 2.146a.5.5 0 0 1-.708.708l-3-3z"/>
                    </svg>    
                    Logout
                </button>
            <?php else : ?>
                <div class="bg-danger">
                    <p class="p-2 text-light">Anda belum login, silahkan login terlebih dahulu</p>
                    <button onclick="location.href='login.php'" class="btn btn-warning">Login</button>
                </div>
            <?php endif; ?>
        </main>
        <script src="assets/bootstrap/js/bootstrap.js"></script>
    </body>
</html>