/*
* Nama      : Prames Ray Lapian
* NPM       : 140810210059
* Kelas     : A
* Tanggal   : 12 November 2022
* Deskripsi : EnumSet 

[PENJELASAN]
-> EnumSet merupakan class yang menyediakan satu set implementasi elemen dari satu dimensi enum. 
-> EnumSet meng-implements Set
-> EnumSet tidak memiliki konstruktor public
-> Untuk membuat Enum harus menggungakan method yang telah ditentukan, yaitu:
    - allOf()
    - noneOf()
    - range(e1, e2)
    - of()
    - complementOf()

    -> Method EnumSet:
    - add() 
    - remove()
    - clone()
*/

import java.util.EnumSet;

enum Kendaraan{
    Sedan, SUV, MPV, OffRoad,
    Pickup, Engkel, Tronton, Trailer,
    Sport, Naked, Trail, Cruiser, Scutter
}

public class EnumSetTest{
    public static void main(String[] args) {
        EnumSet<Kendaraan> allKendaraan = EnumSet.allOf(Kendaraan.class);
        EnumSet<Kendaraan> kendaraanMobil = EnumSet.range(Kendaraan.Sedan, Kendaraan.OffRoad);
        EnumSet<Kendaraan> kendaraanMotor = EnumSet.range(Kendaraan.Sport, Kendaraan.Scutter);
        EnumSet<Kendaraan> kendaraanTruk = EnumSet.range(Kendaraan.Pickup, Kendaraan.Trailer);
        
        kendaraanMobil.remove(Kendaraan.OffRoad);
        
        EnumSet<Kendaraan> kendaraanSaya = EnumSet.of(Kendaraan.Scutter);
        kendaraanSaya.add(Kendaraan.Sport);

        System.out.println("[Daftar Jenis-Jenis Kendaraan]");
        System.out.println(allKendaraan +"\n");
        System.out.println("[Mobil]");
        System.out.println(kendaraanMobil + "\n");
        System.out.println("[Truk]");
        System.out.println(kendaraanTruk + "\n");
        System.out.println("[Motor]");
        System.out.println(kendaraanMotor + "\n");
    }
}
