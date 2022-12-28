package com.mycompany.tugas22;
import java.util.Scanner;

/**
 *
 * @author prame
 */
public class Tugas22 {

    public static void main(String[] args) {
        int num = 0;
        String word = "Default"; 
        
        System.out.print("Input (1-10): ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        System.out.println();
    
        //if-else statement
        System.out.println("[If-Else statement]");
        System.out.println(num + " = " + ifElse(num));
        System.out.println();

        //Switch statement
        System.out.println("[Switch-Case Statement]");
        
        System.out.println(num + " = " + switchStatement(num));
        
        sc.close();
    }

    static String ifElse(int num) {
        String word = "";
        
        if(num == 1) 
            word = "Satu";
        else if(num == 2) 
            word = "Dua";
        else if(num == 3) 
            word = "Tiga";
        else if(num == 4) 
            word = "Empat";
        else if(num == 5) 
            word = "Lima";
        else if(num == 6) 
            word = "Enam";
        else if(num == 7) 
            word = "Tujuh";
        else if(num == 8) 
            word = "Delapan";
        else if(num == 9) 
            word = "Sembilan";
        else if(num == 10) 
            word = "Sepuluh";
        else {
           word = "Invalid Number";
        }
        
        return word;
        
    }

    static String switchStatement(int num) {
        String word = "";
        
        switch (num) {
            case 1:
                word = "Satu";
                break;
            case 2:
                word = "Dua";
                break;
            case 3:
                word = "Tiga";
                break;
            case 4:
                word = "Empat";
                break;
            case 5:
                word = "Lima";
                break;
            case 6:
                word = "Enam";
                break;
            case 7:
                word = "Tujuh";
                break;
            case 8:
                word = "Delapan";
                break;
            case 9:
                word = "Sembilan";
                break;
            case 10:
                word = "Sepuluh";
                break;
            default:
                word = "Invalid Number";
                break;            
        }
		
        return word;
    }
}
