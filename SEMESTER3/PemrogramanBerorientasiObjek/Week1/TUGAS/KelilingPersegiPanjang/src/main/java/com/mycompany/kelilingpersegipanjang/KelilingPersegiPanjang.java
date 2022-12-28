/*  Nama program    : KelilingPersegiPanjang
    Nama            : Prames
    NPM             : 140810210059
    Tanggal buat    : 6 September 2022
    Deskripsi       : Program mencari Keliling Persegi Panjang
******************************************************/

package com.mycompany.kelilingpersegipanjang;

/**
 *
 * @author prame
 */
import java.util.Scanner;

public class KelilingPersegiPanjang {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan panjang : ");
    int panjang = sc.nextInt();
    System.out.print("Masukkan lebar : ");
    int lebar = sc.nextInt();

    int keliling = 2 * (panjang + lebar);
    
    System.out.println("Keliling persegi panjang : " + keliling);

    sc.close();
  }
}
