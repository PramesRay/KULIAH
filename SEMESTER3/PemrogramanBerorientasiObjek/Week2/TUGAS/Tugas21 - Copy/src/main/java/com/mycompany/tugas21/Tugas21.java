import java.util.Scanner;
/**
 *
 * @author prame
 */
public class Tugas21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama = "", npm = "", mutu[] = {""}, kelulusan[] = {""};
        int n1 = 0, n2 = 0, n3 = 0, rata = 0;
        
        nama = inputString("Nama\t:");
        npm = inputString("NPM\t:");
        n1 = inputInt("Nilai 1\t:");
        n2 = inputInt("Nilai 2\t:");
        n3 = inputInt("Nilai 3\t:");

        rata = ((n1+n2+n3)/3);
        
        nilaiAkhir(rata, mutu, kelulusan);

        print(mutu, kelulusan);
        sc.close();
    }
    
    static String inputString(String pesan) {
        Scanner sc = new Scanner(System.in);
        System.out.print(pesan);
        String str = sc.nextLine();

        return (str);
    }

    static int inputInt(String pesan) {
        Scanner sc = new Scanner(System.in);
        System.out.print(pesan);
        int num = sc.nextInt();

        return (num);
    }

    static void nilaiAkhir(int rata, String mutu[], String kelulusan[]){
        
        if (100 >= rata && rata >= 80) {
            mutu[0] = "A";
            kelulusan[0] = "Selamat anda dinyatakan lulus!";
        } else if (80 > rata && rata >= 68) {
            mutu[0] = "B";  
            kelulusan[0] = "Selamat anda dinyatakan lulus!";
        } else if (68 > rata && rata >= 55) {
            mutu[0] = "C";
            kelulusan[0] = "Selamat anda dinyatakan lulus!";
        } else if (55 > rata && rata >= 45) {
            mutu[0] = "D";
            kelulusan[0] = "Maaf anda dinyatakan gagal :( Tetap semangat yaa...";
        } else if (45 > rata && rata >= 0) {
            mutu[0] = "E";
            kelulusan[0] = "Maaf anda dinyatakan gagal :( Tetap semangat yaa...";
        }   
    }

    static void print(String mutu[], String kelulusan[]) {
        System.out.println();
        System.out.println("Nilai = " + mutu[0] + " (" + kelulusan[0] + ")");
    }
}
