/*
 * =======================================================================================
 * Nama   : Prames Ray Lapian
 * NPM    : 140810210059 - A
 * Matkul : Praktikum Pemrograman Berbasis Objek
 * =======================================================================================
 * [PENJELASAN]
 * NegativeArraySizeException merupakan suatu kondisi exception
 * dimana suatu array dibuat dengan ukuran yang bernilai negatif.
 */

import java.util.Scanner;

public class Soal07 {
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    
    try {
      System.out.print("Masukkan Besar Array: ");
      int num = sc.nextInt();
      num *= -1;

      int array[] = new int[num];
    } catch (NegativeArraySizeException e) {
      System.out.println("Ada Error   : " + e.getMessage());
      System.out.println("Class Error : " + e.getClass());
    }
  }
}
