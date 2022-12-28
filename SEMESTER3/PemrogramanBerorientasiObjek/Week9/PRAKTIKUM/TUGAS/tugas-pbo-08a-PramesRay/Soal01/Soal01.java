/*
 * =======================================================================================
 * Nama   : Prames Ray Lapian
 * NPM    : 140810210059
 * Kelas  : A
 * Tanggal: 7 November 2022
 * =======================================================================================
 * [PENJELASAN]
 * InterruptedIOException merupakan suatu kondisi exception
 * dimana suatu program terinterupsi.
 * =======================================================================================
 */

import java.io.InterruptedIOException;
import java.util.Scanner;

public class Soal01  {
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
        try {
            int i = 0;

            System.out.println("Selamat datang di Program Looping!");
            System.out.println("Anda akan diminta untuk menginput angka selama 10x");
            System.out.println();
            Thread.sleep(2000);
            while (true) {
              if (i == 5) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
              }
              System.out.print("Masukkan sebuah angka ke-" + (i+1) + ": ");
              int number = sc.nextInt();
              System.out.println("Output\t\t: " + number);
              i++;
            }
          } catch(InterruptedIOException str) {
            System.out.println();
            System.out.println("Ada error       : Proses loop terinterupsi");
            System.out.println("Class Exception : " + str);
        }

  }
}
