<!DOCTYPE html>
<?php
  //setter cookie
  function setter_cookie() {
    if(isset($_POST['Simpan'])) {
      setcookie('username', "", time() + (3600), "/");
      setcookie('password', "", time() + (3600), "/");
    }
  }

  //confirm setter cookie
  function confirm_setter_cookie() {
    if(!isset($_POST['username'])) {
      echo "Cookie named ".$_POST['username']." is not set!<br>";
    } 
    else if(isset($_POST['username'])) {
      echo "Cookie ".$_POST['username']." is set!<br>";
    }
  }

  //delete cookie
  function delete_cookie() {
    if(isset($_POST['hapus_cookie'])) {
      echo "Deleting cookie ".$_POST['username']."<br>"; 
      setcookie('username', "", time() - 3600);
      setcookie('password', "", time() - 3600);
      echo "Cookie ".$_POST['username']."is deleted.<br>"; 
    }
  }

  //status cookie
  function status_cookie() {
    if(count($_COOKIE) > 0) {
      echo "Cookies ".$_POST['username']." are enabled.<br>";
    } 
    else {
      echo "Cookies ".$_POST['username']." are disabled.<br>";
    }
  }
  
?>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Cookies</title>
  <style>
    body {
      text-align: center;
    }
  </style>
</head>
<body>
  <form method="POST" action="">
		<h2>Example of Cookies</h2>
		<div>Nama User:</div>
    <?php 
      if(!isset($_COOKIE['username'])){
    ?>
        <input type="text" name="username">
        
        <div>Password:</div>
        <input type="password" name="password">
    <?php
      }
      else {
    ?>
    
        <input type="text" name="username" value="<?php echo $_COOKIE['username'];?>">
        
        <div>Password</div>
        <input type="password" name="password" value="<?php echo $_COOKIE['password'];?>">
    <?php
      }
    ?>

		<div>
			<input type="submit"  name="submit" value="Simpan"/>
			<input type="submit"  name="hapus_cookie" value="Hapus"/>
		</div>
	</form>

  <p>
    <strong>Note:</strong> You might have to reload the page to see the value of the cookie.
  </p>

  <?php
    setter_cookie(); 
    confirm_setter_cookie(); 
    delete_cookie(); 
    status_cookie(); 
  ?>

</body>
</html>