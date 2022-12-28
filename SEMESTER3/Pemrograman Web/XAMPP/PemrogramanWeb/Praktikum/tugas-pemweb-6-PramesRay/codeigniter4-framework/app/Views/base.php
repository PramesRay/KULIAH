<!DOCTYPE html>
<html lang="en">
  
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
    rel="stylesheet" integrity="sha384-1BmE4kWBq781YhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <style>
      body{
        font-family: 'Courier New', Courier, monospace;
      }
      td{
        padding:5px;
      }

      a{
        text-decoration: none;
        color: black;
      }

      a:hover{
        font-size: 20px;
        transition: .1s ease-in;
      }

      table{
        margin-left: auto;
        margin-right: auto;
      }

      .center{
        align-self: center;
      }
    </style>
    <title>DAFTAR TUGAS PRAKTIKUM PEMROGRAMAN WEB</title>
  </head>
  <body>
    <div class="container">
      <table border="1" style="width: 700px;">
        <tr>
          <td align="center" colspan="3" bgcolor="grey">
            <font color="black" size="20px">
              <b>BIODATA</b>
            </font>
          </td>
        </tr>
        <tr>
          <td rowspan="5" width="100px">
            <img src="https://api.himatif.org/data/assets/foto/2021/140810210059.jpg" width="150px" height="200px" border="2">
          </td>
          <td bgcolor="lightgrey"> NAMA </td>
          <td> Prames Ray Lapian </td>
        </tr>
        <tr>
          <td bgcolor="lightgrey"> NPM </td>
          <td> 140810210059 </td>
        </tr>
        <tr>
          <td bgcolor="lightgrey"> ANGKATAN </td>
          <td> 2021 </td>
        </tr>
        <tr>
          <td align="center" colspan="2" bgcolor="lightgrey" style="font-size:30px"> <strong> PRAKTIKUM PEMROGRAMAN WEB </strong> </td>
        </tr>
      </table> 
    </div>

<hr>
<h1>[DAFTAR TUGAS]</h1>
    <div class="center">
      <?= $this->include('/navbar'); ?>
    </div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" 
      integrity="sha384-ka7Sk@Gln4gmtz2MlQnikT1wXgYs0g+0MhuP+ILRH9SENBOOLRn5q+8nbTov4+1p" 
      crossorigin="anonymous">
    </script>
  </body>
</html>