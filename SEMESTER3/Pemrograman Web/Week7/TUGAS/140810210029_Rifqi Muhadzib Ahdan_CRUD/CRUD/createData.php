<?php 
    include_once("config.php");

    if(isset($_POST["Create"])){
        $query = "INSERT INTO identitas VALUES (:npm, :nama, :email, :tgl_lahir, :jk, :alamat)";
        $pQuery = $conn->prepare($query);

        // $pQuery->bindParam(':npm', $_POST["npm"]);
        // $pQuery->bindParam(':nama', $_POST["nama"]);
        // $pQuery->bindParam(':email', $_POST["email"]);
        // $pQuery->bindParam(':tgl_lahir', $_POST["tgl_lahir"]);
        // $pQuery->bindParam(':jk', $_POST["jk"]);
        // $pQuery->bindParam(':alamat', $_POST["alamat"]);
        // $pQuery->execute();

        $pQuery->execute([':npm' => $_POST["npm"],  
                               ':nama' => $_POST["nama"], 
                               ':email' => $_POST["email"], 
                               ':tgl_lahir' => $_POST["tgl_lahir"], 
                               ':jk' => $_POST["jk"], 
                               ':alamat' => $_POST["alamat"]]);
        
        echo "<script>
                window.location.href = 'index.php';
                alert('Data telah berhasil diinput ke database!');
        </script>";
    }
?>