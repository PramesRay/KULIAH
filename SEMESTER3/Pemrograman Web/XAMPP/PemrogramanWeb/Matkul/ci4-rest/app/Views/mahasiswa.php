<?php
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
    <h1><a href="">DATABASE MAHASISWA</a></h1>
    
    <br><br>

    <table id="table">
      <thead>
        <th>NPM</th>
        <th>NAMA</th>
        <th>ALAMAT</th>
        <th>TGL_LAHIR</th>
        <th>JK</th>
        <th>EMAIL</th>
        <th>OPTION</th>
      </thead>

      <tbody>
        <?php foreach($mahasiswas as $row) :?>
          <tr>
            <td><?= $row['NPM'];?></td>
            <td><?= $row['NAMA'];?></td>
            <td><?= $row['ALAMAT'];?></td>
            <td><?= $row['TGL_LAHIR'];?></td>
            <td><?= $row['JK'];?></td>
            <td><?= $row['EMAIL'];?></td>
            <td>
              <a href="/edit/<?=$row['NPM'];?>">Edit | </a>
              <a href="/delete/<?=$row['NPM'];?>">Delete</a>
            </td>
          </tr>
        <?php endforeach; ?>
      </tbody>
    </table>

    <br>

    <table id="table">
      <body>
          <td style="text-align: center"><a href="/new">[NEW MAHASISWA]</a></td>
      </body>
    </table>
    
    <br>
    
  </body>
</html>