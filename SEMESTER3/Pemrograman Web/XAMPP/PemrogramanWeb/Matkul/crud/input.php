<?php        
include "koneksi.php"; 

//input data
if(isset($_POST['submit']))
{   
 $npm=$_POST['NPM'];
 $nama=$_POST['NAMA'];
 $alamat=$_POST['ALAMAT'];
 if (isset($_POST['JK']))
 {
   $jk=$_POST['JK'];     
  } 
 
 $tgl = date('Y-m-d',strtotime($_POST['TGL_LAHIR']));    
 $email=$_POST['EMAIL'];
 
 if((!empty($npm)) && (!empty($nama)))  
  {     
   $sql = "INSERT INTO identitas VALUES ('$npm', '$nama', '$alamat','$jk','$tgl','$email')";
   if ($conn->query($sql) === TRUE) {
       // redirect ke halaman tampil data
       header("Location: tampil_data.php");
   } else {
       echo "Error: " . $sql . "<br>" . $conn->error;
   }
  }
    else
    {
      echo "npm dan nama tidak boleh kosong";     
    }
}
$conn->close();

?>

