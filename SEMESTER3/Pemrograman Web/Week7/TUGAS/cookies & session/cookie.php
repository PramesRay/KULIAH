<!DOCTYPE html>
<?php
  function set_cookie($cookie_name, $cookie_value) {
    setcookie($cookie_name, $cookie_value, time() + (10), "/");
  }
?>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Cookies</title>
</head>
<body>
  <?php
    $cookie_name = "user";
    $cookie_value = "Prames Ray Lapian";

    function set_status_cookie($cookie_name, $cookie_value) {
      if(!isset($_COOKIE[$cookie_name])) {
        echo "Cookie named " . $cookie_name . " is not set!";
      } 
      else {
        echo "Cookie ".$cookie_name." is set!<br>";
        echo "Value is: " . $_COOKIE[$cookie_name];
      }
    }

    function delete_cookie($cookie_name, $cookie_value) {
      setcookie($cookie_name, $cookie_value, time() - 3600);
      echo "Cookie $cookie_name is deleted."; 
    }
  
    function status_cookie($cookie_name, $cookie_value) {
      if(count($_COOKIE) > 0) {
        echo "Cookies are enabled.";
      } 
      else {
        echo "Cookies are disabled.";
      }
    }
    
    set_cookie($cookie_name, $cookie_value);
    set_status_cookie($cookie_name, $cookie_value);
    status_cookie($cookie_name, $cookie_value);

  ?>

  <p>
    <strong>Note:</strong> You might have to reload the page to see the value of the cookie.
  </p>

</body>
</html>