/*
Program : Tugas 2
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
class convert{
    Scanner sc = new Scanner(System.in);

    //Variable
    private int num;

    //Constructor #1
    public convert(){
        this.num = 0;
    }

    //Constructor 2
    public convert(int num){
        this.num = num;
    }

    //Setter Angka
    public void setAngka(int num){
        this.num = num;
    }

    //Getter Angka
    public int getAngka(){
        return this.num;
    }

    //Input
    public void inputAngka(){
        System.out.print("Masukkan bilangan 1-10 : ");
        this.num = sc.nextInt();
    }

    //IfCase Proses
    public void ifCase(int num){
        String str = "";
        System.out.print("Menggunakan If\t\t: ");
        if(num == 1) 
            str = "Satu";
        else if(num == 2) 
            str = "Dua";
        else if(num == 3) 
            str = "Tiga";
        else if(num == 4) 
            str = "Empat";
        else if(num == 5) 
            str = "Lima";
        else if(num == 6) 
            str = "Enam";
        else if(num == 7) 
            str = "Tujuh";
        else if(num == 8) 
            str = "Delapan";
        else if(num == 9) 
            str = "Sembilan";
        else if(num == 10) 
            str = "Sepuluh";
        else 
            str = "Invalid Number";
        System.out.println(num + " dibaca '" + str + "'");
    }

    //SwitchCase Proses
    public void switchCase(int num){
        String str = "";
        System.out.print("Menggunakan Switch\t: ");
        switch(num) {
            case 1:
                str = "Satu";
                break;
            case 2:
                str = "Dua";
                break;
            case 3:
                str = "Tiga";
                break;
            case 4:
                str = "Empat";
                break;
            case 5:
                str = "Lima";
                break;
            case 6:
                str = "Enam";
                break;
            case 7:
                str = "Tujuh";
                break;
            case 8:
                str = "Delapan";
                break;
            case 9:
                str = "Sembilan";
                break;
            case 10:
                str = "Sepuluh";
                break;
            default:
                str = "Invalid Number";
                break;
        }
        System.out.println(num + " dibaca '" + str + "'");
    }
}

//---------------------------------------------------------------------------------------
public class Tugas22 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        convert angkaUser = new convert(); //Test Constructor #1
        convert angkaSystem = new convert(5); //Test Constructor #2
        
        //System Input : Angka di input langsung didalam codingan
        System.out.println("[Input Sistem]");
        angkaSystem.ifCase(angkaSystem.getAngka());
        angkaSystem.switchCase(angkaSystem.getAngka());
        System.out.println();

        //User Input : Angka di input manual oleh User
        System.out.println("\n[Input Manual]");
        angkaUser.inputAngka();
        angkaUser.ifCase(angkaUser.getAngka());
        angkaUser.switchCase(angkaUser.getAngka());
    
        sc.close();
    }
}