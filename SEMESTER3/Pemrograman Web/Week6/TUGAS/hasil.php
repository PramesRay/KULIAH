<!--
  Nama    : Prames Ray Lapian
  NPM     : 140810210059
  Desc    : Tugas PHP
-->


<?php

$npm=$_POST["npm"];
$nama=$_POST["nama"];
$alamat=$_POST["alamat"];
$tmpt_lahir=$_POST["tmpt_lahir"];
$tgl_lahir=$_POST["tgl_lahir"];
$jk=$_POST["jk"];
$hobbies=$_POST["hobby"];

// var_dump($_POST);

?>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Hasil Form</title>
    </head>
    <body>
        <h2>Hasil Biodata</h2>
        <table cellpadding="5">
            <tr>
                <td>Nama</td>
                <td>:</td>
                <td><?= $nama; ?></td>
            </tr>
            <tr>
                <td>NPM</td>
                <td>:</td>
                <td><?= $npm; ?></td>
            </tr>
            <tr>
                <td>Alamat</td>
                <td>:</td>
                <td><?= $alamat; ?></td>
            </tr>
            <tr>
                <td>Tempat, Tanggal Lahir</td>
                <td>:</td>
                <td><?= $tmpt_lahir . ", " . $tgl_lahir; ?></td>
            </tr>
            <tr>
                <td>Jenis Kelamin</td>
                <td>:</td>
                <td><?= $jk; ?></td>
            </tr>
            <tr>
                <td>Hobby</td>
                <td>:</td>
                <td>
                    <ol>
                        <?php foreach($hobbies as $hobby) : ?>
                            <li><?= $hobby; ?></li>
                        <?php endforeach; ?>
                    </ol>
                </td>
            </tr>


        </table>
    </body>
</html>