/*  Nama program    : NestedLoop
    Nama            : Prames
    NPM             : 140810210059
    Tanggal buat    : 8 September 2022
    Deskripsi       : Program mencari rata-rata dalam 
******************************************************/

package com.mycompany.nestedloop;
import java.util.Scanner;

/**
 *
 * @author prame
 */
public class NestedLoop {

    public static void main(String[] args) {
        int baris = input("Masukkan Baris : ");
        int kolom = input("Masukkan kolom : ");
        
        printAsterik(baris, kolom); 
    }
    
    static int input(String pesan) {
        Scanner sc = new Scanner(System.in);

        System.out.print(pesan);
        int hasil = sc.nextInt();
        
        return (hasil);
    }
    
    static void printAsterik(int baris, int kolom) {
        int i = 1;
        while (i <= baris) {
            System.out.print(i + ". ");
            
            int j = 1;
            while (j <= kolom) {
                System.out.print("* ");
                j++;
            }
            
            i++;
            System.out.println();
        }
    }
}
