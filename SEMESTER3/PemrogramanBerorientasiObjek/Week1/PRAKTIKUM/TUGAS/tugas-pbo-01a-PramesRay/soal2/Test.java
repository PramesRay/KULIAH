/*
* Nama      : Prames Ray Lapian
* NPM       : 59
* Kelas     : A
* Tanggal   : 12 September 2022
* Deskripsi : Class jawaban exercise-01 soal-02
*/

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    Manusia aku = new Manusia();
    
    Scanner sc = new Scanner(System.in);
    String nama;
    String npm;
    
    System.out.println("Sebelum input: ");
    System.out.println("Nama : " + aku.getnama());
    System.out.println("NPM : " + aku.getnpm());

    System.out.println();
    System.out.print("Nama : ");
    nama = sc.nextLine();
    aku.setnama(nama);
    
    System.out.print("NPM : ");
    npm = sc.nextLine();
    aku.setnpm(npm);
    
    System.out.println();
    System.out.println("Sesudah input: ");
    System.out.println("Nama : " + aku.getnama());
    System.out.println("NPM : " + aku.getnpm());
    
    sc.close();
  }
}