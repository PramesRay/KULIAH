package javaPackage;
import java.util.Scanner;

public abstract class Kendaraan{
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