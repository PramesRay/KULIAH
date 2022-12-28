/*
Program : Tugas 2
Nama    : Prames Ray Lapian
NPM     : 140810210059
Kelas   : A
Tanggal : 5 Oktober  2022
Desc    : pertemuan 5
*/
import java.util.Scanner;

/**
 *
 * @author prame
 */
class WorkerInfo{
    Scanner sc = new Scanner(System.in);
    
    //Variable
    private String nama;
    private int gol;

    //Constructor #1
    public WorkerInfo(){
        this.nama = "";
        this.gol = 0;
    }

    //Constructor #2
    public WorkerInfo(String nama, int gol){
        this.nama = nama;
        this.gol = gol;
    }

    //Setter Nama
    public void setNama(String nama){
        this.nama = nama;
    }

    //Setter Golongan
    public void setGol(int gol){
        this.gol = gol;
    }

    //Getter Nama
    public String getNama(){
        return this.nama;
    }

    //Getter Golongan
    public int getGol(){
        return this.gol;
    }

    //Method Input
    public void input(){
        System.out.print("Nama\t\t: ");
        this.nama = sc.nextLine();
        System.out.print("Golongan\t: ");
        this.gol = sc.nextInt();
    }

    //Method Pencari Gaji Pokok
    public long gajiPokok(int gol){
        long gapok = 0;
        switch (gol){
            case 1:
                gapok = 150000;
                break;
            case 2:
                gapok = 200000;
                break;
            case 3:
                gapok = 300000;
                break;
            case 4:
                gapok = 500000;
                break;
        }
        return gapok;
    }

    //Method Pencari Gaji Lembur
    public long gajiLembur(int gol, int lembur){
      long biaya = 0;
      switch (gol) {
          case 1:
              biaya = 50000;
              break;
          case 2:
              biaya = 70000;
              break;
          case 3:
              biaya = 150000;
              break;
          case 4:
              biaya = 200000;
              break;
          default:
              break;
      }
      return (biaya * lembur);
    }
    
    //Method Pencari Gaji Harian
    public long gajiHarian(long gapok, long gajiLembur){
      return gapok+gajiLembur;
    }

    //Print Identyty
    public void printId(String nama, int gol){
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Golongan\t: " + gol);
    }

    //Print Gaji Total
    public void printgajiTotal(long a){
        System.out.println("Gaji Total\t: " + a);
    }
}

//---------------------------------------------------------------------------------------

class Waktu {
  Scanner sc = new Scanner(System.in);
  private String waktuDatang, waktuPulang;

  //Constructor Waktu #1
  public Waktu(){
    this.waktuDatang = "";
    this.waktuPulang = "";
  }
  
  //Constructor Waktu #2
  public Waktu(String waktuDatang, String waktuPulang){
    this.waktuDatang = waktuDatang;
    this.waktuPulang = waktuPulang;
  }

  //Setter Waktu
  public void setWaktu(String waktuDatang, String waktuPulang){
    this.waktuDatang = waktuDatang;
    this.waktuPulang = waktuPulang;
  }

  //Getter Waktu Datang
  public String getWaktuDatang(){
    return this.waktuDatang;
  }

  //Getter Waktu Pulang
  public String getWaktuPulang(){
      return this.waktuPulang;
  }

  //Method Input
  public void inputDataWaktu(){
    System.out.print("Waktu Datang\t: ");
    this.waktuDatang = sc.nextLine();
    System.out.print("Waktu Pulang\t: ");
    this.waktuPulang = sc.nextLine();
  }

  //Method Pencari + Output Durasi 
  public int durasiDalamDetik(){
    String strArrDatang[]= this.waktuDatang.split(":");
    int jamDatang = Integer.parseInt(strArrDatang[0]) ;
    int menitDatang = Integer.parseInt(strArrDatang[1]) ;
    int detikDatang = Integer.parseInt(strArrDatang[2]) ;
    
    String strArrPulang[]= this.waktuPulang.split(":");
    int jamPulang = Integer.parseInt(strArrPulang[0]);
    int menitPulang = Integer.parseInt(strArrPulang[1]);
    int detikPulang = Integer.parseInt(strArrPulang[2]);

    int lamadetik = (jamPulang - jamDatang) * 3600 +
				            (menitPulang - menitDatang) * 60 +
				            (detikPulang - detikDatang);

    return lamadetik;
  }

  //Method Pencari Durasi Jam
  public int durasiJam(){
    int durasiJam = durasiDalamDetik() / 3600;
    
    return durasiJam;
  }
  
  //Method Pencari Durasi Menit
  public int durasiMenit(){
    int lamadetik = durasiDalamDetik() % 3600;
		int durasiMenit = lamadetik / 60;
    
    
    return durasiMenit;
  }
  
  //Method Pencari Durasi Detik
  public int durasiDetik(){
    int lamadetik = durasiDalamDetik() % 3600;
		    lamadetik = durasiDalamDetik() % 60;
		int durasiDetik = lamadetik;
    
    return durasiDetik;
  }

  //Method Lembur
  public int lembur(){
    int lembur = 0;
    if (durasiJam() > 8)
      lembur = durasiJam() - 8;
    else
      lembur = 0;
    
    return lembur;
  }

  //Method Peringatan 
  public void statusPeringatan(){
    if(durasiJam() < 8)
      System.out.println("PERINGATAN!!!\t: Durasi bekerja anda kurang dari 8 jam");
  }
  
  //Method Print Durasi
  public void printDurasi(){
    System.out.println("Durasi Kerja\t: " + durasiJam() + " jam " + durasiMenit() + " menit " + durasiDetik() + " detik ");
  }
  
}

//---------------------------------------------------------------------------------------

public class Tugas52 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      WorkerInfo inputSystem = new WorkerInfo("Prames Ray Lapian", 3); //Test Constructor #2
      Waktu inputWaktuSystem = new Waktu("08:00:00", "15:00:00"); //Test Constructor Waktu #1
      
      //System Input : Angka di input langsung didalam codingan
      System.out.println("[Input System]");
      inputSystem.printId(inputSystem.getNama(), inputSystem.getGol());
      System.out.println("Waktu Datang\t: " + inputWaktuSystem.getWaktuDatang());
      System.out.println("Waktu Pulang\t: " + inputWaktuSystem.getWaktuPulang());
      inputWaktuSystem.printDurasi();
      System.out.println("Waktu Lembur\t: " + inputWaktuSystem.lembur() + " jam");
      System.out.println("Gaji Harian\t: " + inputSystem.gajiHarian(inputSystem.gajiPokok(inputSystem.getGol()), 
                                                                    inputSystem.gajiLembur(inputSystem.getGol(),
                                                                                           inputWaktuSystem.lembur())));
      inputWaktuSystem.statusPeringatan();
      
      WorkerInfo inputUser = new WorkerInfo(); //Test Constructor #1
      Waktu inputWaktuUser = new Waktu(); //Test Constructor Waktu #1

      //User Input : Angka di input manual oleh User
      System.out.println("\n[Input User]");
      inputUser.input();
      inputWaktuUser.inputDataWaktu();
      inputWaktuUser.printDurasi();
      System.out.println("Waktu Lembur\t: " + inputWaktuUser.lembur() + " jam");
      System.out.println("Gaji Harian\t: " + inputUser.gajiHarian(inputUser.gajiPokok(inputUser.getGol()), 
                                                                    inputUser.gajiLembur(inputUser.getGol(),
                                                                                           inputWaktuUser.lembur())));
      inputWaktuUser.statusPeringatan();

      sc.close();
  }    
}