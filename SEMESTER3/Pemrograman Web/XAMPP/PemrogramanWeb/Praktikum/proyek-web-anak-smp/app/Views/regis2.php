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
        <form action="/add2" method="post">
          <table>
            <br><br><br><br><br><br><br><br>

            <tr>
              <td style="color: white;">
                <label>NPM :</label><br>
              </td>
              <td>
                <input type="text" value="<?php echo $_REQUEST["NPM"];?>" name="NPM ">
              </td>
            </tr>
            <tr>
              <td style="color: white;">
                <label>Kategori Tiket :</label><br>
              </td>
              <td>
                <select name="KATEGORI">
                  <option value="VIP">VIP</option>
                  <option value="regular">Regular</option>
                </select>
              </td>
            </tr>
            <tr>
              <td style="color: white;">
                <label>Cabang Lomba :</label><br>
              </td>
              <td>
                <select name="LOMBA">
                  <option value="Valorant">Valorant               </option>
                  <option value="ML">Mobile Legend                </option>
                  <option value="PUBG">Player Unknown Battleground</option>
                  <option value="DOTA">DOTA 2                     </option>
                </select>
              </td>
            </tr>
            <hr>
            <td>
              <input type="submit" class="submitCenter" value="Submit" name="submit">
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