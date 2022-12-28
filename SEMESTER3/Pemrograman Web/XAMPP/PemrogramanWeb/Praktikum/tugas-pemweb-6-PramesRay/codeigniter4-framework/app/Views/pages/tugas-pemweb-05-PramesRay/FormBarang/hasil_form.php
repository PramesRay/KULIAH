<!--
  Nama    : Prames Ray Lapian
  NPM     : 140810210059
  Desc    : Tugas PHP
-->

<?php
  $nama     = $_POST["nama"];
  $email    = $_POST["email"];
  $telp     = $_POST["telp"];
  $alamat   = $_POST["alamat"];
  $chart    = $_POST["chart"];
  $payment  = $_POST["payment"];

  function hitung_harga($chart){
    $total_harga = 0;
    $stuffs = array('MSI_Katana_GF66-12U'  => 22000000,
                    'HP_OMEN_16_Series'  => 25000000,
                    'MSI_Stealth_15M'  => 26000000,
                    'LENOVO_Legion_5i_Pro'  => 34000000,
                    'ASUS_ROG_Flow_Z13'  => 35000000,
                    'MSI_Vector_GP66'  => 35500000,
                    'ASUS_ROG_Strix_G15_(2022)'  => 37000000,
                    'ASUS_ROG_Zephyrus_M16'  => 43000000,
                    'LENOVO_Legion_7'  => 46000000,
                    'ASUS_ROG_Strix_Scar_15_(2022)' => 66000000,
                    'ASUS_ROG_Zephyrus_Duo_15_SE_GX551' => 66000000,
                    'MSI_GE76_Raider-12U' => 72000000);
      foreach ($chart as $child_chart) {
        $total_harga += $stuffs[$child_chart];
      }
    return $total_harga;
  }

  function chart_list($chart): void{
    for ($i=0; $i < count($chart); $i++) { 
      echo ($i+1); echo". " ; echo $chart[$i]; echo "<br>";
    }
  }
?>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Struk Belanja</title>
</head>
<body>
  <h2>"STRUK BELANJA"</h2>
  <table>
    <tr>
      <td>Nama</td>
      <td> : </td>
      <td><?=$nama;?></td>
    </tr>
    <tr>
      <td>Email</td>
      <td> : </td>
      <td><?=$email;?></td>
    </tr>
    <tr>
      <td>Nomor Telepon / Whatsapp</td>
      <td> : </td>
      <td><?=$telp;?></td>
    </tr>
    <tr>
      <td>Alamat</td>
      <td> : </td>
      <td><?=$alamat;?></td>
    </tr>
    <tr>
      <td>Keranjang</td>
      <td> : </td>
      <td><?= chart_list($chart);?></td>
    </tr>
    <tr>
      <td>Total Belanja</td>
      <td> : </td>
      <td><?="Rp ".hitung_harga($chart);?></td>
    </tr>
    <tr>
      <td>Metode Pembayaran</td>
      <td> : </td>
      <td><?=$payment;?></td>
    </tr>
  </table>
  <br>
</body>
</html>