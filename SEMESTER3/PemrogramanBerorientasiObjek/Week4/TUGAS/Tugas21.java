/*
Program : Tugas 1
Nama    : Prames Ray Lapian
NPM     : 140810210059
Kelas   : A
Tanggal : 24 September  2022
Desc    : pertemuan 4
*/
import java.util.Scanner;

/**
 *
 * @author prame
 */
class Penilaian{
    Scanner scan = new Scanner(System.in);

    //Variable
    private String nama, npm;
    private int num1, num2, num3;

    //Constructor #1
    public Penilaian(){
        this.num1 = 0; 
        this.num2 = 0; 
        this.num3 = 0;
        this.nama = ""; 
        this.npm = "";
    }

    //Constructor #2
    public Penilaian(String nama, String npm){
        this.nama = nama;
        this.npm = npm;
    }

    //Setter Nama
    public void setNama(String nama){
        this.nama = nama;
    }

    //Setter NPM
    public void setNPM(String npm){
        this.npm = npm;
    }

    //Setter Angka
    public void setAngka(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    //Getter Nama
    public String getNama(){
        return this.nama;
    }

    //Getter NPM
    public String getNPM(){
        return this.npm;
    }

    //Getter num1
    public int getNum1(){
        return this.num1;
    }
    
    //Getter num2
    public int getNum2(){
        return this.num2;
    }

    //Getter num3
    public int getNum3(){
        return this.num3;
    }

    //Method Input
    public void inputOuter(){
        System.out.print("Nama\t\t: ");
        this.nama = scan.nextLine();
        System.out.print("NPM\t\t: ");
        this.npm = scan.nextLine();
        System.out.print("Nilai ke-1\t: ");
        this.num1 = scan.nextInt();
        System.out.print("Nilai ke-2\t: ");
        this.num2 = scan.nextInt();
        System.out.print("Nilai ke-3\t: ");
        this.num3 = scan.nextInt();
    }
    
    //Method Operasi
    public float cariRata(int num1, int num2, int num3){
        float hasil = ((this.num1+this.num2+this.num3)/3);
        return hasil;
    }
    
    //Method Pencari Nilai Mutu
    public String nilaiMutu(float hasil){
        String mutu = "";
        if (100>=hasil && hasil>=80){
            mutu = "A";
        } else if (80>hasil && hasil>=68){
            mutu = "B";  
        } else if (68>hasil && hasil>=55){
            mutu = "C";
        } else if (55>hasil && hasil>=45){
            mutu = "D";
        } else if (45>hasil && hasil>=0){
            mutu = "E";
        }
        return mutu;
    }

    //Method Penentu Status Kelulusan
    public String kelulusan(float hasil){
        String lulus = "";
        if (100>=hasil && hasil>=55){
            lulus = "Selamat Anda Dinyatakan Lulus";
        } else if (55>hasil && hasil>=0){
            lulus = "Maaf Anda Dinyatakan Gagal";
        }
        return lulus;
    }

    //Method Print Identyty
    public void printId(String nama, String npm){
        System.out.println("Nama\t\t: " + nama);
        System.out.println("NPM\t\t: " + npm);
    }

    //Method Print Hasil
    public void  printNilai(String mutu, String lulus){
        System.out.println("Nilai Mutu\t: " + mutu + " (" + lulus + ")");
    }
}

//---------------------------------------------------------------------------------------
public class Tugas21 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Penilaian angkaUserOutter = new Penilaian(); //Test Constructor #1
        Penilaian angkaSystem = new Penilaian("Prames Ray Lapian", "140810210059"); //Test Constructor #2
        Penilaian angkaUserInner = new Penilaian(); //Test Constructor #1
        
        //System Input : Angka di input langsung didalam codingan
        System.out.println("[System Input]");
        angkaSystem.setAngka(85, 70, 90);
        float rataangkaSystem = angkaSystem.cariRata(angkaSystem.getNum1(), 
                                                     angkaSystem.getNum2(), 
                                                     angkaSystem.getNum3()); //Variable ini dipakai untuk mempermudah pemanggilan variable hasil pada fungsi nilaiMutu dan kelulusan
        angkaSystem.printId(angkaSystem.getNama(), 
                            angkaSystem.getNPM());
        angkaSystem.printNilai(angkaSystem.nilaiMutu(rataangkaSystem), 
                               angkaSystem.kelulusan(rataangkaSystem));

        System.out.println();

        //User Input Parent Class: Angka di input manual oleh User melalui fungsi yang ada di Class Parent
        System.out.println("[User Input Outer Method]");
        angkaUserOutter.inputOuter();
        float rataangkaUserOutterOutter = angkaUserOutter.cariRata(angkaUserOutter.getNum1(), 
                                                                   angkaUserOutter.getNum2(), 
                                                                   angkaUserOutter.getNum3()); //Variable ini dipakai untuk mempermudah pemanggilan variable hasil pada fungsi nilaiMutu dan kelulusan
        angkaUserOutter.printNilai(angkaUserOutter.nilaiMutu(rataangkaUserOutterOutter), 
                                   angkaUserOutter.kelulusan(rataangkaUserOutterOutter));
        
        System.out.println();

        //User Input Main Class: Angka di input manual oleh User melalui fungsi yang ada di Class Main
        System.out.println("[User Input Inner Method]");
        angkaUserInner.setNama(inputString("Nama\t\t: "));
        angkaUserInner.setNPM(inputString("NPM\t\t: "));
        angkaUserInner.setAngka(inputInt("Nilai ke-1\t: "), 
                                inputInt("Nilai ke-2\t: "), 
                                inputInt("Nilai ke-3\t: "));
        float rataangkaUserInner = angkaUserInner.cariRata(angkaUserInner.getNum1(), 
                                                           angkaUserInner.getNum2(), 
                                                           angkaUserInner.getNum3()); //Variable ini dipakai untuk mempermudah pemanggilan variable hasil pada fungsi nilaiMutu dan kelulusan
        angkaUserInner.printNilai(angkaUserInner.nilaiMutu(rataangkaUserInner), 
                                  angkaUserInner.kelulusan(rataangkaUserInner));

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
}
