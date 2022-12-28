<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="/style.css" />
  <title>DETAIL</title>

  <style>
    body {
      font-family: monospace;
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

    #table td,
    #table th {
      border: 1px solid #ddd;
      padding: 8px;
    }

    /* 
      #table tr:nth-child(even){background-color: #f2f2f2;}

      #table tr:hover {background-color: #ddd;} */

    #table th {
      padding-top: 12px;
      padding-bottom: 12px;
      text-align: left;
      background-color: white;
      color: black;
    }
  </style>

</head>

<body style="color:white;">
  <!-- Page Segmen -->
  <div class="fcontainer">
    <!-- Header Segmen -->
    <nav class="wrapper-header">
      <!-- Brand Segmen -->
      <div class="brand">
        <div class="fname-brand">
          <a style="text-decoration:none; color:white;" href="/">EVENT</a>
        </div>
        <div class="lname-brand">//E-SPORT</div>
      </div>
      <!-- Navigation Segmen -->
      <ul class="navigation">
        <li><a href="/show_db" class="active">DATABASE</a></li>
        <li><a href="/show_tiket">JUMLAH TIKET</a></li>
      </ul>
    </nav>

    <!-- Body Segmen -->
    <div>

      <!-- Desc Segmen -->
      <h1 class="wrapper-body">DATA PENONTON EVENT ESPORT</h1><br><br>
      <tbody>
        <table class="mt-3 table table-bordered" id="table">
          <thead class="thead-dark">
            <tr>
              <th>NPM</th>
              <th>NAMA</th>
              <th>ALAMAT</th>
              <th>JENIS KELAMIN</th>
              <th>TANGGAL LAHIR</th>
              <th>EMAIL</th>
              <th>NO TIKET</th>
              <th>KATEGORI</th>
              <th>LOMBA</th>
            </tr>
          </thead>
          <tbody>
            <?php
            foreach ($clients as $row) : ?>
              <tr>
                <td><?php echo $row["NPM"]; ?></td>
                <td><?php echo $row["NAMA"]; ?></td>
                <td><?php echo $row["ALAMAT"]; ?></td>
                <td><?php echo $row["JK"]; ?></td>
                <td><?php echo $row["TGL_LHR"]; ?></td>
                <td><?php echo $row["EMAIL"]; ?></td>
              <?php endforeach; ?>
              <?php
              foreach ($tickets as $row) : ?>
                <td><?php echo $row["NO_TIKET"]; ?></td>
                <td><?php echo $row["KATEGORI"]; ?></td>
                <td><?php echo $row["LOMBA"]; ?></td>
              </tr>
            <?php endforeach; ?>

          </tbody>
        </table>
    </div>
  </div>
  </div>
  <!-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------- -->
  <script src="external.js"></script>
</body>

</html>