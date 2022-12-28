/*
* Nama      : Prames Ray Lapian
* NPM       : 140810210059  
* Kelas     : A
* Tanggal   : 19 Sept 2022
* Deskripsi : Class jawaban assignment-02 soal-01
*/

import io.IntegerIO;
import java.util.Scanner;
import util.Calculator;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntegerIO main = new IntegerIO();
        Calculator util = new Calculator();

        int num1 = main.inputInt("Angka ke-1 \t: ");
        int num2 = main.inputInt("Angka ke-2 \t: ");
        char op = main.inputChar("Operasi \t: ");

        switch (op) {
            case '+':
                main.print(util.tambah(num1, num2));
                break;
            case '-':
                main.print(util.kurang(num1, num2));
                break;
            case '*':
                main.print(util.kali(num1, num2));
                break;
            case '/':
                main.print(util.bagi(num1, num2));
                break;
        }
    }
}