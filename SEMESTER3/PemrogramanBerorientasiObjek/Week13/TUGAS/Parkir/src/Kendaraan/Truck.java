/*
* Nama          : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
* NPM           : 140810210015 , 140810200042 , 140810210059 , 140810210039
* Kelas         : A
* Tanggal       : 16 November 2022
* Nama Program  : ElementList.java
* Deskripsi     : Soal parkir - class Truck
*/
package Kendaraan;

public class Truck extends Kendaraan {
    public Truck(){
        super();
        this.jenis="Truck";
    }

    @Override
    public int getBiayaParkir() {
        return getLamaJam() * 10000;
    }
    
}
