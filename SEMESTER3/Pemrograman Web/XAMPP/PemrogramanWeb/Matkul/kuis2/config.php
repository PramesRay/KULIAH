<?php

$server="localhost";
$username="root";
$password="";
$database="dbperpus"; // Ganti sesuai dengan nama database

$conn=new mysqli($server, $username, $password, $database);

if($conn->connect_error) {
    die("Connection error: " . $conn->connect_error);
}

/**
 * insert
 * Fungsi untuk memasukkan data ke dalam tabel
 * Dalam kasus ini ada database mahasiswa dengan tabel identitas
 * 
 * @param data
 * Data yang bakalan diupdate pada tabel
 * isi sesuai dengan kolom tabel yang ingin dimasukkan
 */
function insert($data) {
    global $conn;

    $kode=htmlspecialchars($data["kode_buku"]);
    $Judul=htmlspecialchars($data["Judul"]);
    $Penulis=htmlspecialchars($data["Penulis"]);
    $tgl_masuk=$data["tgl_masuk"];
    $Penerbit=htmlspecialchars($data["Penerbit"]);
    $tahun=htmlspecialchars($data["thn_terbit"]);
    $Stok=(int)$data["Stok"];

    $query="INSERT INTO tb_buku (kode_buku, Judul, Penulis, tgl_masuk, Penerbit, tahun_terbit, Stok) 
            VALUES ('$kode','$Judul','$Penulis','$tgl_masuk','$Penerbit','$tahun',$Stok);";

    return $conn->query($query);
}

/**
 * update
 * Fungsi untuk mengubah data yang sudah ada pada tabel
 * 
 * @param id 
 * Primary key yang ingin diubah datanya
 * 
 * @param data
 * Data yang bakalan diupdate pada tabel
 */
function update($id,$data) {
    global $conn;

    $kode=htmlspecialchars($data["kode_buku"]);
    $Judul=htmlspecialchars($data["Judul"]);
    $Penulis=htmlspecialchars($data["Penulis"]);
    $tgl_masuk=$data["tgl_masuk"];
    $Penerbit=htmlspecialchars($data["Penerbit"]);
    $tahun=htmlspecialchars($data["thn_terbit"]);
    $Stok=(int)$data["Stok"];

    $query="UPDATE tb_buku SET
            kode_buku='$kode',
            Judul='$Judul',
            Penulis='$Penulis',
            tgl_masuk='$tgl_masuk',
            Penerbit='$Penerbit',
            tahun_terbit='$tahun',
            Stok=$Stok
            WHERE kode_buku='$id';";
            
    return $conn->query($query);
}

/**
 * delete
 * Fungsi untuk menghapus data yang sudah ada pada tabel
 * 
 * @param id
 * Primary key yang ingin dihapus pada database
 */
function delete($id) {
    global $conn;

    $query="DELETE FROM tb_buku WHERE kode_buku='$id';";
    return $conn->query($query);
}

?>