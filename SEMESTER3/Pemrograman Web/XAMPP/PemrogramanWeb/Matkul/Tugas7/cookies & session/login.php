<?php	
session_start();

	if (isset($_SESSION['username']))
    {
       header("Location: index.php");
    }
?>
<html>
<head>
	<title>Autentification Using Session</title>
	
</head>
<body align="center">

	<form method="POST" action="index.php">
		<h1>Autentification Using Session</h1>
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