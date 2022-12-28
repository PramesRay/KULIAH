<html>

<head>
  <title>DAFTAR MAHASISWA</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>

<body>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top">
    <div class="container">
      <a class="navbar-brand" href="">DATA MAHASISWA</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
    </div>
  </nav>
  <div class="container">
    <div class="card mt-5">
      <div class="card-header bg-dark text-white">
        <h6>DAFTAR MAHASISWA</h6>
      </div>
      <div class="card-body ml-3">
        <tbody>
          <table class="mt-3 table table-bordered">
            <thead class="thead-dark">
              <tr>
                <th>No</th>
                <th>NPM</th>
                <th>NAMA</th>
                <th>ALAMAT</th>
                <th>JENIS KELAMIN</th>
                <th>TANGGAL LAHIR</th>
                <th>EMAIL</th>
                <th>AKSI</th>
              </tr>
            </thead>
            <tbody>
              <?php $no = 0; ?>
              @foreach ($data as $row)
              <?php $no++;
              $tgl = date('d-m-Y', strtotime($row['TGL_LAHIR']));
              ?>

              <tr>
                <td><?php echo $no; ?></td>
                <td><?php echo $row["NPM"]; ?></td>
                <td><?php echo $row["NAMA"]; ?></td>
                <td><?php echo $row["ALAMAT"]; ?></td>
                <td><?php echo $row["JK"]; ?></td>
                <td><?php echo $tgl; ?></td>
                <td><?php echo $row["EMAIL"]; ?></td>
                <td>
                  <button class="btn-xs btn-success" onClick="location.href='mhs/edit/{{$row->NPM}}'" >Edit</button>
                  <button class="btn-xs btn-danger" onClick="return confirm('Apakah anda yakin akan menghapus {{$row->NPM}}'), location.href='mhs/hapus/{{$row->NPM}}'">Hapus</button>
                </td>
              </tr>
              @endforeach
              <button class="btn-xs btn-success" onClick="location.href='mhs/new'">New</button>
            </tbody>
          </table>
          <!-- <form action="input_data.php" method="post">
            <input type="submit" class="btn btn-primary" value="Input Data" name="logout">
          </form> -->
      </div>

    </div>
  </div>

</body>

</html>