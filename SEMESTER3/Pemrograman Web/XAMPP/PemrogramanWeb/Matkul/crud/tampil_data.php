<html>
<head>
	<title>DAFTAR MAHASISWA</title>
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css"> 
     <script src="vendor/jquery/jquery.min.js"></script>
     <script src="vendor/bootstrap/js/bootstrap.min.js"></script>    
     <script src="vendor/bootstrap/js/bootstrap-datepicker.min.js" type="text/javascript"></script>
     <link href="vendor/bootstrap/css/bootstrap-datepicker.min.css" rel="stylesheet" type="text/css"/>
</head>
<body>     
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top">
    <div class="container">
      <a class="navbar-brand" href="#">DATA MAHASISWA</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
    </div>
  </nav>
<div class="container"> 
  <div class="card mt-5">
   <div class="card-header bg-dark text-white"><h6>DAFTAR MAHASISWA</h6></div>
     <div class="card-body ml-3">
    <?php
     include "koneksi.php";     
    //tampilkan data  
     $sql = "SELECT * FROM identitas";
    $result = $conn->query($sql);
   ?>     
    <tbody>       
    <table class="mt-3 table table-bordered">
		<thead class="thead-dark">
			<tr>
				<th>No</th>
				<th>NPM</th>
				<th>NAMA</th>
                <th>ALAMAT</th>
                <th>JK</th>
                <th>TGL LAHIR</th>
                <th>EMAIL</th>
                <th>AKSI</th>
			</tr>
		</thead>
		<tbody>
         <?php 
          if ($result->num_rows > 0) {
             // output data of each row
             $no=0;
             while($row = $result->fetch_assoc()) {
             	$no++;
                 $tgl = date('d-m-Y',strtotime($row['TGL_LAHIR']));
                 ?>
                     <tr>
                        
         				<td><?php echo $no;?></td>
         				<td><?php echo $row["NPM"];?></td>
         				<td><?php echo $row["NAMA"];?></td>
                <td><?php echo $row["ALAMAT"];?></td>
                <td><?php echo $row["JK"];?></td> 
                <td><?php echo $tgl;?></td> 
                <td><?php echo $row["EMAIL"];?></td> 
                <td><button class="btn-xs btn-success" href="/mhs/edit/{{$row->NPM}}">Edit</button>
                    <button class="btn-xs btn-danger" onClick="return confirm('Apakah anda yakin akan menghapus {{$row->NPM}}')">Hapus</button>
                </td>
         			</tr>
             <?php        
             }
         } else {
             echo "0 results";
         }
         
         $conn->close();
         ?>
             </tbody>
             </table>
              <form action="input_data.php" method="post">
              <input type="submit" class="btn btn-primary" value="Input Data" name="logout">
             </form> 
             </div>      
  
      </div>
    </div>    
  
</body>
</html>

