/*
* Nama      : Rifqi Muhadzib Ahdan
* NPM       : 140810210029
* Kelas     : A
* Tanggal   : 12 November 2022
* Deskripsi : Vector - Penggunaan method pada vector dan method sort pada set Collection berdasarkan Comparator
* ===DESCRIPTION===
* > Vector seperti array dinamis yang dapat memperbesar atau memperkecil ukurannya.
* > Tidak seperti array, vector dapat menyimpan n-jumlah elemen di dalamnya karena tidak ada batasan ukuran.
* > Vector meng-implements List
* > Constructor :
* 1. Vector(): Membuat default vector dengan initial capacity adalah 10
* 2. Vector(int size): Membuat default vector dengan capacity sebesar size
* 3. Vector(int size, int incr): Membuat default vector dengan capacity sebesar size. Setiap size sudah penuh, size akan diperbesar sebesar incr
* 4. Vector(Collection c): Membat vector yang mana isi elementnya adalah element dari collection c
* > Beberapa method :
* 1. clone() : meng-copy semua element
* 2. add(E e) : menambahkan sebuah element ke vector
* 3. get(int index) : mengambil element di vector berdasarkan index
* 4. isEmpty() : cek apakah vector kosong atau tidak
*/
import java.util.*;

class Workers{
    private String nama;
    private int umur, gaji;

    


    public Workers() {
        this.nama = "";
        this.umur = 0;
        this.gaji = 0;
    }
    public Workers(String nama, int umur, int gaji) {
        this.nama = nama;
        this.umur = umur;
        this.gaji = gaji;
    }

  
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }
    public int getUmur() {
        return umur;
    }
    public int getGaji() {
        return gaji;
    }

    @Override
    public String toString() {
        return "Nama: " + this.nama + ", Umur: " + this.umur + ", Gaji: Rp." + this.gaji + "\n";
    }
}

public class VectorTest{
    public static void main(String[] args) {
        Vector<Workers> worker = new Vector<Workers>();
        worker.add(new Workers("Rifqi Muh A", 26, 1000000)); // Method untuk menambahkan element ke vector
        worker.add(new Workers("Faris Ahmad", 19, 1200000));
        worker.add(new Workers("Zidan Farhan", 25, 900000));
        
        System.out.println("===Isi vector awal===");
        System.out.println(worker);

        // Anotasi untuk supressing warning / note "unchecked" 
        @SuppressWarnings("unchecked")
        Vector<Workers> workerSortUmur  = (Vector<Workers>)worker.clone(); // Method untuk meng-copy semua elements dari vector

        Comparator<Workers> comUmur = new Comparator<Workers>(){ // Mmebuat custom comparator
            /*
             * @desc
             *  Membandingkan umur dari object workers
             * @param 
             *  w1 : worker pertama yang akan dibandingkan dengan worker kedua (w2)
             *  w2 : worker kedua yang akan dibandingkan dengan worker pertama (w1)
             * @return
             *  1 : Jika umur worker 1 > umur worker 2
             *  -1 : Jika umur worker 1 < umur worker 2
             */
            public int compare(Workers w1, Workers w2) {    
                if(w1.getUmur() > w2.getUmur()) return 1;
                return -1;
            }
        };
        
        Collections.sort(workerSortUmur, comUmur);
        System.out.println("===Isi vector sorted by umur===");
        System.out.println(workerSortUmur);

        @SuppressWarnings("unchecked")
        Vector<Workers> workerSortGaji  = (Vector<Workers>)worker.clone();
    
        Comparator<Workers> comGaji = new Comparator<Workers>(){
            /*
             * @desc
             *  Membandingkan gaji dari object workers
             * @param 
             *  w1 : worker pertama yang akan dibandingkan dengan worker kedua (w2)
             *  w2 : worker kedua yang akan dibandingkan dengan worker pertama (w1)
             * @return
             *  1 : Jika gaji worker 1 > gaji worker 2
             *  -1 : Jika gaji worker 1 < gaji worker 2
             */
            public int compare(Workers w1, Workers w2) {    
                if(w1.getGaji() > w2.getGaji()) return 1;
                return -1;
            }
        };
    
        Collections.sort(workerSortGaji, comGaji);
        System.out.println("===Isi vector sorted by gaji===");
        System.out.println(workerSortGaji);
    }
}
