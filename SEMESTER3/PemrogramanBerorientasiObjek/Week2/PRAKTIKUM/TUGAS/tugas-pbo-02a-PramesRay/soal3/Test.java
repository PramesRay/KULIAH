/*
* Nama      : Prames Ray Lapian
* NPM       : 140810210059  
* Kelas     : A
* Tanggal   : 19 Sept 2022
* Deskripsi : Class jawaban assignment-02 soal-03
*/

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rekening rek = new Rekening();
        int num = 0, program = 1;

        do{
            menu();
            System.out.print("Pilih Menu : ");
            int opsi = sc.nextInt();
            switch (opsi){
                case 1:
                    System.out.println("Saldo terkini \t: Rp " + rek.getBalance());
                    break;
                case 2:
                    System.out.print("Masukkan saldo \t: Rp ");
                    num = sc.nextInt();
                    rek.addBalance(num);
                    System.out.println("Saldo total \t: Rp " + rek.getBalance());
                    break;
                case 0:
                    program = 0;
                    break;
            }
            System.out.println();
        } while (program != 0);

    }

    static void menu(){
        System.out.println("1. Tampilkan Saldo \n2. Tambah Saldo \n0. Exit");
    }
}