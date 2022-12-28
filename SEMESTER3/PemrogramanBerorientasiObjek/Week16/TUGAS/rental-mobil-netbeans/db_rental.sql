-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2022 at 07:06 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_rental`
--

-- --------------------------------------------------------

--
-- Table structure for table `mobil`
--

CREATE TABLE `mobil` (
  `id_mobil` varchar(10) NOT NULL,
  `jenis` varchar(10) NOT NULL,
  `sewa` bigint(20) NOT NULL,
  `stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mobil`
--

INSERT INTO `mobil` (`id_mobil`, `jenis`, `sewa`, `stok`) VALUES
('0001', 'sedan', 200000, 100),
('0002', 'SUV', 300000, 100),
('M1', 'JEEP', 500000, 10),
('M2', 'Mini Bus', 500000, 30);

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `id_pegawai` varchar(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `cp` varchar(30) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `kode` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`id_pegawai`, `nama`, `alamat`, `cp`, `username`, `password`, `kode`) VALUES
('000001', 'dummy name', 'dummy address', 'dummy cp', 'dummy', 'dummy', 0),
('1001', 'test nama pegawai', 'test alamat pegawai', 'test cp pegawai', 'test', 'test', 1),
('21001', 'Oriex Mawan Junior', 'Jatinangor', 'oriexmawanjunior', 'user', 'user', 0),
('210051', 'Satria alief putri hidayat', 'Kampung geulis', 'satriaalief', 'satria', 'satria', 0),
('210059', 'Prames Ray Lapian', 'Jatinangor', 'pramesraylapian', 'admin', 'admin', 1);

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id_pelanggan` varchar(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `cp` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`id_pelanggan`, `nama`, `cp`, `alamat`) VALUES
('000001', 'dummy pelangan', 'dummy cp pelanggan', 'dummy alamat pelanggan'),
('01', 'test nama', 'test cp', 'test alamat');

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `id_peminjaman` varchar(10) NOT NULL,
  `id_pelanggan` varchar(10) NOT NULL,
  `id_mobil` varchar(10) NOT NULL,
  `id_petugas` varchar(10) NOT NULL,
  `tgl_pinjam` date NOT NULL,
  `tgl_hrs_kembali` date NOT NULL,
  `lama` int(11) NOT NULL,
  `telat` int(11) NOT NULL,
  `biaya` bigint(20) NOT NULL,
  `denda` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `peminjaman`
--

INSERT INTO `peminjaman` (`id_peminjaman`, `id_pelanggan`, `id_mobil`, `id_petugas`, `tgl_pinjam`, `tgl_hrs_kembali`, `lama`, `telat`, `biaya`, `denda`) VALUES
('1', '000001', '0001', '000001', '2022-02-22', '2022-02-23', 0, 1, 200000, 100000),
('2', '01', 'M1', '000001', '2021-01-01', '2021-01-03', 2, 3, 500000, 300000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mobil`
--
ALTER TABLE `mobil`
  ADD PRIMARY KEY (`id_mobil`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`id_pegawai`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`id_peminjaman`),
  ADD KEY `FK_idPelanggan` (`id_pelanggan`),
  ADD KEY `FK_idMobil` (`id_mobil`),
  ADD KEY `FK_idPegawai` (`id_petugas`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD CONSTRAINT `FK_idMobil` FOREIGN KEY (`id_mobil`) REFERENCES `mobil` (`id_mobil`),
  ADD CONSTRAINT `FK_idPegawai` FOREIGN KEY (`id_petugas`) REFERENCES `pegawai` (`id_pegawai`),
  ADD CONSTRAINT `FK_idPelanggan` FOREIGN KEY (`id_pelanggan`) REFERENCES `pelanggan` (`id_pelanggan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
