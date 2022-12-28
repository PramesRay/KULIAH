import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String nama;
    String npm;
      
    System.out.print("Nama : ");
    nama = sc.nextLine();
    
    System.out.print("NPM : ");
    npm = sc.nextLine();
  
    System.out.println("Nama : " + nama);
    System.out.println("NPM : " + npm);
    
    sc.close();
  }
}