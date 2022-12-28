/* 
Nama         : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
NPM          : 140810210015 , 14081020042 , 140810210059 , 140810210039
Kelas        : A
Tanggal      : 9 Oktober 2022
Nama Program : Soal1_ArrOOP.java
Deskripsi    : Program untuk mencari huruf mutu dan lama ujian
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

class Mahasiswa{
    private String nama, NPM;
    private Float nilaiMahasiswa;
    private Waktu datang = new Waktu();
    private Waktu pulang = new Waktu();

    Mahasiswa(){
        
        this.NPM = " ";
        this.nama = " ";
        this.nilaiMahasiswa = 0f;
        
    }

    //Input
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNPM(String NPM){
        this.NPM = NPM;
    }
    public void setnilaiMahasiswa(Float nilaiMahasiswa){
        this.nilaiMahasiswa = nilaiMahasiswa;
    }

    public void setWaktuDatang(Waktu datang){
        this.datang = datang;
    }

    public void setWaktuPulang(Waktu pulang){
        this.pulang = pulang;
    }

    public void inputMahasiswa(){
       
        Scanner input = new Scanner(System.in);

        System.out.println("\n--- INPUT DATA MAHASIWA ---");
        System.out.print("NPM Mahasiswa  : ");
        this.NPM = input.nextLine();

        System.out.print("Nama Mahasiswa : ");
        this.nama = input.nextLine();

        System.out.print("Nilai ujian    : ");
        this.nilaiMahasiswa = input.nextFloat();

        System.out.println("\n-- Jam Mulai Ujian --");
        datang.inputJam();
        
        System.out.println("\n-- Jam Selesai Ujian --");
        pulang.inputJam();
    }

    //Output
    public String getNama(){
        return this.nama;
    }

    public String getNPM(){
        return this.NPM;
    }

    public Float getnilaiMahasiswa(){
        return this.nilaiMahasiswa;
    }

    public Waktu getWaktuDatang(){
        return this.datang;
    }

    public Waktu getWaktuPulang(){
        return this.pulang;
    }

    public void outputMahasiswa(){
        System.out.println("Nama        : " + this.nama);
        System.out.println("NPM         : " + this.NPM);
        System.out.println("Nilai Ujian : " + this.nilaiMahasiswa);
        // Huruf Mutu
        // Status
        System.out.println("Waktu mulai ujian   : " + this.datang.getWaktu());
        System.out.println("Waktu selesai ujian : " + this.pulang.getWaktu());
        System.out.println("Lama ujian          : " + getLamaUjian().getWaktu());
        // Nilai terendah
        // Nilai tertinggi
        // Rata rata nilai 

        System.out.println("\n"+hitungKeterangan());
    }

    

    //Proses
    public Waktu getLamaUjian(){
        return this.datang.cariDurasi(this.pulang);
    }

    public char hitungHurufMutu(){
        char HM;

        if(getnilaiMahasiswa() >= 0 && getnilaiMahasiswa() < 45){
            HM = 'E';
        } else if (getnilaiMahasiswa() >= 45 && getnilaiMahasiswa() < 55){
            HM = 'D';
        } else if (getnilaiMahasiswa() >= 55 && getnilaiMahasiswa() < 68){
            HM = 'C';
        } else if (getnilaiMahasiswa() >= 68 && getnilaiMahasiswa() < 80){
            HM = 'B';
        } else {
            HM = 'A';
        }
        
        return HM;
    }

    public String hitungKeterangan(){
        String status;

        if (getnilaiMahasiswa() >= 55) {
            status = "LULUS";
        } else {
            status = "GAGAL";
        }

        return status;
    }
}

public class Soal1_ArrOOP{
    public static void main(String[] args) {

       int panjang = inputInt("Masukkan ukuran array = ");
       clearScreen();

       Mahasiswa arrMahasiswa[] = new Mahasiswa[panjang];

       inputArrayMahasiswa(arrMahasiswa, panjang);
       clearScreen();

       outputArrayMahasiswa(arrMahasiswa, panjang);
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

    static void tampilkanData(Mahasiswa[] data,int ukuran){
        int no = 1;
        System.out.println("\n\t\t\t\t==== Data kelas A Teknik Informatika ====");
        if(data[0].getNPM()=="s"){
            System.out.println("Data kosong ! ");
        }
        

        else{
            System.out.println("================================================================================================================================");
            System.out.println("No\tNPM\tNama\tNilai Mahasiswa\tHuruf Mutu\tMulai\t\tSelesai\t\tLama\t\tStatus");
            System.out.println("================================================================================================================================");
            for(int i=0;i<ukuran;i++){
                if(data[i].getNPM() == " "){
                    break;
                }

                else{
                    System.out.println(
                        no + "\t" +
                        data[i].getNPM() + "\t" + 
                        data[i].getNama() + "\t\t" + 
                        data[i].getnilaiMahasiswa() + "\t\t" +
                        data[i].hitungHurufMutu() + "\t" +
                        data[i].getWaktuDatang().getWaktu() + "\t" + 
                        data[i].getWaktuPulang().getWaktu() + "\t" + 
                        data[i].getLamaUjian().getWaktu() + "\t " + 
                        data[i].hitungKeterangan() + "\t"    );
                    no++;
                }
            }
            System.out.println("================================================================================================================================");

        }
        
    }

    static float minNilai(Mahasiswa[] data,int ukuran){
        float kecil = 999;

        for(int i=0;i<ukuran;i++){
            if(data[i].getnilaiMahasiswa()<kecil){
                kecil=data[i].getnilaiMahasiswa();
            }
         }

        return kecil;
    }

    static float maxNilai(Mahasiswa[] data,int ukuran){
        float besar = -999;

        for(int i=0;i<ukuran;i++){
            if(data[i].getnilaiMahasiswa()>besar){
                besar=data[i].getnilaiMahasiswa();
            }
         }

        return besar;
    }

    static float avgNilai(Mahasiswa[] data,int ukuran){
        float rata = 0;

        for(int i=0;i<ukuran;i++){
            rata+=data[i].getnilaiMahasiswa();
         }

         rata /=ukuran;

        return rata;
    }


    static void inputArrayMahasiswa(Mahasiswa[] data,int ukuran){
        for(int i=0;i<ukuran;i++){
        System.out.println("\nMahasiswa ke " + (i+1));
        data[i] = new Mahasiswa();
        data[i].inputMahasiswa();
        clearScreen();
        }
    }

    static void outputArrayMahasiswa(Mahasiswa[] data , int ukuran){
        tampilkanData(data, ukuran);
        System.out.println("Nilai Tertinggi : " + maxNilai(data, ukuran));
        System.out.println("Nilai Terendah : " + minNilai(data, ukuran));
        System.out.println("Nilai Rata-rata : " + avgNilai(data, ukuran));
    }

   
}