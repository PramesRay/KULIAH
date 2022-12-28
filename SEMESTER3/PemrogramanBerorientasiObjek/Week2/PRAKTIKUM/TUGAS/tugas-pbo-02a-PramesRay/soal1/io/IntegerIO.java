/*
* Nama      : Prames Ray Lapian
* NPM       : 140810210059  
* Kelas     : A
* Tanggal   : 19 Sept 2022
* Deskripsi : Class jawaban assignment-02 soal-01
*/

package io;

import java.util.Scanner;

public class IntegerIO {
  private int num = 0;
  private char op = 'a';

  public int inputInt(String pesan) {
    Scanner sc = new Scanner(System.in);

    System.out.print(pesan);
    this.num = sc.nextInt();

    return (this.num);
  }

  public char inputChar(String pesan) {
    Scanner sc = new Scanner(System.in);
    System.out.print(pesan);
    this.op = sc.next().charAt(0);

    return (this.op);
  }  

  public void print(int output) {
    System.out.println();
    System.out.println("Hasil : " + output);
  }

}
