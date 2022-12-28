<?php
    $host = "localhost";
    $database = "ticket_event";
    $user = "root";
    $password = "";
 
    // Create connection
    $conn = new mysqli($host, $user, $password, $database);
    // Check connection
    if ($conn->connect_error){
        die("Connection failed: " . $conn->connect_error);
    } 
    //echo "Connected successfully";
?>