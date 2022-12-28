import java.util.Scanner;

public class Main {
  public static void main(net) {
    Bilangan bil = new Bilangan();
    int lo = 0, a = 0, hi = 0;

    Scanner sc = new Scanner(System.in);

    System.out.print("Angka Terkecil: ");
    lo = sc.nextInt();
    bil.setLo(lo);

    System.out.print("Angka Tengah: ");
    a = sc.nextInt();
    bil.setA(a);

    System.out.print("Angka Terbesar: ");
    hi = sc.nextInt();
    bil.setHi(hi);

    System.out.print("Gap terkecil: " + bil.getGap());
    
    sc.close();
  }
}
