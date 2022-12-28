/*
Program : Tugas 4
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
class Asterisk {
    Scanner sc = new Scanner(System.in);

    //Variable
    private int angka;

    //Constructor #1
    public Asterisk(){
        this.angka = 0;
    }

    //Constructor #2
    public Asterisk(int angka){
        this.angka = angka;
    }

    //Setter Angka
    public void setAngka(int angka){
        this.angka = angka;
    }

    //Getter Angka
    public int getAngka(){
        return this.angka;
    }

    //Method Input
    public void inputAngka(){
        sc = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        this.angka = sc.nextInt();
    }
    
    //Method Pencari Hasil dengan For
    public void cariHasilDenganFor(){
        for(int i = this.angka; i >= 1; i--){
            System.out.print((this.angka - i + 1) + ".");
            for(int j = i; j >= 1; j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    //Method Pencari Hasil dengan While
    public void cariHasilDenganWhile(){
        int i = 1, j;
        while(i <= this.angka){
            System.out.print(i + ".");
            j = 1;
            while(j <= i){
                System.out.print(" *");
                j++;
            }
            i++;
            System.out.println();
        }
    }

    //Method Print
    public void printHasil(){
        System.out.println("---For Loop---");
        cariHasilDenganFor();
        System.out.println("---While Loop---");
        cariHasilDenganWhile();
    }
}

//---------------------------------------------------------------------------------------
public class Tugas24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Asterisk angkaUser = new Asterisk(); //Tes Constructor#1
        Asterisk angkaSystem = new Asterisk(5); //Tes Constructor#2
        
        //System Input : Angka di input langsung didalam codingan
        System.out.println("[System Input]");
        angkaSystem.printHasil();
        System.out.println();
        
        //User Input : Angka di input manual oleh User
        System.out.println("[User Input]");
        angkaUser.inputAngka();
        angkaUser.printHasil();

        sc.close();
    }
}