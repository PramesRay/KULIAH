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
    $judul=htmlspecialchars($data["judul"]);
    $penulis=htmlspecialchars($data["penulis"]);
    $tgl_masuk=$data["tgl_masuk"];
    $penerbit=htmlspecialchars($data["penerbit"]);
    $tahun=htmlspecialchars($data["thn_terbit"]);
    $stok=(int)$data["stok"];

    $query="INSERT INTO tb_buku (kode_buku, judul, penulis, tgl_masuk, penerbit, tahun_terbit, stok) 
            VALUES ('$kode','$judul','$penulis','$tgl_masuk','$penerbit','$tahun',$stok);";

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
    $judul=htmlspecialchars($data["judul"]);
    $penulis=htmlspecialchars($data["penulis"]);
    $tgl_masuk=$data["tgl_masuk"];
    $penerbit=htmlspecialchars($data["penerbit"]);
    $tahun=htmlspecialchars($data["thn_terbit"]);
    $stok=(int)$data["stok"];

    $query="UPDATE tb_buku SET
            kode_buku='$kode',
            judul='$judul',
            penulis='$penulis',
            tgl_masuk='$tgl_masuk',
            penerbit='$penerbit',
            tahun_terbit='$tahun',
            stok=$stok
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