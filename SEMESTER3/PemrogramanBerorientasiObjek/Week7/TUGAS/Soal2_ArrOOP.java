/* 
Nama : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
NPM : 140810210015 , 140810200042 , 140810210059 , 140810210039
Kelas : A
Tanggal : 7 Oktober 2022
Nama Program : Soal2_ArrOOP.java
Deskripsi : program untuk mencari gaji lembur berdasarkan lama kerja pegawai dgn beberapa aturan
*/

import java.util.Scanner;
class Waktu{
    private int jam,menit,detik;

    Waktu(int jam,int menit,int detik){
        this.jam=jam;
        this.menit=menit;
        this.detik=detik;

    }
    Waktu(){
        this.jam=0;
        this.menit=0;
        this.detik=0;
    }

    //Input
    public void setJam(int jam){
        this.jam=jam;
    }

    public void setMenit(int menit){
        this.menit=menit;
    }
    public void setDetik(int detik){
        this.detik=detik;
    }

    public void inputJam(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jam : ");
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
        String nolJam ="",nolMenit="",nolDetik="";
        if(this.jam<10){
            nolJam="0";
        }
        if(this.menit<10){
            nolMenit="0";
        }
        if(this.detik<10){
            nolDetik="0";
        }
        
        return nolJam+this.jam + ":" + nolMenit+this.menit + ":" +nolDetik+this.detik;
    }

    //Proses
    public int convertToSecond(){

        int hasil = this.detik + this.menit*60 + this.jam*3600;
        return hasil;
    }

    public void secondToClock(int second){
        this.menit=second/60;
        this.detik=second%60;
        this.jam=this.menit/60;
        this.menit=this.menit%60;
    }

    public Waktu cariDurasi(Waktu akhir){
        Waktu temp =  new Waktu();

        int detikAwal = this.convertToSecond();
        int detikAkhir = akhir.convertToSecond();
        if(detikAkhir<detikAwal){
            detikAkhir+=86400;
        }
        int detikHasil = detikAkhir - detikAwal;

        

        temp.secondToClock(detikHasil);
        return temp;
    }
    
}

class Pegawai{
    private String nama,nip;
    private int gol;
    private Waktu datang = new Waktu();
    private Waktu pulang = new Waktu();

    Pegawai(){
        
        this.nip = " ";
        this.nama= " ";
        this.gol=0;
        
    }

    //Input
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setNIP(String nip){
        this.nip=nip;
    }
    public void setGol(int gol){
        this.gol=gol;
    }

    public void setWaktuDatang(Waktu datang){
        this.datang=datang;
    }

    public void setWaktuPulang(Waktu pulang){
        this.pulang=pulang;
    }

    public void inputPegawai(){
       
        Scanner input=new Scanner(System.in);

        System.out.println("\n--- INPUT PEGAWAI ---");
        System.out.print("NIP pegawai : ");
        this.nip = input.nextLine();

        System.out.print("Nama pegawai : ");
        this.nama = input.nextLine();

        System.out.print("Golongan gaji : ");
        this.gol = input.nextInt();

        System.out.println("\n-- Jam Mulai Kerja --");
        datang.inputJam();
        
        System.out.println("\n-- Jam Selesai Kerja --");
        pulang.inputJam();

        

    }

    //Output
    public String getNama(){
        return this.nama;
    }

    public String getNIP(){
        return this.nip;
    }

    public int getGol(){
        return this.gol;
    }

    public Waktu getWaktuDatang(){
        return this.datang;
    }

    public Waktu getWaktuPulang(){
        return this.pulang;
    }

    public void outputPegawai(){
        System.out.println("NIP : " + this.nip);
        System.out.println("Nama : " + this.nama);
        System.out.println("Golongan gaji : " + this.gol);

        System.out.println("Waktu Datang : " + this.datang.getWaktu());
        System.out.println("Waktu pulang : " + this.pulang.getWaktu());
        System.out.println("Lama Kerja : " + getLamaKerja().getWaktu());
        System.out.println("Jam lembur : " + getWaktuLembur() + " jam "); 
        System.out.println("Gaji Harian : " + getGajiHarian());

        System.out.println("\n"+getPeringatan());
    }

    

