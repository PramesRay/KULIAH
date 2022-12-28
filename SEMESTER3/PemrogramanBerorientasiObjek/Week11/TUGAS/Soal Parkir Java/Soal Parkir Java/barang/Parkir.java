package barang;
import java.util.Scanner;
public class Parkir {
    private Kendaraan vec;
    private Waktu pulang, datang;
    // Constructor
    public Parkir(){
        vec = new Kendaraan();
        pulang = new Waktu();
        datang = new Waktu();
    }
    /**
     * 
     * @param jenisKendaraan
     * untuk menentukan jenis kendaraan yang dipakai
     * 1 = Motor
     * 2 = Mobil
     * 3 = Truk
     */
    public Parkir(int jenisKendaraan){
        if(jenisKendaraan == 1){
            vec = new Motor();
        } else if(jenisKendaraan == 2){
            vec = new Mobil();
        } else if(jenisKendaraan == 3){
            vec = new Truk();
        } 
        pulang = new Waktu();
        datang = new Waktu();
    }

    // setter
    public void setDatang(Waktu datang) {
        this.datang = datang;
    }
    public void setPulang(Waktu pulang) {
        this.pulang = pulang;
    }
    public void setVec(Kendaraan vec) {
        this.vec = vec;
    }

    // getter
    public Waktu getDatang() {
        return datang;
    }
    public Waktu getPulang() {
        return pulang;
    }public Kendaraan getVec() {
        return vec;
    }

    // fungsionalitas
    // fungsi untuk mengisi semua atribut kelas dari inputan terminal
    public void isiParkir(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Jenis Kendaraan \n(1) Motor\n(2) Mobil\n(3) Truk\n>  ");
        int jenis = Integer.parseInt(scan.nextLine());
        if (jenis == 1){
            vec = new Motor();
        } else if (jenis == 2){
            vec = new Mobil();
        } else if (jenis == 3){
            vec = new Truk();
        }
        
        System.out.print("Masukan nama pemilik kendaraan : ");
        vec.getPemilik().setNama(scan.nextLine());
        System.out.print("Masukan No kendaraan (XX XXXX XXX) : ");
        vec.setNoKendaraan(scan.nextLine());
        this.datang.inputWaktu("Masukan Waktu Datang (jj:mm:dd) : ");
        this.pulang.inputWaktu("Masukan Waktu Pulang (JJ:mm:dd) : ");
        
    }

    /**
     * @return 
     * total biaya parkir sebuah kendaraan
     */
    public int totalParkir(){
        Waktu banyakJam = new Waktu();
        banyakJam.panjangWaktu(datang, pulang);

        int total = banyakJam.getJam() * vec.biayaParkir(); // 2 * 2000 = 4000
        if (banyakJam.getMenit() >= 10){ // 2 15 30
            total += vec.biayaParkir(); // 6000
        }
        
        return total;
    }

    /**
     * @return
     * mereturn string berisi atribut-atribut Parkir yang diformat agar rapih
     */
    public String toString(int nomor){
        Waktu banyakJam = new Waktu();
        banyakJam.panjangWaktu(this.datang, this.pulang);
        return String.format("%-3d |%-10s |%-12s |%-10s |%-10s |%-10s |%-12s |%-10d |%-12d", 
            nomor, vec.getPemilik().getNama(), vec.getNoKendaraan(), vec.getJenisKendaraan(), 
            this.datang.getTime(), this.pulang.getTime(), banyakJam.getTime(), banyakJam.getJam(), totalParkir());
    }
    
}
