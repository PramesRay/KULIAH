import java.util.Scanner;
/**
 *
 * @author prame
 */
public class Tugas23 {

    public static void main(String[] args) {
        String nama = "";
        int gol = 0;
        long gapok = 0;
        float potongan = 0, tunjangan = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama\t\t: ");
        nama = sc.nextLine();
        
        
        System.out.print("Golongan\t: ");
        gol = sc.nextInt();
        
        switch (gol) {
            case 1:
                gapok = 1500000;
                potongan = 0.01f;
                tunjangan = 0.1f;
                break;
                case 2:
                gapok = 2000000;
                potongan = 0.02f;
                tunjangan = 0.12f;
                break;
            case 3:
                gapok = 3000000;
                potongan = 0.02f;
                tunjangan = 0.12f;
                break;
            case 4:
                gapok = 5000000;
                potongan = 0.04f;
                tunjangan = 0.15f;
                break;
                
                default:
                break;
            }
            
        long gatot = (long) (gapok + (gapok*tunjangan) - (gapok*potongan));
            
        System.out.println("Gaji Pokok\t: " + gapok);
        System.out.println("Tunjangan\t: " + (int) (tunjangan*100) + "%");
        System.out.println("Potongan\t: " + (int) (potongan*100) + "%");
            
        System.out.println();
            
        System.out.println("Gaji Total\t: " + gatot);

        sc.close();
    }


}
