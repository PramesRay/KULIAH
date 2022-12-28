/*
* Nama      : Rifqi Muhadzib Ahdan
* NPM       : 140810210029
* Kelas     : A
* Tanggal   : 12 November 2022
* Deskripsi : EnumSet 
Kelas EnumSet menyediakan satu set implementasi elemen dari satu dimensi enum.
EnumSet meng-implements Set

Tidak seperti implementasi set lainnya, EnumSet tidak memiliki konstruktor public. 
Harus digunakan method yang telah ditentukan sebelumnya untuk membuat kumpulan enum, antara lain :
1. Menggunakan method allOf()
2. Menggunakan method noneOf()
3. Menggunakan method range(e1, e2).
4. Menggunakan method of()
4. Menggunakan method complementOf()

Beberapa method EnumSet:
- add() 
- remove()
- clone()
*/
import java.util.EnumSet;

enum Matkul{
    ALIN, MATDISK, PBO, 
    ALPRO, KALKULUSII, SISDATI, 
    OKK, PKN
}

public class EnumSetTest{
    public static void main(String[] args) {
        EnumSet<Matkul> allMatkul = EnumSet.allOf(Matkul.class);
        EnumSet<Matkul> matkulSem2 = EnumSet.range(Matkul.ALPRO, Matkul.SISDATI);
        EnumSet<Matkul> matkulSem3 = EnumSet.complementOf(matkulSem2);
        matkulSem3.remove(Matkul.OKK);
        matkulSem3.remove(Matkul.PKN);
        EnumSet<Matkul> matkulTaken = EnumSet.of(Matkul.PBO, Matkul.ALIN, Matkul.OKK, Matkul.ALPRO);
        matkulTaken.add(Matkul.SISDATI);

        System.out.println("===Daftar Semua Matkul===");
        System.out.println(allMatkul +"\n");
        System.out.println("===Matkul Semester 2===");
        System.out.println(matkulSem2+"\n");
        System.out.println("===Matkul Semester 3===");
        System.out.println(matkulSem3+"\n");
        System.out.println("===Matkul yang Telah diambil===");
        System.out.println(matkulTaken+"\n");
    }
}
