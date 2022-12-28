/*
* Nama          : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
* NPM           : 140810210015 , 140810200042 , 140810210059 , 140810210039
* Kelas         : A
* Tanggal       : 11 November 2022
* Nama Program  : Inheritance.java
* Deskripsi     : UTS SOAL 4 dengan Inheritance
*/

import java.util.Scanner;

class Waktu{
    private int jam, menit, detik;

    Waktu(int jam, int menit, int detik){
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;

    }
    Waktu(){
        this.jam = 0;
        this.menit = 0;
        this.detik = 0;
    }

    //Input
    public void setJam(int jam){
        this.jam = jam;
    }

    public void setMenit(int menit){
        this.menit = menit;
    }
    public void setDetik(int detik){
        this.detik = detik;
    }

    public void inputJam(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jam   : ");
        this.jam = input.nextInt();
        System.out.print("Masukkan menit : ");
        this.menit = input.nextInt();
        System.out.print("Masukkan detik : ");
        this.detik = input.nextInt();
    }

    //Output
    public int getJam(){
        return this.jam;
    }
    public int getMenit(){
        return this.menit;
    }
    public int getDetik(){
        return this.detik;
    }

    public String getWaktu(){
        String nolJam ="", nolMenit="", nolDetik="";
        if(this.jam < 10){
            nolJam = "0";
        }
        if(this.menit < 10){
            nolMenit = "0";
        }
        if(this.detik < 10){
            nolDetik = "0";
        }
        
        return nolJam + this.jam + ":" + nolMenit + this.menit + ":" + nolDetik + this.detik;
    }

    //Proses
    public int convertToSecond(){

        int hasil = this.detik + this.menit*60 + this.jam*3600;
        return hasil;
    }

    public void secondToClock(int second){
        this.menit = second / 60;
        this.detik = second % 60;
        this.jam = this.menit / 60;
        this.menit=this.menit % 60;
    }

    public Waktu cariDurasi(Waktu akhir){
        Waktu temp =  new Waktu();

        int detikAwal = this.convertToSecond();
        int detikAkhir = akhir.convertToSecond();
        if(detikAkhir < detikAwal){
            detikAkhir += 86400;
        }
        int detikHasil = detikAkhir - detikAwal;

        

        temp.secondToClock(detikHasil);
        return temp;
    }
    
}

abstract class Kendaraan{
    protected String no;
    protected String jenis;
    protected Waktu datang = new Waktu();
    protected Waktu pulang = new Waktu();

    Kendaraan(){
        this.no = " ";
        this.jenis= " ";
    }

    //Input
    public void setNoKendaraan(String no){
        this.no=no;
    }
    public void setJenis(String jenis){
        this.jenis=jenis;
    }
   

    public void setWaktudatang(Waktu datang){
        this.datang=datang;
    }

    public void setWaktuPulang(Waktu pulang){
        this.pulang=pulang;
    }

    public void inputKendaraan(){
       
        Scanner input=new Scanner(System.in);

        System.out.println("\n--- INPUT KENDARAAN ---");
        System.out.print("No Kendaraan : ");
        this.no = input.nextLine();

        System.out.println("\n-- Jam Masuk Kendaraan --");
        this.datang.inputJam();
        
        System.out.println("\n-- Jam Keluar Kendaraan --");
        pulang.inputJam();

    }

    //Output
    public String getNoKendaraan(){
        return this.no;
    }

    public String getJenis(){
        return this.jenis;
    }

    public Waktu getWaktudatang(){
        return this.datang;
    }

    public Waktu getWaktuPulang(){
        return this.pulang;
    }

    //Proses
    public Waktu getLamaParkir(){
        return this.datang.cariDurasi(this.pulang);
    }

    public int getLamaJam(){
        int hasil = 0;
        if(this.getLamaParkir().getMenit()>=10 || this.getLamaParkir().getJam()>=1){
            hasil = this.getLamaParkir().getJam();

            if( this.getLamaParkir().getMenit()>0 || this.getLamaParkir().getDetik()>0 ){
                hasil +=1;
            }
           
        }
        return hasil;
    }

    public abstract int getBiayaParkir();   
       
}

class Motor extends Kendaraan{
    public Motor(){
        super();
        this.jenis="Motor";
    }

    @Override
    public int getBiayaParkir() {
        return getLamaJam() * 2000;
    }
}

class Mobil extends Kendaraan{
    Mobil(){
        super();
        this.jenis = "Mobil";
    }

    @Override
    public int getBiayaParkir() {
        return getLamaJam() * 3000;
    }
}

class Truck extends Kendaraan{
    Truck(){
        super();
        this.jenis="Truck";
    }

    @Override
    public int getBiayaParkir() {
        return getLamaJam() * 10000;
    }
}

class LarikKendaraan{
    private int ukuran;
    private Kendaraan p[] = new Kendaraan[100];

    LarikKendaraan(int ukuran){
        this.ukuran = ukuran;
    }

    public void inputLarikParkir(){
        Scanner input = new Scanner(System.in);
        int num;
        for(int i=0;i<this.ukuran;i++){
            System.out.print("\033[H\033[2J");  
            System.out.flush();

            System.out.println("Kendaraan ke - " + (i+1));
            System.out.println("Jenis Kendaraan : ");
            System.out.println("1 . Mobil");
            System.out.println("2 . Motor");
            System.out.println("3 . Truck");
            System.out.print("Input...");
            num = input.nextInt();

            switch(num){
                case 1:
                    p[i] = new Mobil();
                    break;
                
                case 2:
                    p[i] = new Motor();
                    break;
                
                case 3:
                    p[i] = new Truck();
                    break;
            }

            this.p[i].inputKendaraan();

            System.out.print("\033[H\033[2J");  
            System.out.flush();
        }
    }

    public void cetakTabelParkir(){
        System.out.println("\t\t\t\tRekapitulasi Biaya parkir PT Parkir Jaya");
        if(this.p[0].getNoKendaraan()==" "){
            System.out.println("Larik kosong ! ");
        }
        else{
            int no = 1;
            System.out.println("================================================================================================================================");
            System.out.println("No\tNo Kendaraan\t\tJenis\tJam Masuk\tJam Pulang\tLama Parkir\tLama jam\tBiaya");
            System.out.println("================================================================================================================================");
            for(int i=0;i<this.ukuran;i++){
                if(this.p[i].getNoKendaraan() == " "){
                    break;
                }
                else{
                    System.out.println(
                        no + "\t" +
                        this.p[i].getNoKendaraan() + "\t\t" + 
                        this.p[i].getJenis()+ "\t" + 
                        this.p[i].getWaktudatang().getWaktu() + "\t" + 
                        this.p[i].getWaktuPulang().getWaktu() + "\t" +   
                        this.p[i].getLamaParkir().getWaktu() + "\t " + 
                        this.p[i].getLamaJam() + "\t\t" + 
                        this.p[i].getBiayaParkir() + "\t  "  
                         );
                    no++;
                }
            }
            System.out.println("================================================================================================================================");

        }
    }

    public float totalBiaya(){
        float hasil = 0;
        for(int i=0;i<this.ukuran;i++){
            hasil +=this.p[i].getBiayaParkir();
        }
        return hasil;
    }
}


public class Inheritance{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int uk;
        System.out.print("Masukkan banyak kendaraan : ");
        uk = input.nextInt();

        System.out.print("\033[H\033[2J");  
        System.out.flush();

        LarikKendaraan lp = new LarikKendaraan(uk);

        lp.inputLarikParkir();
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        lp.cetakTabelParkir();

        System.out.println("Total Biaya Parkir adalah = "+ lp.totalBiaya());   
    }
}