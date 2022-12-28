<?php
    $host = "localhost";
    $database = "mhs";
    $user = "root";
    $password = "";
 
    $dsn = "mysql:host=$host;dbname=$database";

    try {
        $conn = new PDO($dsn, $user, $password);
        $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    } catch (PDOException $e) {
        echo($e->getMessage());
        echo("Gagal terhubung ke database");
    }   
?>