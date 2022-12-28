/*
* Nama      : Prames Ray Lapian
* NPM       : 140810210059  
* Kelas     : A
* Tanggal   : 19 Sept 2022
* Deskripsi : Class jawaban assignment-02 soal-04
*/
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Addition main = new Addition();

        System.out.print("Angka ke-1 : ");
        int num1 = sc.nextInt();
        main.setNum(num1);
        System.out.print("Angka ke-2 : ");
        int num2 = sc.nextInt();
        main.setNum(num2);        
        System.out.println("Hasil : " + output(num1, num2));
        System.out.println();
        
        System.out.print("Angka ke-3 : ");
        float num3 = sc.nextFloat();
        main.setNum(num3);
        System.out.print("Angka ke-4 : ");
        float num4 = sc.nextFloat();
        main.setNum(num4);
        System.out.println("Hasil : " + output(num3, num4));
        System.out.println();

    }

    static int output(int num1, int num2) {
        return (num1 + num2);
    }

    static float output(float num1, float num2) {
        return (num1 + num2);
    }
}