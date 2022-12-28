/*
Program : Tugas 1
Nama    : Prames Ray Lapian
NPM     : 140810210059
Kelas   : A
Tanggal : 5 Oktobrer  2022
Desc    : Tugas Pertemuan 5
*/
import java.util.Scanner;

/**
 *
 * @author prame
 */
class Identity {
  Scanner sc = new Scanner(System.in);

  //Variable
  private String nama, npm, waktuMulai, waktuSelesai;
  private int nilai;

  //Constructor #1
  public Identity(){
      this.nilai = 0; 
      this.nama = ""; 
      this.npm = "";
      this.waktuMulai = "";
      this.waktuSelesai = "";
  }

  //Constructor #2
  public Identity(String nama, String npm){
      this.nama = nama;
      this.npm = npm;
  }

  //Setter Nama
  public void setNama(String nama){
      this.nama = nama;
  }

  //Setter NPM
  public void setNPM(String npm){
      this.npm = npm;
  }

  //Setter Angka
  public void setAngka(int nilai){
      this.nilai = nilai;
  }

  //Setter Waktu
  public void setWaktu(String waktuMulai, String waktuSelesai){
    this.waktuMulai = waktuMulai;
    this.waktuSelesai = waktuSelesai;
  }

  //Getter Nama
  public String getNama(){
      return this.nama;
  }

  //Getter NPM
  public String getNPM(){
      return this.npm;
  }

  //Getter Nilai
  public int getNilai(){
      return this.nilai;
  }

  //Getter Waktu Mulai
  public String getWaktuMulai(){
      return this.waktuMulai;
  }
  
  //Getter Waktu Selesai
  public String getWaktuSelesai(){
      return this.waktuSelesai;
  }

  //Method Input
  public void inputData(){
      System.out.print("Nama\t\t: ");
      this.nama = sc.nextLine();
      System.out.print("NPM\t\t: ");
      this.npm = sc.nextLine();
      
      System.out.print("Waktu Mulai\t: ");
      this.waktuMulai = sc.nextLine();
      System.out.print("Waktu Selesai\t: ");
      this.waktuSelesai = sc.nextLine();
      
      System.out.print("Nilai\t\t: ");
      this.nilai = sc.nextInt();
  }

  //Method Pencari + Output Durasi
  public void durasi(){
    String strArrMulai[]= this.waktuMulai.split(":");
    int jamMulai = Integer.parseInt(strArrMulai[0]) ;
    int menitMulai = Integer.parseInt(strArrMulai[1]) ;
    int detikMulai = Integer.parseInt(strArrMulai[2]) ;
    
    String strArrSelesai[]= this.waktuSelesai.split(":");
    int jamSelesai = Integer.parseInt(strArrSelesai[0]);
    int menitSelesai = Integer.parseInt(strArrSelesai[1]);
    int detikSelesai = Integer.parseInt(strArrSelesai[2]);

    if (detikMulai > detikSelesai){
      detikSelesai = detikSelesai + 60;
      menitSelesai--;
    }
    if (menitMulai > menitSelesai){
      menitSelesai = menitSelesai + 60;
      jamSelesai--;
    }

    int durasiMenit = menitSelesai - menitMulai;
    int durasiDetik = detikSelesai - detikMulai;
    int durasiJam = jamSelesai - jamMulai;

    System.out.println("Durasi\t\t: " + durasiJam + " jam " + durasiMenit + " menit " + durasiDetik + " detik ");

  }
  
  //Method Pencari Nilai Mutu
  public String nilaiMutu(){
      String mutu = "";
      if (100>=this.nilai && this.nilai>=80){
          mutu = "A";
      } else if (80>this.nilai && this.nilai>=68){
          mutu = "B";  
      } else if (68>this.nilai && this.nilai>=55){
          mutu = "C";
      } else if (55>this.nilai && this.nilai>=45){
          mutu = "D";
      } else if (45>this.nilai && this.nilai>=0){
          mutu = "E";
      }
      return mutu;
  }

  //Method Penentu Status Kelulusan
  public String kelulusan(){
      String lulus = "";
      if (100>=this.nilai && this.nilai>=55){
          lulus = "Selamat Anda Dinyatakan Lulus";
      } else if (55>this.nilai && this.nilai>=0){
          lulus = "Maaf Anda Dinyatakan Gagal";
      }
      return lulus;
  }

  //Method Print Identyty
  public void printId(String nama, String npm){
      System.out.println("Nama\t\t: " + nama);
      System.out.println("NPM\t\t: " + npm);
  }

  //Method Print Hasil
  public void printNilai(String mutu, String lulus){
      System.out.println("Nilai Mutu\t: " + mutu + " (" + lulus + ")");
  }

}

//=======================================================================================================================================

public class Tugas51 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    Identity angkaSystem = new Identity("Prames Ray Lapian", "140810210059"); //Test Constructor #2
    Identity angkaUser = new Identity(); //Test Constructor #1
    
    //System Input : Angka di input langsung didalam codingan
    System.out.println("[System Input]");
    angkaSystem.setAngka(85);
    angkaSystem.setWaktu("08:00:00", "10:00:00");
    angkaSystem.printId(angkaSystem.getNama(), 
                        angkaSystem.getNPM());
    System.out.println("Waktu Mulai\t: " + angkaSystem.getWaktuMulai()); 
    System.out.println("Waktu Selesai\t: " + angkaSystem.getWaktuSelesai()); 
    System.out.println("Nilai\t\t: " + angkaSystem.getNilai()); 
    angkaSystem.printNilai(angkaSystem.nilaiMutu(), 
                           angkaSystem.kelulusan());
    angkaSystem.durasi();

    System.out.println();

    //User Input Parent Class: Angka di input manual oleh User melalui fungsi yang ada di Class Parent
    System.out.println("[User Input]");
    angkaUser.inputData();
    angkaUser.printNilai( angkaUser.nilaiMutu(), 
                          angkaUser.kelulusan());
    angkaUser.durasi();
    
    System.out.println();

    sc.close();
  }

  static String inputString(String pesan) {
      Scanner sc = new Scanner(System.in);
      System.out.print(pesan);
      String str = sc.nextLine();

      return (str);
  }

  static int inputInt(String pesan) {
      Scanner sc = new Scanner(System.in);
      System.out.print(pesan);
      int num = sc.nextInt();

      return (num);
  }
}