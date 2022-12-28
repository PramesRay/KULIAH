import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Shape test = new Area();

        System.out.print("Masukkan panjang : ");
        float p = scan.nextFloat();
        System.out.print("Masukkan lebar : ");
        float l = scan.nextFloat();
        System.out.print("Masukkan sisi : ");
        float s = scan.nextFloat();
        System.out.print("Masukkan jari-jari : ");
        float r = scan.nextFloat();

        System.out.println(test.rectangleArea(p, l));
        System.out.println(test.squareArea(s));
        System.out.println(test.circleArea(r));

        scan.close();
    }
}
