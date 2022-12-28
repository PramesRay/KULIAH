<?php	
session_start();

	if (isset($_SESSION['user']))
    {
       header("Location: home.php");
    }
?>
<html>
<head>
	<title>Contoh Session Pada PHP</title>
	
</head>
<body align="center">

	<form method="post" action="home.php">
		<h3>Contoh Session</h3>
		<div>Nama User</div>		
           <input type="text" name="user">
        <div>Password</div>
		   <input type="password" name="pass">	
		<div>
			<input type="submit"  name="submit" value="Login"/>
		</div>
	</form>
</body>
</html>