package com.mycompany.tugas25;
import java.util.Scanner;

/**
 *
 * @author prame
 */
public class Tugas25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j, hasil;
        
        System.out.print("Masukkan angka : ");
        int x = scan.nextInt();
        
        System.out.print("Masukkan pangkat : ");
        int n = scan.nextInt();
        
        if(n == 0){
            hasil = 1;
            System.out.println("Hasil : " + hasil);
        } else {         
            whileStatement(x, n);
            doWhileStatement(x, n);
            forStatement(x, n);
        }
    }    
        
    static void whileStatement(int x, int n) {
        int i = 1, hasil = x;
            
        while(i < n){
            hasil *= x;
            i++;
        }

        System.out.println("Hasil dari loop While : " + hasil);
    }
    
    static void doWhileStatement(int x, int n) {
        int i = 1, hasil = x;
            
        do{
            if(n == 1){
                hasil = x;
                i++;
            } else {
                hasil *= x;
                i++;
            }
        } while(i < n);

        System.out.println("Hasil dari loop Do While : " + hasil);
    }
    
    static void forStatement(int x, int n) {
        int i = 1, hasil = x;
            
        hasil = x;
            
            for(i = 1; i < n; i++){
                hasil *= x;
            }

        System.out.println("Hasil dari loop For = " + hasil);
    }
    
    
}