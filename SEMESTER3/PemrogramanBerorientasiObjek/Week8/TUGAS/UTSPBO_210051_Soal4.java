/*
Program = Soal 4
Nama    = Satria Alief
NPM     = 140810210051
Kelas   = A
Tanggal = 19 Oktober 2022
*/


import java.util.Scanner;
class Kendaraan{
    Scanner scan = new Scanner(System.in);
    private String plat, jenis;
    private Waktu masuk = new Waktu();
    private Waktu keluar = new Waktu();

    public Kendaraan(){}

    public Kendaraan(String plat, String jenis){
        this.plat = plat;
        this.jenis = jenis;
    }

    public void setPlat(String plat){
        this.plat = plat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public String getPlat(){
        return this.plat;
    }

    public String getJenis(){
        return this.jenis;
    }

    public Waktu getMasuk(){
        return this.masuk;
    }
    
    public Waktu getKeluar(){
        return this.keluar;
    }
    
    public void setKendaraan(){
        System.out.print("Masukkan No Kendaraan : ");
        this.plat = scan.nextLine();
        System.out.print("Masukkan Jenis Kendaraan : ");
        this.jenis = scan.nextLine();
        masuk.setWaktu("masuk");
        keluar.setWaktu("keluar");
    }

    public int tarifParkir(){
        int tarif = 0;
        switch(this.jenis){
            case "Motor":
                tarif = 2000;
                break;
            case "Mobil":
                tarif = 3000;
                break;
        }
        return tarif;
    }
    
    public Waktu durasiParkir(){
        return this.masuk.durasi(this.keluar);
    }
    
    public int biaya(){
        Waktu minParkir = new Waktu(0,10,0);
        Waktu hasil = new Waktu();
        int biaya = 0;
        if(durasiParkir().getMenit() > 10){
            hasil = minParkir.durasi(durasiParkir());
            switch(this.jenis){
                case "Motor":
                    biaya = (2000*hasil.getJam());
                    break;
                case "Mobil":
                    biaya = (3000*hasil.getJam());
                    break;
            }   
        } else{}
        return biaya;
    }
}

class Waktu{
    Scanner scan = new Scanner(System.in);
    private int h, m, s;

    public Waktu(){}
    public Waktu(int h, int m, int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public void setJam(int h){
        this.h = h;
    }

    public void setMenit(int m){
        this.m = m;
    }

    public void setDetik(int s){
        this.s = s;
    }
    
    public int getJam(){
        return this.h;
    }
    
    public int getMenit(){
        return this.m;
    }
    
    public int getDetik(){
        return this.s;
    }

    public void setWaktu(String text){
        System.out.print("Masukkan Jam " + text + " : ");
        this.h = scan.nextInt();
        System.out.print("Masukkan Menit " + text + " : ");
        this.m = scan.nextInt();
        System.out.print("Masukkan Detik " + text + " : ");
        this.s = scan.nextInt();
    }

    public String getWaktu(){
        String jam, menit, detik;
        jam = "";
        menit = "";
        detik = "";
        if(this.h<10){
            jam = "0";
        } else{}
        if(this.m<10){
            menit = "0";
        } else{}
        if(this.s<10){
            detik = "0";
        } else{}
        return (jam + this.h + ":" + menit + this.m + ":" + detik + this.s);
    }

    public int detikTotal(){
        int total = (this.h*3600 + this.m*60 + this.s);
        return total;
    }
    
    public Waktu durasi(Waktu keluar){
        Waktu durasi =  new Waktu();
        int detikMasuk = this.detikTotal();
        int detikKeluar = keluar.detikTotal();
        int total =  detikKeluar - detikMasuk;
        durasi.konversi(total);
        return durasi;
    }

    public void konversi(int detik){
        this.h = detik/3600;
        detik = detik%3600;
        this.m = detik/60;
        detik = detik%60;
        this.s = detik;
    }
}

public class UTSPBO_210051_Soal4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan banyak kendaraan : ");
        int banyak = scan.nextInt();
        System.out.println();

        Kendaraan obj[] = new Kendaraan[banyak];

        program(obj, banyak);
        System.out.println();
        print(obj, banyak);
        totalBiaya(obj, banyak);
       
        scan.close();
    }

    static void program(Kendaraan[] obj, int banyak){
        for(int i=0; i<banyak; i++){
        System.out.println(i+1);
        obj[i] = new Kendaraan();
        obj[i].setKendaraan();
        }
    }

    static void print(Kendaraan[] obj, int banyak){
        System.out.println("~~~~~~~~~~ List Parkir Kendaraan ~~~~~~~~~~");
        if(obj[0].getPlat() == null){
            System.out.println("NULL");
        }
        else{
            System.out.println("_______________________________________________________________________________________________________________________________________________");
            System.out.println("No\tNo Kendaraan\t\tJenis\t\t Masuk\t\t Keluar\t\t Durasi\t\t Lama Jam\tBiaya\t\t");
            System.out.println("_______________________________________________________________________________________________________________________________________________");
            int no = 1;
            for(int i=0; i<banyak; i++){
                if(obj[i].getPlat() == null){
                    break;
                }
                else{
                    System.out.println(
                    //print identitas
                    no + "\t" + obj[i].getPlat() + "\t\t" + obj[i].getJenis() + "\t\t" + 
                    //print waktu
                    obj[i].getMasuk().getWaktu() + "\t" + obj[i].getKeluar().getWaktu() + "\t" + 
                    //print durasi
                    obj[i].durasiParkir().getWaktu() + "\t " + obj[i].durasiParkir().getJam() + "\t\t" +
                    //print tarif
                    obj[i].biaya() );
                }
                no++;
            }
            System.out.println("____________________________________________________________________________________________________________________________________________________");
        }
    }

    static void totalBiaya(Kendaraan[] obj, int banyak){
        int hasil = 0;
        for(int i=0; i<banyak; i++){
            hasil += obj[i].biaya();
        }
        System.out.println("Total Gaji Harian = " + hasil);
    }
}