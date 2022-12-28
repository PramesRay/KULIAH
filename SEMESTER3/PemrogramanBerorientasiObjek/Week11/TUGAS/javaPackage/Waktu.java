package javaPackage;    
import java.util.Scanner;

public class Waktu{
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
