<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Form Identitas Mahasiswa</title>

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
    <h1>Form Identitas Mahasiswa</h1>
    
    <form action="hasil" method="post">
      {{ csrf_field() }}
      <table id="table">
      <thead>
        <th>NPM</th>
        <th>NAMA</th>
        <th>JK</th>
        <th>EMAIL</th>
      </thead>

      <tbody>
        <tr>
          <td>
            <input required type="number" name="npm"><br>
          </td>
          <td>
            <input required type="text" name="nama"><br>
          </td>
          <td>
            <label><input required type="radio" name="jk" value="L"> Laki-Laki</label>
            <label><input required type="radio" name="jk" value="P"> Perempuan</label><br>
          </td>
          <td>
            <input required type="email" name="email">
          </td>
        </tr>
      </tbody>
    </table>
    <input type="submit" value="Submit" name="submit">
    </form>
  </body>
</html>
