<?php
    include("config.php");

    $sql = "DELETE FROM identitas WHERE npm=:npm";
    $query = $conn->prepare($sql);
    $query->execute([':npm' => $_GET['npm']]);

    echo "<script>alert('Data telah berhasil dihapus!');</script>";
    header("Location: index.php");
?>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Delete Data</title>
</head>
<body>
    <h1?> Form Biodata Mahasiswa </h1>

        <button type="submit" id="submit" onclick="location.href='index.php'">Home</button>
        <form action="delete.php" method="post" name="formDelete">
      <table>
        <tr>
            <td>
              <label for="npm">NPM*</label>
            </td>
            <td>
              <input 
                type="text" 
                class="form-control" 
                id="npm" 
                name="npm" 
                placeholder="140810XXXXXX" 
                required>
            </td>
          </tr>
          <tr>
            <td>
              <label for="nama">Nama Lengkap*</label>
            </td>
            <td>
              <input 
                type="text" 
                class="form-control" 
                id="nama" 
                name="nama" 
                placeholder="Nama Lengkap" 
                required>
            </td>
          </tr>
          <tr>
            <td>
              <label for="email">Email*</label>
            </td>
            <td>
              <input 
                type="text" 
                class="form-control" 
                id="email" 
                name="email" 
                placeholder="Email"
                aria-describedby="inputGroupPrepend" 
                required>
            </td>
          </tr>
          <tr>
            <td>
              <label for="tgl_lahir">Tanggal Lahir*</label><br>
            </td>
            <td>
              <input 
              type="date"
              class="form-control"
              id="tgl_lahir"
              name="tgl_lahir"
              required>
            </td>
          </tr>
          <tr>
            <td>
              <label for="jk">Jenis Kelamin*</label>
            </td>
            <td>
              <input 
                  type="radio" 
                  class="btn-check" 
                  name="jk" 
                  id="primary-outlined" 
                  value="L"
                  autocomplete="off">
              <label for="primary-outlined">
                  <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-gender-male" viewBox="0 0 16 16">
                      <path fill-rule="evenodd" d="M9.5 2a.5.5 0 0 1 0-1h5a.5.5 0 0 1 .5.5v5a.5.5 0 0 1-1 0V2.707L9.871 6.836a5 5 0 1 1-.707-.707L13.293 2H9.5zM6 6a4 4 0 1 0 0 8 4 4 0 0 0 0-8z"/>
                  </svg>
                  LAKI - LAKI
              </label>
            </td>
          </tr>
          <tr>
            <td></td>
            <td>
              <input 
                  type="radio" 
                  class="btn-check" 
                  name="jk" 
                  id="danger-outlined" 
                  value="P"
                  autocomplete="off"
              >
              <label class="btn btn-outline-danger" for="danger-outlined">
                  <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-gender-female" viewBox="0 0 16 16">
                      <path fill-rule="evenodd" d="M8 1a4 4 0 1 0 0 8 4 4 0 0 0 0-8zM3 5a5 5 0 1 1 5.5 4.975V12h2a.5.5 0 0 1 0 1h-2v2.5a.5.5 0 0 1-1 0V13h-2a.5.5 0 0 1 0-1h2V9.975A5 5 0 0 1 3 5z"/>
                  </svg>
                  PEREMPUAN
              </label>
            </td>
          </tr>
          <tr>
            <td>
              <label for="alamat">Alamat*</label><br>
            </td>
            <td>
              <textarea
                  class="form-control" 
                  id="alamat" 
                  name="alamat"
                  required>
              </textarea>
            </td>
          </tr>
      </table>
    </form>
</body>
</html>