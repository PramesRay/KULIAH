/*
* Nama      : Prames Ray Lapian
* NPM       : 140810210059  
* Kelas     : A
* Tanggal   : 19 Sept 2022
* Deskripsi : Class jawaban assignment-02 soal-02
*/

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manusia[] human = new Manusia[5];
        String nama;
        int umur;

        for (int i = 0; i < 5; i++){
            sc = new Scanner(System.in);
            System.out.println("|" + (i+1) + "|");
            System.out.print("Nama : ");
            nama = sc.nextLine();
            System.out.print("Umur : ");
            umur = sc.nextInt();
            human[i] = new Manusia(nama, umur);
        }

        System.out.println();
        
        for (int i = 0; i < 5; i++){
            System.out.println();
            System.out.println("Orang ke-" + (i+1));
            System.out.println("Nama : " + human[i].getNama());
            System.out.println("Umur : " + human[i].getUmur());
        }

        sc.close();
    }
}