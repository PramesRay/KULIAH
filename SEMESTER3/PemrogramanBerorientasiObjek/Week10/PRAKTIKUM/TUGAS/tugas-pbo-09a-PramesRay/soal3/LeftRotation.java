/*
* Nama      : Prames Ray Lapian
* NPM       : 140810210059
* Kelas     : A
* Tanggal   : 12 November 2022
* Deskripsi : Left Rotation
*/

import java.util.Scanner;

public class LeftRotation{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Larik arr = new Larik();

    arr.setJumlah(Integer.parseInt(sc.next())); 
    arr.setNumRotate(Integer.parseInt(sc.next()));
    
    for (int i = 0; i < arr.getJumlah(); i++) {
      arr.getLarik()[i] = Integer.parseInt(sc.next());
    }

    int[] hasilRotate = arr.rotLeft();
    for (int i = 0; i < hasilRotate.length; i++) {
      System.out.print(hasilRotate[i] + " ");
    }
  }
}

class Larik{
  private int[] larik;
  private int jumlah, numRotate;

  public Larik() {
    this.jumlah = 0;
    this.numRotate = 0;
  }
  public Larik(int[] larik, int jumlah, int numRotate) {
    this.larik = larik;
    this.jumlah = jumlah;
    this.numRotate = numRotate;
  }

  public void setLarik(int[] larik) {
    this.larik = larik;
  }
  public void setJumlah(int jumlah) {
    this.jumlah = jumlah;
    this.larik = new int[jumlah];
  }
  public void setNumRotate(int numRotate) {
    this.numRotate = numRotate;
  }
  
  public int[] getLarik() {
    return larik;
  }
  public int getJumlah() {
    return jumlah;
  }
  public int getNumRotate() {
    return numRotate;
  }
  
  public int[] rotLeft() {
      
    this.numRotate %= this.jumlah;

    for (int i = 0; i < this.numRotate; i++) {
      int temp = this.larik[0];
      for (int j = 0; j < this.jumlah-1; j++) {
        this.larik[j] = this.larik[j+1];
      }
      this.larik[this.jumlah-1] = temp;
    }
    return this.larik;
  }
}