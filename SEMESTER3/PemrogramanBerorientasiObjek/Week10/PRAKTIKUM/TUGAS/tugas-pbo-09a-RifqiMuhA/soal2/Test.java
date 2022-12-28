/*
* Nama      : Rifqi Muhadzib Ahdan
* NPM       : 140810210029
* Kelas     : A
* Tanggal   : 12 November 2022
* Deskripsi : Generic Method
* ===GENERIC===
* > Generic merupakan cara Java dalam melakukan generalisasi terhadap tipe data tanpa
*   mengurangi kemampuan Java dalam menjaga keamanan penggunaan tipe data.
* > Hal ini memudahkan programmer karena tidak perlu satu-persatu melakukan casting tipe individu yang panjang.
* ===METHOD GENERIC===
* Generic method dapat dipanggil dengan tipe argumen berbeda berdasarkan tipe argumen
*/
import java.util.Scanner;

class Person{
    protected String nama;
    static int jumlahPerson = 0;
    
    public Person() {
        this.nama = "";
        jumlahPerson++;
    }

    public Person(String nama) {
        this.nama = nama;
        jumlahPerson++;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

class Mahasiswa extends Person{
    private String npm;
    
    public Mahasiswa() {
        super();
        this.npm = "";
    }
    
    public Mahasiswa(String nama, String npm) {
        super(nama);
        this.npm = npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNpm() {
        return this.npm;
    }

    @Override
    public String toString() {
        return "Nama\t: " + this.nama + "\n" + "Npm\t: " + this.npm + "\n";
    }    
}

class Dosen extends Person{
    private String npd;
    
    public Dosen() {
        super();
        this.npd = "";
    }

    public Dosen(String nama, String npd) {
        super(nama);
        this.npd = npd;
    }

    public String getNpd() {
        return npd;
    }

    public void setNpd(String npd) {
        this.npd = npd;
    }

    @Override
    public String toString() {
        return "Nama\t: " + this.nama + "\n" + "Npd\t: " + this.npd + "\n";
    }
}

public class Test{
    public static void main(String[] args) {
       // Contoh 1
        Mahasiswa mhs = new Mahasiswa("Rifqi Muh A", "140810210029");
        Dosen dsn = new Dosen("Akmal Sur", "210132000001");
        Person[] personArr = new Person[2];
        personArr[0] = mhs;
        personArr[1] = dsn;
        
        display(personArr);
    }

    /*
     * @Param
     *  elements : Tipe array data generic yang menyimpan data dalam tipe data yang fleksibel 
     *             Di mana tipe data generic yang diperbolehkan dipersempit menjadi tipe data yang meng-extends class Person (bounded type parameter)
     * @Desc
     *  Meng-output nama class dan method toString dari tiap class yang ada di array T
     */
    public static <T extends Person> void display(T[] elements){
        int i = 1;
        System.out.println("\n===Hasil output array dengan generic type===\n");
        System.out.println("Jumlah Person = " + Person.jumlahPerson + "\n");
        for (T elm : elements) {
            System.out.println("Person ke-" + i++);
            System.out.println("Status\t: " + elm.getClass().getName());
            System.out.println(elm);
        }
    }
}
