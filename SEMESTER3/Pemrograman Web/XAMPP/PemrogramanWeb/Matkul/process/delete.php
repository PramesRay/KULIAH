<?php

require "../sql.php";

$invalid=false;
$kodeBuku=$_GET["kode"];

if(delete($kodeBuku)) {
    header("Location: ../index.php");
} else {
    $invalid=true;
}

?>

<link rel="stylesheet" href="../assets/bootstrap/css/bootstrap.css">

<?php if($invalid) : ?>
    <div class="bg-danger">
        <p class="text-light">Invalid Delete</p>
        <button onclick="location.href='../index.php'" class="btn btn-warning">Home</button>
    </div>
<?php endif; ?>

<script src="../assets/bootstrap/js/bootstrap.js"></script>