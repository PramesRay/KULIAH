<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Create Transaction</title>
</head>
<body>
  <h1>Create Transaction</h1>

  <br><br><br>

  <form action="/" method="post">
    <table>
      <tr>
        <td> 
          <label for="NPM">NPM: </label>
        </td>
        <td>
          <input type="number" name="NPM" required>
        </td>
      </tr>

      <tr>
        <td> 
          <label for="NAMA">NAMA: </label>
        </td>
        <td>
          <input type="text" name="NAMA" required>
        </td>
      </tr>

      <tr>
        <td> 
          <label for="ALAMAT">ALAMAT: </label>
        </td>
        <td>
          <input type="text" name="ALAMAT" >
        </td>
      </tr>

      <tr> 
        <td>
          <label for="TGL_LAHIR">TGL_LAHIR: </label>
        </td>
        <td>
          <input type="date" name="TGL_LAHIR" required>
        </td>
      </tr>

      <tr>
        <td> 
          <label for="JK">JK: </label>
        </td>
        <td>
          <input type="text" name="JK" required>
        </td>
      </tr>
      
      <tr>
        <td> 
          <label for="EMAIL">EMAIL: </label>
        </td>
        <td>
          <input type="text" name="EMAIL" required>
        </td>
      </tr>
    </table>
    <button type="submit">SAVE</button>
  </form>

  </body>
</html>