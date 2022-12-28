/*
Program : Tugas 5
Nama    : Prames Ray Lapian
NPM     : 140810210059
Kelas   : A
Tanggal : 24 September  2022
Desc    : pertemuan 4
*/
import java.util.Scanner;

/**
 *
 * @author prame
 */
class Perpangkatan{
    Scanner sc = new Scanner(System.in);
    
    //Variable
    private int angka, pangkat;

    //Constructor #1
    public Perpangkatan(){
        this.angka = 0;
        this.pangkat = 0;
    }

    //Constructor #2
    public Perpangkatan(int angka, int pangkat){
        this.angka = angka;
        this.pangkat = pangkat;
    }

    //Setter All Atribute
    public void setBilangan(int angka, int pangkat){
        this.angka = angka;
        this.pangkat = pangkat;
    }

    //Setter Angka
    public void setAngka(int angka){
        this.angka = angka;
    }
    
    //Setter Pangkat
    public void setPangkat(int pangkat){
        this.pangkat = pangkat;
    }

    //Getter Angka
    public int getAngka(){
        return this.angka;
    }
    
    //Getter Pangkat
    public int getpangkat(){
        return this.pangkat;
    }

    //Method Input
    public void inputBilangan(){
        sc = new Scanner(System.in);
        System.out.print("Masukkan Angka\t\t\t: ");
        this.angka = sc.nextInt();
        System.out.print("Masukkan Pangkat\t\t: ");
        this.pangkat = sc.nextInt();
    }

    //Method Pencari Hasil dengan While
    public int cariHasilDenganWhile(){
        int i = 1, hasil = this.angka;
        
        while(i < this.pangkat){
            hasil *= this.angka;
            i++;
        }
        
        return hasil;
    }
    
    //Method Pencari Hasil dengan Do-While
    public int cariHasilDenganDoWhile(){
        int i = 1, hasil = this.angka;
        
        do{
            if(this.pangkat == 1){
                hasil = this.angka;
                i++;
            } else {
                hasil *= this.angka;
                i++;
            }
        } while(i < this.pangkat);
        
        return hasil;
    }
    
    //Method Pencari Hasil dengan For
    public int cariHasilDenganFor(){
        int i = 1, hasil = this.angka;
                        
        for(i = 1; i < this.pangkat; i++){
            hasil *= this.angka;
        }
        
        return hasil;
    }

    //Method Print
    public void printHasil(){
        System.out.println("Hasil dengan While Loop\t\t: " + cariHasilDenganWhile());
        System.out.println("Hasil dengan Do-While Loop\t: " + cariHasilDenganDoWhile());
        System.out.println("Hasil dengan For Loop\t\t: " + cariHasilDenganFor());
    }
}

//---------------------------------------------------------------------------------------
public class Tugas25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Perpangkatan bilanganUser = new Perpangkatan(); //Tes Constructor#1
        Perpangkatan bilanganSystem = new Perpangkatan(2, 4); //Tes Constructor#2

        //System Input : Angka dan Pangkat di input langsung didalam codingan
        System.out.println("---System Input---");
        bilanganSystem.printHasil();
        System.out.println();
        
        //User Input : Angka dan Pangkat di input manual oleh User
        System.out.println("---User Input---");
        bilanganUser.inputBilangan();
        bilanganUser.printHasil();

        sc.close();
    }    
}
