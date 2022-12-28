<?php 

require "config.php";
$dataBuku=$conn->query("SELECT * FROM tb_buku");
?>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>KUIS 2</title>

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
        <header>
            <h1 class="text-center">DATABASE PERPUSTAKAAN</h1>
        </header>
        <main>
                <button onclick="location.href='insert.php'">
                    Insert Data
                </button>

                <?php if($dataBuku !== false && $dataBuku->num_rows > 0) : ?>
                    <table id="table">
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

                                        <button onclick="location.href='update.php?kode=<?= $kodeBuku ?>'">
                                            Edit
                                        </button>
                                        <button onclick="location.href='delete.php?kode=<?= $kodeBuku ?>'">
                                            Delete
                                        </button>
                                    </td>
                                </tr>
                            <?php endforeach; ?>
                        </tbody>
                    </table>
                <?php else : ?>
                    <p>Tidak ada data pada database</p>

                <?php endif; ?>
        </main>
    </body>
</html>