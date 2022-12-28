<?php	
session_start();

	if (!isset($_SESSION['username'])){
        header("Location: login.php");
    }

     if(isset($_POST['submit']))
        {
         $_SESSION['username'] = $_POST['username'];
        }
        
?>
<html>
<head>
	<title>Autentification Using Session</title>
	
</head>
<body align="center">	
  <h2>Welcome to index, <?php echo $_SESSION['username'];?>!</h2>
  <form action="logout.php" method="POST">
    <p?>Nothing u can do here, so sorry...</p>
    <input type="submit" name="logout" value="Logout">
  </form>
</body>
</html>