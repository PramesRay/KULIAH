<!-- 
    Nama  : Prames Ray Lapian
    NPM   : 140810210059
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
  <title>Tugas Pertemuan 6</title>
  <style>
    body{
      background-color:rgb(255, 200, 0);
      font-family: hack;
    }

    .center{
      text-align: center;
    }

    .table{
      margin-left: auto;
      margin-right: auto;
      
    }

    table, th, tbody, tr, td{
      border: 1px solid;
      padding: 10px;
      border-radius: 3px;
    }
    
    th{
      background-color:rgb(80, 80, 80);
      color:white;
    }
    
    button{
      border-radius: 5px;
      border:1px solid;
      padding:10px;
      display:grid;
      place-items:center;
      float: right;
      margin-right: 26%;
    }

    tbody>tr:hover{
      background-color:rgb(250, 189, 0);
      transition: 0.1s ease-in-out;
    }
  </style>

</head>
<body>
  <h1 class="center">DATABASE MAHASISWA</h1>
  <h3 class="center">- Universitas Padjadjaran -</h3>

  <br>
  <br>

  <table class="center table"> 
    <thead>
        <tr>
            <th>NPM</th>
            <th>NAMA</th>
            <th>JURUSAN</th>
            <th>ANGKATAN</th>
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
              echo "<td>".$row['JURUSAN']."</td>";	
              echo "<td>".$row['ANGKATAN']."</td>";	
            echo "</tr>";	
          }
        }
      ?>
    </tbody>
</table>
</body>
</html>