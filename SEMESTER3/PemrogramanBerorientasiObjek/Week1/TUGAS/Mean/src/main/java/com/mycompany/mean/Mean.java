/*  Nama program    : Mean
    Nama            : Prames
    NPM             : 140810210059
    Tanggal buat    : 6 September 2022
    Deskripsi       : Program mencari rata-rata dalam 
******************************************************/

package com.mycompany.mean;

/**
 *
 * @author prame
 */
public class Mean {

    public static void main(String[] args) {
        //variable
        int[] number = {10, 20, 45};
        int mean = 0, total = 0;
    
        //Memjumlahkan seluruh bilangan
        for (int i = 0; i < number.length; i++) {
            total += number[i];
        }

        //Rumus mean
        mean = total / number.length;
        
        //Menampilkan seluruh bilangan terkait
        for (int i = 0; i < number.length; i++) {
            System.out.println("Number " + (i+1) + ": " + number[i]);
        }
    
        //Menampilkan hasil
        System.out.println("Rata-rata = " + mean);  
        }
}
