package com.mycompany.tugas24;
import java.util.Scanner;
/**
 *
 * @author prame
 */
public class Tugas24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan baris : ");
        int n = sc.nextInt();        
     
        System.out.println();
        loopFor(n);
        
        System.out.println();
        loopWhile(n);

        sc.close();
    }
    
    static void loopFor(int n){
        int i, j;
        for(i=n; i>=1; i--){
            System.out.print(i + ".");
            for(j=i; j>=1; j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    
    static void loopWhile(int n){
        int j, i=1;
        while(i<=n){
            System.out.print(i + ".");
            j=1;
            while(j<=i){
                System.out.print(" *");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}