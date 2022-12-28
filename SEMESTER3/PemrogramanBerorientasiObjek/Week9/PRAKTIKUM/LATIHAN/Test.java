import java.util.Scanner;

public class Test {
  public static String nilai(int angka) throws IllegalGradeException {
    if (angka > 0 || angka < 100) {
      return ("Nilai anda adalah " + angka);
    }
    else {
      throw new IllegalGradeException();
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.print("Berape angkanye? ");
      int angka = sc.nextInt();
      System.out.println(nilai(angka));
    } catch (Exception e) {
      System.out.println();
      System.out.println(e.getClass() + ": " +  e.getMessage());
      System.out.println();
    }
  }  
}
