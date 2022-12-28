/*
* Nama          : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
* NPM           : 140810210015 , 140810200042 , 140810210059 , 140810210039
* Kelas         : A
* Tanggal       : 16 November 2022
* Nama Program  : Kendaraan.java
* Deskripsi     : Soal parkir - class Kendaraan
*/
package Kendaraan;
import Waktu.Waktu;
import java.util.Scanner;

public abstract class Kendaraan {
        protected String no;
        protected String jenis;
        protected Waktu datang = new Waktu();
        protected Waktu pulang = new Waktu();
    
        public Kendaraan(){
            
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
        // hasil = getLamaJam() * 2000;

        public String getKendaraan(){
            String word = "";
            word += String.format("No kendaraan : " + this.no + "\n");
            word += String.format("Jenis        : " + this.jenis + "\n");
            word += String.format("Jam Masuk    : " + this.getWaktudatang().getWaktu() + "\n");
            word += String.format("Jam Pulang   : " + this.getWaktuPulang().getWaktu() + "\n");
            word += String.format("Lama Parkir  : " + this.getLamaParkir().getWaktu() + "\n");
            word += String.format("Lama jam     : " + this.getLamaJam() + "\n");
            word += String.format("Biaya        : " + this.getBiayaParkir() + "\n");
            
            return word;
        }
           
    
    
}

