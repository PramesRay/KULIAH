<?php
session_start();

if (isset($_POST['logout'])) {
  unset($_SESSION['npm']);
  header('Location: login.php');
}
