<!-- 
    Nama  : Rifqi Muhadzib Ahdan
    NPM   : 140810210029
    Kelas : A
 -->
<?php 
    include("config.php");
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./assets/css/style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    <title>Daftar Mahasiswa</title>
</head>
<body>
    <div class="box">
        <img src="./assets/img/unpad.png" alt="himatif" class="logo" >
        <div class="header satu center">
            Data Mahasiswa
        </div>
        <div class="header dua center">
            Universitas Padjadjaran
        </div>
        <button class="btn-custom create mb-3" type="submit" id="submit" onclick="location.href='createData.html'">Create Data</button>
        <table class="center"> 
            <thead>
                <tr id="header">
                    <th>NPM</th>
                    <th>NAMA</th>
                    <th>ALAMAT</th>
                    <th>TANGGAL LAHIR</th>
                    <th>JENIS KELAMIN</th>
                    <th>EMAIL</th>
                    <th>ACTION</th>
                </tr>
            </thead>
            <tbody>
                <?php 
                    $query = "SELECT * FROM identitas";
                    $statement = $conn->prepare($query);
                    $statement->execute();
                    $result = $statement->fetchAll(PDO::FETCH_ASSOC);
                    if($result){
                        foreach ($result as $row) {
                            echo "<tr>";
                            echo "<td>".$row['NPM']."</td>";
                            echo "<td>".$row['NAMA']."</td>";
                            echo "<td>".$row['ALAMAT']."</td>";	
                            echo "<td>".date('d-m-Y', strtotime($row['TGL_LAHIR']))."</td>";	
                            echo "<td>".$row['JK']."</td>";	
                            echo "<td>".$row['EMAIL']."</td>";	
                            echo "<td><a href=\"editData.php?npm=$row[NPM]\">Edit</a> | <a href=\"deleteData.php?npm=$row[NPM]\" onClick=\"return confirm('Apakah anda yakin untuk delete?')\">Delete</a></td>";	
                            echo "</tr>";	
                        }
                    }
                ?>
                
            </tbody>
        </table>
    </div>
</body>
</html>