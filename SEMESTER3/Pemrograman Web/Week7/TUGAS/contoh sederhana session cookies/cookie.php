<?php	
	
	// Delete Cookies
	$msg = false;
	if (isset($_POST['hapus_cookie']))
	{
		setcookie('user', '', 0, '/');
		setcookie('pass', '', 0, '/');
		$msg = 'Data cookie berhasil dihapus';
	}

	// Set Cookie 2  hari
	if (isset($_POST['remember']))
	{
		setcookie('user', $_POST['user'], strtotime('+1 days'), '/');
		setcookie('pass', $_POST['pass'], strtotime('+1 days'), '/');
		$msg = 'Data cookie berhasil disimpan';
	}
?>
<html>
<head>
	<title>Contoh Cookie Pada PHP</title>
	
</head>
<body align="center">

	<form method="post" action="">
		<h3>Contoh Cookies</h3>
		<?php 
			if ($msg) {
				echo $msg ;
			}
		?>
		<div>Nama User</div>
		<?php if(!isset($_COOKIE['user'])){
         ?>
           <input type="text" name="user">
           <div>Password</div>
		   <input type="password" name="pass">
        <?php
         }
          else
        {
        ?>
          <input type="text" name="user" value="<?php echo $_COOKIE['user'];?>">
          <div>Password</div>
		  <input type="password" name="pass" value="<?php echo $_COOKIE['pass'];?>">
        <?php
        }
        ?>
		
		<div>
			<input type="checkbox" name="remember"/>
			<label> Remember</label>
		</div>
		<div>
			<input type="submit"  name="submit" value="Simpan"/>
			<input type="submit"  name="hapus_cookie" value="Hapus Cookie"/>
		</div>
	</form>
</body>
</html>