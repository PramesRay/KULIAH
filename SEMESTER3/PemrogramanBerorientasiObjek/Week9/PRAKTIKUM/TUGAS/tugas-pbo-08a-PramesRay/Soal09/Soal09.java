/*
 * =======================================================================================
 * Nama   : Prames Ray Lapian
 * NPM    : 140810210059 - A
 * Matkul : Praktikum Pemrograman Berbasis Objek
 * =======================================================================================
 * [PENJELASAN]
 * InvalidMatchingException merupakan costum exception yang dibuat untuk menyocokkan
 * antara password dengan confirm password yang umumnya ada pada proses registrasi.
 */

import java.util.Scanner;

class InvalidMatchingException extends Exception{

  public InvalidMatchingException() {
    super("Password yang diinput tidak sesuai!");
  }
  
}

public class Soal09{
  public static void menu() {
    Scanner sc = new Scanner(System.in);
    int opsi = 0;
    do {
      System.out.println();
      System.out.println();
      System.out.println("------------------");
      System.out.println("PROGRAM APA AJALAH");
      System.out.println("1. Menu 1");
      System.out.println("2. Menu 2");
      System.out.println("3. Menu 3");
      System.out.println("4. Menu 4");
      System.out.println("5. Menu 5");
      System.out.println("0. Keluar");
      System.out.println("------------------");
      System.out.print("Pilihan: ");
      opsi = sc.nextInt();
      System.out.println();
  
      switch (opsi) {
        case 1:
          System.out.println("[MENU 1]");
          System.out.println("Selamat datang di Menu 1");
          break;
        case 2:
          System.out.println("[MENU 2]");
          System.out.println("Selamat datang di Menu 2");
          break;
        case 3:
          System.out.println("[MENU 3]");
          System.out.println("Selamat datang di Menu 3");
          break;
        case 4:
          System.out.println("[MENU 4]");
          System.out.println("Selamat datang di Menu 4");
          break;
        case 5:
          System.out.println("[MENU 5]");
          System.out.println("Selamat datang di Menu 5");
          break;
        default:
          System.out.println("pilihan tidak ada");
      }    
    } while (opsi != 0);
  }

  public static void main(String[] args) throws InvalidMatchingException{
    try {
      String username = "prames";
      String password = "admin";
      String confirmPassword = "admin";

      if (password == confirmPassword) {
        menu();
      } 
      else {
        throw new InvalidMatchingException();
      }
      
    } catch (InvalidMatchingException e) {
      System.out.println();
      System.out.println("Ada Error: " + e.getMessage());
    }
  }
}
