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
              <th>KATEGORI</th>
              <th>JUMLAH</th>
            </tr>
          </thead>
          <tbody>
            <?php
            foreach ($tickets as $row) : ?>
              <tr>
                <td><?php echo $row["KATEGORI"]; ?></td>
                <td><?php echo $row["COUNT(*)"]; ?></td>
              </tr>
            <?php endforeach; ?>
          </tbody>
        </table>
        <br>
        <br>

        <!-- --------------------------------------------------------------------------- -->

      <tbody>
        <table class="mt-3 table table-bordered" id="table">
          <thead class="thead-dark">
            <tr>
              <th>NO</th>
              <th>LOMBA</th>
              <th>JUMLAH</th>
            </tr>
          </thead>
          <tbody>
            <?php
            foreach ($tickets as $row) : ?>
              <tr>
                <td><?php echo $row["LOMBA"]; ?></td>
                <td><?php echo $row["COUNT(*)"]; ?></td>
                <!-- <td><button class="btn-xs btn-success" onClick="document.location.href='<?php echo "edit.php?id=" . $row["npm"]; ?>'">Edit</button>
                            <button class="btn-xs btn-danger" onClick="document.location.href='<?php echo "hapus.php?id=" . $row["npm"]; ?>'">Hapus</button>
                        </td> -->
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