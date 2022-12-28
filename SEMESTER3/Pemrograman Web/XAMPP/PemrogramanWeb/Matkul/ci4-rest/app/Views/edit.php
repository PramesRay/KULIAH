<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Update Mahasiswa</title>
</head>
<body>
<h1>Update Mahasiswa</h1>

<br><br><br>

<form action="/edit/<?=$mahasiswas['NPM']?>" method="post">
<table>
      <tr>
        <td> 
          <label for="NPM">NPM: </label>
        </td>
        <td>
          <input type="number" name="NPM" value="<?= $mahasiswas['NPM']?>" >
        </td>
      </tr>

      <tr>
        <td> 
          <label for="NAMA">NAMA: </label>
        </td>
        <td>
          <input type="text" name="NAMA" value="<?= $mahasiswas['NAMA']?>" >
        </td>
      </tr>

      <tr>
        <td> 
          <label for="ALAMAT">ALAMAT: </label>
        </td>
        <td>
          <input type="text" name="ALAMAT" value="<?= $mahasiswas['ALAMAT']?>" >
        </td>
      </tr>

      <tr> 
        <td>
          <label for="TGL_LAHIR">TGL_LAHIR: </label>
        </td>
        <td>
          <input type="date" name="TGL_LAHIR" value="<?= $mahasiswas['TGL_LAHIR']?>" >
        </td>
      </tr>

      <tr>
        <td> 
          <label for="JK">JK: </label>
        </td>
        <td>
          <input type="text" name="JK" value="<?= $mahasiswas['JK']?>" >
        </td>
      </tr>
      
      <tr>
        <td> 
          <label for="EMAIL">EMAIL: </label>
        </td>
        <td>
          <input type="text" name="EMAIL" value="<?= $mahasiswas['EMAIL']?>" >
        </td>
      </tr>
    </table>
  <button type="submit">SAVE</button>
</form>
</body>
</html>