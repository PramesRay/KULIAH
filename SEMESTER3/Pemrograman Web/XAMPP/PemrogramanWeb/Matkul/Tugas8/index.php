<!-- 
    Nama  : Prames Ray Lapian
    NPM   : 140810210059
    Kelas : A
 -->

<?php
include("config.php");
session_start();

if (!isset($_SESSION['npm'])) {
  header("Location: login.php");
}

if ($_SESSION['level'] != 1) {
  header("Location: login.php");
}
?>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Tugas Pertemuan 6</title>
  <style>
    body {
      background-color: rgb(255, 200, 0);
      font-family: hack;
    }

    .center {
      text-align: center;
    }

    .table {
      margin-left: auto;
      margin-right: auto;

    }

    table,
    th,
    tbody,
    tr,
    td {
      border: 1px solid;
      padding: 10px;
      border-radius: 3px;
    }

    th {
      background-color: lightgrey;
    }

    button {
      border-radius: 5px;
      border: 1px solid;
      padding: 10px;
      display: grid;
      place-items: center;
      float: right;
      margin-right: 26%;
    }

    button:hover {
      background-color: rgb(200, 200, 200);
      padding: 12px;
      transition: 0.2s ease-in-out;
    }

    button>input:hover {
      background-color: rgb(200, 200, 200);
      transition: 0.2s ease-in-out;
    }

    tbody>tr:hover {
      background-color: rgb(250, 189, 0);
      padding: 15px;
      transition: 0.2s ease-in-out;
    }

    a {
      text-decoration: none;
      color: black;
    }

    a:hover {
      color: rgb(66, 55, 0);
    }
  </style>

</head>

<body>
  <h1 class="center">DATABASE MAHASISWA TEKNIK INFORMATIKA</h1>
  <h3 class="center">- Angkatan 2021 -</h3>

  <button onclick="location.href='create.html'">Create Data</button>
  <br>
  <br>
  <br>

  <table class="center table">
    <thead>
      <tr>
        <th>NPM</th>
        <th>NAMA</th>
        <th>EMAIL</th>
        <th>TANGGAL LAHIR</th>
        <th>JENIS KELAMIN</th>
        <th>ALAMAT</th>
        <th>ACTION</th>
      </tr>
    </thead>
    <tbody>
      <?php
      $query = "SELECT * FROM identitas";
      $statement = $conn->prepare($query);
      $statement->execute();
      $result = $statement->fetchAll(PDO::FETCH_ASSOC);
      if ($result) {
        foreach ($result as $row) {
          echo "<tr>";
          echo "<td>" . $row['NPM'] . "</td>";
          echo "<td>" . $row['NAMA'] . "</td>";
          echo "<td>" . $row['EMAIL'] . "</td>";
          echo "<td>" . date('d-m-Y', strtotime($row['TGL_LAHIR'])) . "</td>";
          echo "<td>" . $row['JK'] . "</td>";
          echo "<td>" . $row['ALAMAT'] . "</td>";
          echo "<td><a href=\"update.php?npm=$row[NPM]\">Edit</a> | 
                        <a href=\"delete.php?npm=$row[NPM]\" 
                            onClick=\"return confirm('Apakah anda yakin untuk delete?')\">
                            Delete
                        </a>
                    </td>";
          echo "</tr>";
        }
      }
      ?>
    </tbody>
  </table>
  <br>
  <br>
  <button>
    <form action="logout.php" method="POST">
      <input style="border: 0px" type="submit" name="logout" value="Logout">
  </button>
</body>

</html>