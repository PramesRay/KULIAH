import java.util.Scanner;

/**
 *
 * @author prame
 */
public class Tugas21 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan nama : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NPM : ");
        String npm = sc.nextLine();
        
        System.out.print("Masukkan nilai ke-1 : ");
        int n1 = sc.nextInt();
        System.out.print("Masukkan nilai ke-2 : ");
        int n2 = sc.nextInt();
        System.out.print("Masukkan nilai ke-3 : ");
        int n3 = sc.nextInt();
        
        int rata = ((n1+n2+n3)/3);
           
        System.out.println();
        System.out.println("Nama  = " + nama);
        System.out.println("NPM   = " + npm);
        nilaiAkhir(rata);
        
        sc.close();
    }  
    
    static void nilaiAkhir(int rata){
        String mutu = "", kelulusan = "";
        if (100>=rata && rata>=80){
            mutu = "A";
            kelulusan = "Lulus";
        } else if (80>rata && rata>=68){
            mutu = "B";  
            kelulusan = "Lulus";
        } else if (68>rata && rata>=55){
            mutu = "C";
            kelulusan = "Lulus";
        } else if (55>rata && rata>=45){
            mutu = "D";
            kelulusan = "Gagal";
        } else if (45>rata && rata>=0){
            mutu = "E";
            kelulusan = "Gagal";
        }
        System.out.println("Nilai = " + mutu + " (" + kelulusan + ")");
    }
}
