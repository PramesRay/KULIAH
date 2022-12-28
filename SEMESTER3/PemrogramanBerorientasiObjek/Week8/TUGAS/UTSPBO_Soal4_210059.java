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
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jam : ");
        this.jam = sc.nextInt();
        System.out.print("Masukkan menit : ");
        this.menit = sc.nextInt();
        System.out.print("Masukkan detik : ");
        this.detik = sc.nextInt();
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

class Kendaraan{
    private String noken;
    private int jenis;
    private Waktu datang = new Waktu();
    private Waktu pulang = new Waktu();

    public Kendaraan(){
      this.noken = " ";
      this.jenis= 0;        
    }

    //Input
    public void setNoken(String noken){
      this.noken = noken;
    }
    public void setJenis(int jenis){
        this.jenis = jenis;
    }

    public void setWaktuDatang(Waktu datang){
        this.datang = datang;
    }

    public void setWaktuPulang(Waktu pulang){
        this.pulang = pulang;
    }

    public void inputKendaraan(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n[INPUT KENDARAAN]");
        System.out.print("No. Kendaraan : ");
        this.noken = sc.nextLine();

        System.out.println("Jenis Kendaraan : ");
        System.out.println("1. Mobil ");
        System.out.println("2. Motor ");
        this.jenis = sc.nextInt();

        System.out.println("\nJam Masuk: ");
        datang.inputJam();
        
        System.out.println("\nJam Keluar: ");
        pulang.inputJam();
    }

    public int tarifParkir(){
      int tarif = 0;
      switch(this.jenis){
        case 1:
            tarif = 3000;
            break;
          case 2:
            tarif = 2000;
            break;
      }
      return tarif;
    }

    public Waktu durasiParkir(){
      return this.datang.cariDurasi(this.pulang);
    }

    public int exeption(){
        int lamaJam = durasiParkir().getJam();

        if (durasiParkir().getMenit() > 10 && durasiParkir().getJam() == 0){
            lamaJam = 1;
        }
        else if (durasiParkir().getJam() > 0 && durasiParkir().getDetik() > 0){
            lamaJam += 1;
        }

        return lamaJam;
    }
  
    public int biaya(){
        int biaya = 0;
        biaya = tarifParkir() * exeption();
        return biaya;
        }

    //Output
    public String getNoken(){
        return this.noken;
    }

    public int getJenis(){
        return this.jenis;
    }

    public Waktu getWaktuDatang(){
        return this.datang;
    }

    public Waktu getWaktuPulang(){
        return this.pulang;
    }

    
    //Proses
    public Waktu getDurasi(){
        return this.datang.cariDurasi(this.pulang);
    }

    public Waktu getJamKeberapa(){
        Waktu hasil = new Waktu(0,0,0);

        if(getDurasi().getJam() >= 1){
            hasil=hasil.cariDurasi(getDurasi());
        }

        return hasil;
       
    }
    public void printKendaraan(){
        System.out.println("noken : " + this.noken);
        System.out.println("jenis : " + this.jenis);

        System.out.println("Waktu Datang\t: " + this.datang.getWaktu());
        System.out.println("Waktu pulang\t: " + this.pulang.getWaktu());
        System.out.println("Lama Parkir\t: " + getDurasi().getWaktu());
        System.out.println("Lama Jam\t\t: " + getJamKeberapa() + " jam "); 
        System.out.println("Biaya\t\t: " + biaya());

    }

}

public class UTSPBO_Soal4_210059 {
  public static void main(String[] args) {

    int panjang = inputInt("Banyak Kendaraan\t: ");
    clearScreen();

    Kendaraan arrKendaraan[] = new Kendaraan[panjang];

    inputArrayKendaraan(arrKendaraan, panjang);
    clearScreen();

    tampilkanData(arrKendaraan, panjang);
    
 }


 static int inputInt(String pesan){
     System.out.print(pesan);
     Scanner sc = new Scanner(System.in);
     return sc.nextInt();
 }

 static void clearScreen(){
     System.out.print("\033[H\033[2J");  
     System.out.flush();
 }

 static void tampilkanData(Kendaraan[] data,int ukuran){
     int no = 1;
     System.out.println("[Rekapitulasi Biaya Parkir PT Parkir Jaya]");
     if(data[0].getNoken()=="s"){
         System.out.println("Data kosong ! ");
     }
     

     else{
         System.out.println("___________________________________________________________________________________________________________________________________--");
            System.out.println("No\t No Kendaraan\t\t Jenis\t\t Masuk\t\t Keluar\t\t Durasi\t\t Lama Jam\t\t Biaya\t\t");
            System.out.println("___________________________________________________________________________________________________________________________________--");
            for(int i=0; i<ukuran; i++){
                if(data[i].getNoken() == null){
                    break;
                }
                else{
                    
                    System.out.println(
                    //print identitas
                    no + "\t" + 
                    data[i].getNoken() + "\t\t" + 
                    data[i].getJenis() + "\t\t" + 
                    
                    //print waktu
                    data[i].getWaktuDatang().getWaktu() + "\t" + 
                    data[i].getWaktuPulang().getWaktu() + "\t" + 
                    
                    //print durasi
                    data[i].durasiParkir().getWaktu() + "\t " + 
                    data[i].exeption() + "\t\t\t" +
                    //print tarif
                    data[i].biaya() );
                }
                no++;
            }
            System.out.println("___________________________________________________________________________________________________________________________________--");
     }
 }

 static void inputArrayKendaraan(Kendaraan[] data,int ukuran){
     for(int i=0;i<ukuran;i++){
     System.out.println("Kendaraan ke " + (i+1));
     data[i] = new Kendaraan();
     data[i].inputKendaraan();
     clearScreen();
     }
 }
}
