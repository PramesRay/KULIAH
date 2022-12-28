<?php
    if(!isset($_POST['nama']) || 
       !isset($_POST['email']) || 
       !isset($_POST['noTelp']) || 
       !isset($_POST['alamat']) ||
       !isset($_POST['barang']) || 
       !isset($_POST['metodeBayar'])){ 
       header("Location: index.html");
    }
    
    $nama = $_POST['nama'];
    $email = $_POST['email'];
    $noTelp = $_POST['noTelp'];
    $alamat = $_POST['alamat'];
    $barang = $_POST['barang'];
    $metodeBayar = $_POST['metodeBayar'];

    function hitung_harga($barang){
        $total_harga = 0;
        $stuffs = array('Setrika' => 130000, 
                        'Hair dryer' => 250000,
                        'Kulkas' => 2000000,
                        'Blender' => 300000,
                        'Mesin cuci' => 2100000,
                        'AC' => 3000000,
                        'Printer' => 750000,
                        'TV' => 5000000,
                        'Microwave' => 1200000,
                        'Rice cooker' => 700000,
                        'Wajan elektrik' => 700000,
                        'Dispenser' => 370000);
        foreach ($barang as $child_barang) {
            $total_harga += $stuffs[$child_barang];
        }
        return $total_harga;
    }
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hasil Form Belanja</title>
    <link rel="stylesheet" href="./assets/hasil_form.css">
    <link rel="stylesheet" href="./assets/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="./assets/styles/hasil.css">
</head> 
<body>
    <div class="box">
        <img src="./assets/img/logo.png" alt="himatif" class="logo">
        <div class="header satu">
            Data Pemesanan
        </div>
        <div class="header dua">
            TOKO SEBAR SUBUR
        </div>
        <h4>NAMA</h4>
        <p><?= strtoupper($nama)?></p>
        <h4>EMAIL</h4>
        <p><?= $email."@gmail.com"?></p> 
        <h4>NO TELEPON</h4>
        <p><?= $noTelp?></p>
        <h4>ALAMAT</h4>
        <p><?= strtoupper($alamat)?></p>
        <h4>BARANG BELANJA</h4>
        <?php for ($i=0; $i < count($barang); $i++) { 
            echo"<span style='display:inline;'>
                    <h4 style='display:inline;'>".($i+1)."</h4>. 
                    "."$barang[$i]
                 </span><br>"; 
        } ?>
        <h4>TOTAL BAYAR</h4>
        <p><?="Rp. ".hitung_harga($barang)?></p>
        <h4>METODE BAYAR</h4>
        <p><?= $metodeBayar?></p>
        <a href="index.html" class="btn-custom submit">Back</a>
    <script src="./assets/bootstrap/js/bootstrap.js"></script>
</body>
</html>