/*
* Nama          : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
* NPM           : 140810210015 , 140810200042 , 140810210059 , 140810210039
* Kelas         : A
* Tanggal       : 16 November 2022
* Nama Program  : Motor.java
* Deskripsi     : Soal parkir - class Motor
*/
package Kendaraan;

public class Motor extends Kendaraan {
    public Motor(){
        super();
        this.jenis="Motor";
    }

    @Override
    public int getBiayaParkir() {
        return getLamaJam() * 2000;
    }    
    
}
