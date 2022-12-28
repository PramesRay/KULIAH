<?php
  session_start();
?>

<!DOCTYPE html>
<?php
  function setter_session() {
    if(isset($_POST['Simpan'])) {
      $_SESSION['username'] = $_POST['username'];
      $_SESSION['password'] = $_POST['password'];   
    }
  }

  function confirm_setter_session() {
    if(!isset($_POST['username'])) {
      echo "Session named ".$_POST['username']." is not set!<br>";
    } 
    else if(isset($_POST['username'])) {
      echo "Session ".$_POST['username']." is set!<br>";
    }
  }

  function delete_session() {
    if(isset($_POST['hapus_session'])) {
      $_SESSION['username'] = "";
      $_SESSION['password'] = "";
      echo "Session ".$_POST['username']."is deleted.<br>"; 
    }
  }
?>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Session</title>
</head>
<body align = "center">

  <form method="POST" action="">
		<h2>Example of Session</h2>
		<div>Nama User:</div>
    <?php 
      if(!isset($_SESSION['username'])){
    ?>
        <input type="text" name="username">
        
        <div>Password:</div>
        <input type="password" name="password">
    <?php
      }
      else {
    ?>
    
        <input type="text" name="username" value="<?php echo $_SESSION['username'];?>">
        
        <div>Password</div>
        <input type="password" name="password" value="<?php echo $_SESSION['password'];?>">
    <?php
      }
    ?>

		<div>
			<input type="submit"  name="submit" value="Simpan"/>
			<input type="submit"  name="hapus_session" value="Hapus"/>
		</div>
    
    <div>
      <br>
    </div>
	</form>

  <?php
    setter_session();
    confirm_setter_session();
    delete_session();
  ?>
</body>
</html>