<?php
include "config.php";
session_start();
if (isset($_SESSION['npm'])) {
  echo "test";
  if ($_SESSION['level'] == 1) {
    header("Location: index.php");
  } else if ($_SESSION['level'] == 2) {
    header("Location: index_user.php");
  } else {
    header("Location: login.php");
  }
} else {
  if ($_POST['username'] != "" || $_POST['password'] != "") {
    $username = $_POST['username'];
    $password = $_POST['password'];

    $sql = "SELECT * FROM users WHERE username=? AND pas=? ";
    $query = $conn->prepare($sql);
    $query->execute(array($username, $password));
    $row = $query->rowCount();
    $fetch = $query->fetch();

    if ($row > 0) {
      $_SESSION['level'] = $fetch["level"];
      $_SESSION['npm'] = $fetch["npm"];
      if ($fetch["level"] == 1) {
        header("location: index.php");
      } else if ($fetch["level"] == 2) {
        header("location: index_user.php");
      }
    }
  } else {
    echo "
    <script>alert('Invalid username or password')</script>
    <script>window.location = 'login.html'</script>
    ";
  }
}
?>
<!-- <html>
<head>
	<title>LOGIN PAGE</title>
  
  <style>
     body{
      background-color:rgb(255, 200, 0);
      font-family: hack;
    }
  </style>
</head>
<body align="center">

	<form method="POST" action="index.php">
		<h1>Login dulu donggg...</h1>
		<div>Username:</div>		
      <input type="text" name="username">
    
    <div>Password:</div>
		  <input type="password" name="password">	
		
    <div>
			<input type="submit"  name="submit" value="Login"/>
		</div>
	</form>
</body>
</html> -->