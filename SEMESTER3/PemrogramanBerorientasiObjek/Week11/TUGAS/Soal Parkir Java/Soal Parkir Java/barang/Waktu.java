package barang;
import java.util.Scanner;

public class Waktu {
    private int jam, menit, detik;
    // constructor
    public Waktu(){
        this.jam = this.menit = this.detik = 0;
    }
    // setter
    public void overBound(){
        if(this.detik >= 60){
            this.menit += detik/60;
            this.detik %= 60;
        }

        if(this.menit >= 60){
            this.jam += menit/60;
            this.menit %= 60;
        }
    }
    public void setJam(int jam){
        this.jam += jam;
    }
    public void setMenit(int menit){
        this.menit = menit;
        overBound();
    }
    public void setDetik(int detik){
        this.detik = detik;
        overBound();
    }
    public void setTime(int jam, int menit, int detik){
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
        overBound();
    }
    public void inputWaktu(String msg){
        System.out.print(msg);
        Scanner scanner = new Scanner(System.in);
        String[] waktu = scanner.nextLine().split(":");
        this.jam = Integer.parseInt(waktu[0]);
        this.menit = Integer.parseInt(waktu[1]);
        this.detik = Integer.parseInt(waktu[2]);
        overBound();
    }
    // getter
    public int getJam(){
        return this.jam;
    }
    public int getMenit(){
        return this.menit;
    }
    public int getDetik(){
        return this.detik;
    }
    public String getTime(){
        return this.jam + ":" + this.menit + ":" + this.detik;
    }
    // fungsionalitas
    // Buat mengecek berapa banyak waktu yang lewat antara dua point waktu
    // tidak ada sistem pengecekan
    public void panjangWaktu(Waktu datang, Waktu pulang){
        // Waktu hasil = new Waktu();
        int selisih = (pulang.jam * 3600 + pulang.menit * 60 + pulang.detik) - (datang.jam * 3600 + datang.menit * 60 + datang.detik);
        this.jam =(selisih/3600);
        selisih %= 3600;
        this.menit =(selisih/60);
        selisih %= 60;
        this.detik =(selisih);
        // return hasil;
    }
}
