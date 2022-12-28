/*
 * =======================================================================================
 * Nama   : Prames Ray Lapian
 * NPM    : 140810210059 - A
 * Matkul : Praktikum Pemrograman Berbasis Objek
 * =======================================================================================
 * [PENJELASAN]
 * ArrayIndexOutOfBoundsException merupakan suatu kondisi exception
 * dimana suatu array diakses dengan index yang diluar ukuran dari
 * array tersebut. Bisa diakses dengan index negatif maupun positif.
 * Contoh: Array berukuran 3 diakses dengan index Array[>3] dan atau Array[<0]
 */

import java.io.*;

public class Soal06{
  public static void main(String[] args) throws Exception{
    try {
      int[] arr = {1, 2, 3};
      int i = 0;
      while (i<5) {
        System.out.println(arr[i]);
        Thread.sleep(1000);
        i++;
      }
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Ada Error   : " + e.getMessage());
      System.out.println("Class Error : " + e.getClass());
  }
  }
}
