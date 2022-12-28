/*
 * =======================================================================================
 * Nama   : Prames Ray Lapian
 * NPM    : 140810210059 - A
 * Matkul : Praktikum Pemrograman Berbasis Objek
 * =======================================================================================
 * [PENJELASAN]
 * NumberFormatException merupakan suatu kondisi exception
 * dimana suatu Variabel bertipe data String yang diubah 
 * menjadi Integer namun format dari variabel tersebut tidak 
 * sesuai atau tidak memungkikan untuk diubah menjadi Integer.
 */

import java.util.Scanner;

public class Soal08 {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    try {
      System.out.print("Masukkan string: ");
      String input = sc.nextLine();
  
      int number =  Integer.parseInt(input);
      System.out.println("Hasil Convert: " + number);
    } catch (NumberFormatException e) {
      System.out.println("Ada Error   : " + e.getMessage());
      System.out.println("Class Error : " + e.getClass());
    }
  }
}
