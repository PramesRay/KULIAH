package javaPackage;
/*
* Nama          : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
* NPM           : 140810210015 , 140810200042 , 140810210059 , 140810210039
* Kelas         : A
* Tanggal       : 11 November 2022
* Nama Program  : Inheritance.java
* Deskripsi     : UTS SOAL 4 dengan Inheritance
*/

import java.util.Scanner;

public class LarikKendaraan{
    private int ukuran;
    private Kendaraan p[] = new Kendaraan[100];

    public LarikKendaraan(int ukuran){
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