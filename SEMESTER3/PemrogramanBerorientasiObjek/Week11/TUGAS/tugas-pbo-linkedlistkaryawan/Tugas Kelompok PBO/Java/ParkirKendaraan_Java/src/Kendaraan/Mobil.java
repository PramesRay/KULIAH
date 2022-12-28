/*
* Nama          : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
* NPM           : 140810210015 , 140810200042 , 140810210059 , 140810210039
* Kelas         : A
* Tanggal       : 16 November 2022
* Nama Program  : Mobil.java
* Deskripsi     : Soal parkir - class mobil list
*/
package Kendaraan;

public class Mobil extends Kendaraan {
    public Mobil(){
        super();
        this.jenis = "Mobil";
    }

    @Override
    public int getBiayaParkir() {
        return getLamaJam() * 3000;
    }
    
}
