/*
Program = Tugas 1
Nama    = Satria Alief
NPM     = 140810210051
Kelas   = A
Tanggal = 22 September  2022
Desc    = pertemuan 4
*/
import java.util.Scanner;
class penilaian{
    private String nama, npm;
    private int a, b, c;
    Scanner scan = new Scanner(System.in);

    public penilaian(){
        this.a = 0; this.b = 0; this.c = 0;
        this.nama = ""; this.npm = "";
    }

    public penilaian(String nama, String npm){
        this.nama = nama;
        this.npm = npm;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNPM(String npm){
        this.npm = npm;
    }

    public void setAngka(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void inputAll(){
        System.out.print("Masukkan nama : ");
        this.nama = scan.nextLine();
        System.out.print("Masukkan npm : ");
        this.npm = scan.nextLine();
        System.out.print("Masukkan angka ke-1 : ");
        this.a = scan.nextInt();
        System.out.print("Masukkan angka ke-2 : ");
        this.b = scan.nextInt();
        System.out.print("Masukkan angka ke-3 : ");
        this.c = scan.nextInt();
    }

    public String getNama(){
        return this.nama;
    }

    public String getNPM(){
        return this.npm;
    }

    public int getN1(){
        return this.a;
    }

    public int getN2(){
        return this.b;
    }

    public int getN3(){
        return this.c;
    }

    public float cariRata(int a, int b, int c){
        float x = ((this.a+this.b+this.c)/3);
        return x;
    }

    public String nilaiMutu(float x){
        String mutu = "";
        if (100>=x && x>=80){
            mutu = "A";
        } else if (80>x && x>=68){
            mutu = "B";  
        } else if (68>x && x>=55){
            mutu = "C";
        } else if (55>x && x>=45){
            mutu = "D";
        } else if (45>x && x>=0){
            mutu = "E";
        }
        return mutu;
    }

    public String kelulusan(float x){
        String lulus = "";
        if (100>=x && x>=55){
            lulus = "Lulus";
        } else if (55>x && x>=0){
            lulus = "Gagal";
        }
        return lulus;
    }
}

//----------------------------------------------------------------------------------------
public class P4Tugas1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        penilaian obj1 = new penilaian("Satria Alief", "140810210051");
        penilaian obj2 = new penilaian();
    
        //input sistem
        System.out.println("~~~~~ Input Sistem ~~~~~");
        obj1.setAngka(85, 70, 90);
        float rataObj1 = obj1.cariRata(obj1.getN1(), obj1.getN2(), obj1.getN3());
        System.out.println("Output :");
        printId(obj1.getNama(), obj1.getNPM());
        printNilai(obj1.nilaiMutu(rataObj1), obj1.kelulusan(rataObj1));

        //input manual
        System.out.println("\n~~~~~ Input Manual ~~~~~");
        obj2.inputAll();
        float rataObj2 = obj2.cariRata(obj2.getN1(), obj2.getN2(), obj2.getN3()); 
        System.out.println("\nOutput :");
        printId(obj2.getNama(), obj2.getNPM());
        printNilai(obj2.nilaiMutu(rataObj2), obj2.kelulusan(rataObj2));

        scan.close();
    }

    static void printId(String a, String b){
        System.out.println("Nama       = " + a);
        System.out.println("NPM        = " + b);
    }

    static void printNilai(String a, String b){
        System.out.println("Nilai Mutu = " + a + " (" + b + ")");
    }
}
