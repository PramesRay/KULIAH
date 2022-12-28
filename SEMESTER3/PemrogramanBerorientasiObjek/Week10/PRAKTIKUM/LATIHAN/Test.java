import java.util.Scanner;
import java.util.HashSet;

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println();
    
    System.out.print("Masukkan Besar Array: ");
    int size = sc.nextInt();
    System.out.println();
    
    HashSet<Integer> hs = new HashSet<Integer>(size);
    for (int i = 0; i < size; i++) {
      System.out.print("Input angka ke-" + (i+1) + ": ");
      int input = sc.nextInt();
      hs.add(input);
    }
    
    System.out.print("Masukkan perbedaan nilai: ");
    int k = sc.nextInt();
    
    int count = 0;
    
    for (Integer each : hs) {
      if (hs.contains(each + k)) {
        count++;
      }
    }
    System.out.println("Banyak pasangan yang memiliki selisih 2: " + count);
    
    for (Integer each : hs) {
      if (hs.contains(each + k) ) {
        System.out.print("Pasangan: " + hs.size() + " dan " + hs.size());
      }
    }
    System.out.println();
  }
}