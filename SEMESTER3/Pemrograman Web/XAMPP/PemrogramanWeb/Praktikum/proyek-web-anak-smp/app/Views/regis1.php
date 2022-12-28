<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="/style.css" />
  <title>REGISTRATION</title>
</head>

<body>
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
        <li><a href="/detail">DETAIL EVENT</a></li>
        <li><a href="/regis" class="active">REGISTRATION</a></li>
        <li><a href="/about">ABOUT US</a></li>
      </ul>
    </nav>

    <div>
      <div class="wrapper-body">
        <h1>REGISTRATION</h1>
        <form action="/add1" method="post">
          <table>
            <br><br><br><br><br><br><br><br>

            <tr style="color: white;">
              <td>
                <label>NPM :</label><br>
              </td>
              <td>
                <input required type="text" name="NPM"><br>
              </td>
            </tr>
            <tr style="color: white;">
              <td>
                <label>NAMA :</label><br>
              </td>
              <td>
                <input required type="text" name="NAMA"><br>
              </td>
            </tr>
            <tr style="color: white;">
              <td>
                <label>Alamat :</label><br>
              </td>
              <td>
                <textarea required rows="3" name="ALAMAT"></textarea><br>
              </td>
            </tr>
            <tr style="color: white;">
              <td>
                <label>Jenis Kelamin :</label><br />
              </td>
              <td>
                <label class="radio-inline"><input type="radio" name="JK" value="L"> Laki-Laki</label>
                <label class="radio-inline"><input type="radio" name="JK" value="P"> Perempuan</label><br>
              </td>
            </tr>
            <tr style="color: white;">
              <!-- Date input -->
              <td>
                <label>Tanggal Lahir :</label><br>
              </td>
              <td>
                <input required class="form-control datepicker" name="TGL_LHR" placeholder="YYYY-MM-DD" type="date">
              </td>
            </tr>
            <tr style="color: white;">
              <td>
                <label>Alamat Email :</label><br>
              </td>
              <td>
                <input required type="text" name="EMAIL">
              </td>
            </tr>
            <hr>
            <td>
              <input type="submit" class="submitCenter" value="Next" name="submit">
            </td>
          </table>
        </form>
      </div>
    </div>
  </div>
  <!-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------- -->
  <script src="external.js"></script>
</body>

</html>