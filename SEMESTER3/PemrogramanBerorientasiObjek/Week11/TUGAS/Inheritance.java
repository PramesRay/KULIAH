import java.util.Scanner;
import javaPackage.Waktu;
import javaPackage.Kendaraan;
import javaPackage.LarikKendaraan;
import javaPackage.Mobil;
import javaPackage.Motor;
import javaPackage.Truck;

public class Inheritance{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int uk;
        System.out.print("Masukkan banyak kendaraan : ");
        uk = input.nextInt();

        System.out.print("\033[H\033[2J");  
        System.out.flush();

        LarikKendaraan lp = new LarikKendaraan(uk);

        lp.inputLarikParkir();
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        lp.cetakTabelParkir();

        System.out.println("Total Biaya Parkir adalah = "+ lp.totalBiaya());   
    }
}