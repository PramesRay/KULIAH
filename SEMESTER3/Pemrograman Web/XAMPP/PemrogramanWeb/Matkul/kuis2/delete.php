<?php

require "config.php";

$invalid=false;
$kodeBuku=$_GET["kode"];

if(delete($kodeBuku)) {
    header("Location: index.php");
} else {
    $invalid=true;
}

?>
<?php if($invalid) : ?>
    <div>
        <p>Invalid Delete</p>
        <button onclick="location.href='index.php'">Home</button>
    </div>
<?php endif; ?>