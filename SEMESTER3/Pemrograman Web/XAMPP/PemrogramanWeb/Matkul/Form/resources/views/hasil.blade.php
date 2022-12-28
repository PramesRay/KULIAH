<?php
  $npm    = $_POST["npm"];
  $nama   = $_POST["nama"];
  $jk     = $_POST["jk"];
  $email  = $_POST["email"];
?>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DATABASE MAHASISWA</title>
    <style>
      body {
        font-family:monospace;
      }

      h1 {
        text-align: center;
      }

      a {
        text-decoration: none;
        color: black;
      }

      #table {
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
        background-color:cadetblue;
        color: white;
      }
    </style>

  </head>
  
  <body>
    <h1><a href="/">DATABASE MAHASISWA</a></h1>
    
    <br><br>

    <table id="table">
      <thead>
        <th>NPM</th>
        <th>NAMA</th>
        <th>ALAMAT</th>
        <th>EMAIL</th>
      </thead>

      <tbody>
        <tr>
          <td><?= $npm; ?></td>
          <td><?= $nama; ?></td>
          <td><?= $jk; ?></td>
          <td><?= $email; ?></td>
        </tr>
      </tbody>
    </table>
  </body>
</html>

        zero.setEnabled(true);
        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
        nine.setEnabled(true);
        clear.setEnabled(true);
        plus.setEnabled(true);
        mines.setEnabled(true);
        multiple.setEnabled(true);
        devide.setEnabled(true);
        equal.setEnabled(true);