    //Proses
    public Waktu getLamaKerja(){
        return this.datang.cariDurasi(this.pulang);
    }
    public Waktu getWaktuLembur(){
        Waktu delJam= new Waktu(8,0,0);
        Waktu hasil = new Waktu(0,0,0);

        if(getLamaKerja().getJam() >= 8){
            hasil=delJam.cariDurasi(getLamaKerja());
        }



        return hasil;
       
    }
    public int getTambahanLembur(){
        int tambahan = 0;
       
        if(this.gol==1){
            tambahan = (50000*getWaktuLembur().getJam());
        }

        else if(this.gol==2){
            tambahan = (70000*getWaktuLembur().getJam());
        }

        else if(this.gol==3){
            tambahan = (150000*getWaktuLembur().getJam());
        }
        else if(this.gol==4){
            tambahan = (200000*getWaktuLembur().getJam());
        }


        return tambahan;
    }

    public int getGajiPokok(){
        int gapok = 0;

        if(this.gol == 1){
            gapok = 150000;
           
        }

        else if(this.gol == 2){
            gapok = 200000;
        }

        else if(this.gol == 3){
            gapok = 400000;
        }
        else if(this.gol == 4){
            gapok = 500000;
        }

        
        return gapok;
    }

    public int getGajiHarian(){
        int tambahan = getTambahanLembur();
        int gapok = getGajiPokok();
        int gajiHarian = tambahan + gapok;

        return gajiHarian;
    }

    public String getPeringatan(){
        String hasil = "";
        if(getLamaKerja().getJam()<8){
            hasil = "SP1";
        }

        return hasil;
    }

    
}

public class Soal2_ArrOOP{
    public static void main(String[] args) {

       int panjang = inputInt("Masukkan ukuran array = ");
       clearScreen();

       Pegawai arrPegawai[] = new Pegawai[panjang];

       inputArrayPegawai(arrPegawai, panjang);
       clearScreen();

       tampilkanData(arrPegawai, panjang);
       
    }


    static int inputInt(String pesan){
        System.out.print(pesan);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    static void clearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    static void tampilkanData(Pegawai[] data,int ukuran){
        int no = 1;
        System.out.println("==== Daftar Gaji Harian PT Informatika ====");
        if(data[0].getNIP()=="s"){
            System.out.println("Data kosong ! ");
        }
        

        else{
            System.out.println("================================================================================================================================");
            System.out.println("No\tNIP\tNama\tGolongan\tDatang\t\tPulang\t\tLama\t\tJamLembur\tGajiHarian\tStatus");
            System.out.println("================================================================================================================================");
            for(int i=0;i<ukuran;i++){
                if(data[i].getNIP() == " "){
                    break;
                }

                else{
                    System.out.println(
                        no + "\t" +
                        data[i].getNIP() + "\t" + 
                        data[i].getNama() + "\t" + 
                        data[i].getGol() + "\t\t" + 
                        data[i].getWaktuDatang().getWaktu() + "\t" + 
                        data[i].getWaktuPulang().getWaktu() + "\t" + 
                        data[i].getLamaKerja().getWaktu() + "\t " + 
                        data[i].getWaktuLembur().getWaktu() + "\t" + 
                        data[i].getGajiHarian() + "\t\t" + 
                        data[i].getPeringatan() + "\t"    );
                    no++;
                }
            }

        }
        
    }

    static void inputArrayPegawai(Pegawai[] data,int ukuran){
        for(int i=0;i<ukuran;i++){
        System.out.println("Pegawai ke " + (i+1));
        data[i] = new Pegawai();
        data[i].inputPegawai();
        clearScreen();
        }
    }

   
}