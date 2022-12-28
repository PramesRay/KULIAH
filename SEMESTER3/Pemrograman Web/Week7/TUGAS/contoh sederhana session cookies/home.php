<?php	
session_start();

	if (!isset($_SESSION['user'])){
        header("Location: session.php");
    }

     if(isset($_POST['submit']))
        {
         $_SESSION['user']=$_POST['user'];
        }
        
?>
<html>
<head>
	<title>Contoh Session Pada PHP</title>
	
</head>
<body align="center">	
		<h3>Selamat Datang</h3>
        <?php echo $_SESSION['user'];?>
    
    <form action="logout.php" method="post">
    
    <input type="submit" name="logout" value="Logout">
    
    </form>
    
    
</body>
</html>