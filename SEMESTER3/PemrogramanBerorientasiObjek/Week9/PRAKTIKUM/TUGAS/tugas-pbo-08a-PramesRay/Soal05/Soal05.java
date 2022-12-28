/*
 * =======================================================================================
 * Nama   : Prames Ray Lapian
 * NPM    : 140810210059 - A
 * Matkul : Praktikum Pemrograman Berbasis Objek
 * =======================================================================================
 * [PENJELASAN]
 * ArithmeticException merupakan suatu kondisi exception
 * dimana suatu aritmatika tidak bisa dioperasikan oleh aplikasi.
 * Contoh: Divide By Zero,
 *         Variabel yang menyimpan nilai terlalu besar sehingga compiler tidak menyanggupi
 * =======================================================================================
 */

import java.math.BigDecimal;

public class Soal05{
  public static void main(String[] args) throws Exception{
    try {
      BigDecimal test = new BigDecimal(11);
      BigDecimal test2 = new BigDecimal(17);
  
      test = test.divide(test2);
    } catch (ArithmeticException e) {
      System.out.println("Ada Error   : " + e);
      System.out.println("Class Error : " + e.getClass());
    }
  }
}
