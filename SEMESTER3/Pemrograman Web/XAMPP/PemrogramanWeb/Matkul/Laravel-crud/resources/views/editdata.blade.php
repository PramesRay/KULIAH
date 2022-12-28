<html>

<head>
  <title>DAFTAR MAHASISWA</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>

<body>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top">
    <div class="container">
      <a class="navbar-brand" href="/">DATA MAHASISWA</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
    </div>
  </nav>
  <div class="container">
    <div class="card mt-5">
      <div class="card-header bg-dark text-white">
        <h6>EDIT BIODATA</h6>
      </div>
      <div class="card-body ml-3">
        <form action="/mhs/update/{{$data->NPM}}" method="post" class="ml-5">
          @csrf
          <div class="row">
            <div class="col-lg-2"></div>
            <div class="col-lg-7">
              <div class="form-group">
                <label>NPM :</label>
                <input type="text" class="form-control" name="NPM" value="<?php echo $data["NPM"]; ?>">
              </div>
              <div class="form-group">
                <label>NAMA :</label>
                <input type="text" class="form-control" name="NAMA" value="<?php echo $data["NAMA"]; ?>">
              </div>
              <div class="form-group">
                <label>ALAMAT :</label>
                <textarea class="form-control" rows="3" name="ALAMAT"><?php echo $data["ALAMAT"]; ?></textarea>
              </div>
              <div class="form-group">
                <label>Jenis Kelamin :</label><br />
                <label class="radio-inline"><input type="radio" name="JK" value="L" <?php if ($data["JK"] == "L") : ?>checked="checked" <?php endif; ?>> Laki-Laki</label>
                <label class="radio-inline"><input type="radio" name="JK" value="P" <?php if ($data["JK"] == "P") : ?>checked="checked" <?php endif; ?>> Perempuan</label>
              </div>
              <div class="form-group">
                <!-- Date input -->
                <label>TANGGAL LAHIR :</label>
                <input class="form-control datepicker" name="TGL_LAHIR" value="<?php echo $data["TGL_LAHIR"]; ?>" type="date">
              </div>
              <div class="form-group">
                <label>EMAIL :</label>
                <input type="text" class="form-control" name="EMAIL" value="<?php echo $data["EMAIL"]; ?>">
              </div>

              <hr>
              <input type="submit" class="btn btn-primary" value="Update" name="update">
            </div>
          </div>
        </form>

      </div>
    </div>
  </div>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous">
    $(function() {
      $(".datepicker").datepicker({
        format: 'dd-mm-yyyy',
        autoclose: true,
        todayHighlight: true,
      });
    });
  </script>
</body>

</html>