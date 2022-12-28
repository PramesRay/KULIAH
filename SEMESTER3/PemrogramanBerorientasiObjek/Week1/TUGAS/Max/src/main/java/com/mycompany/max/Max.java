/*  Nama program    : Max
    Nama            : Prames
    NPM             : 140810210059
    Tanggal buat    : 6 September 2022
    Deskripsi       : Program mencari bilangan terbesar dari sekian banyak bilangan 
******************************************************/

package com.mycompany.max;

/**
 *
 * @author prame
 */
public class Max {

    public static void main(String[] args) {
        //variable
        int[] number = {10, 23, 5};
        int max = number[0];
        int a = 10, b = 23, c = 5;

        //Mencari nilai maksimum v1
        for (int i = 0; i < number.length; i++) {
          if (number[i] > max){
            max = number[i];
          }
        }
        
        //Mencari nilai maksimum v2
        int m1 = (a < b)? b : a;
        int m2 = (m1 < c)? c : m1;

        //Menampilkan seluruh bilangan terkait
        for (int i = 0; i < number.length; i++) {
          System.out.println("Number " + (i+1) + ": " + number[i]);
        }

        //Menampilkan hasil v1
        System.out.println("Nilai Maksimum v1 : "+max);
        
        //Menampilkan hasil v2
        System.out.println("Nilai Maksimum v2 : "+ m2);
    }
}
