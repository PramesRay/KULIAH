/*
* Nama      : Prames Ray Lapian
* NPM       : 59
* Kelas     : A
* Tanggal   : 12 September 2022
* Deskripsi : Class jawaban exercise-01 soal-01
*/

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mau berapa kali input? ");
        int banyakInput = sc.nextInt();
        
        String[] input = new String[20];
        Scanner sc2 = new Scanner(System.in);

        for(int i = 1; i <= banyakInput; i++) {
            System.out.print("Masukkan Input ke- " + i + ": ");
            input[i] = sc2.nextLine();
        }
        
        for(int i = 1; i <= banyakInput; i++) {
            System.out.print(input[i] + " ");
        }

        sc.close();
        sc2.close();
    }
}