<?php
session_start();

if (isset($_SESSION['npm'])) {
  if ($_SESSION['level'] == 1) {
    header("Location: index.php");
  } else if($_SESSION['level'] == 2){
    header("Location: index_user.php");
  }
}
?>

<html>
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

	<form method="POST" action="validation.php">
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
</html>