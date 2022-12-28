/*
Program = Soal 3
Nama    = Satria Alief
NPM     = 140810210051
Kelas   = A
Tanggal = 19 Oktober 2022
*/

import java.util.Scanner;
class Matriks{
    Scanner scan = new Scanner(System.in);
    private int baris;
    private int kolom;
    private int[][] nilai;
    
    public Matriks(){
        this.baris = 1;
        this.kolom = 1;
        this.nilai = new int[this.baris][this.kolom];
    }

    public Matriks(int baris, int kolom){
        this.baris = baris;
        this.kolom = kolom;
        this.nilai = new int[this.baris][this.kolom];
    }

    public void setBaris(int baris){
        this.baris = baris;
    }

    public void setKolom(int kolom){
        this.kolom = kolom;
    }

    public void setUkuran(int baris, int kolom){
        this.baris = baris;
        this.kolom = kolom;
        this.nilai = new int[this.baris][this.kolom];
    }

    public int getBaris(){
        return this.baris;
    }
    
    public int getKolom(){
        return this.kolom;
    }

    public void inputUkuran(int n){
        System.out.println("Matriks ke-" + n);
        System.out.print("Masukkan baris : ");
        this.baris = scan.nextInt();
        System.out.print("Masukkan kolom : ");
        this.kolom = scan.nextInt();
        this.nilai = new int[this.baris][this.kolom];
    }

    public void inputMatriks(int n){
        for (int i=0; i<this.baris; i++){
            for (int j=0; j<this.kolom; j++){
                System.out.print("Masukkan nilai ke (" + (i+1) + "," + (j+1) + ") : ");
                this.nilai[i][j] = scan.nextInt();
            }
        }
    }

    public void cetakMatriks(String pesan){
        System.out.println(pesan);
        for (int i=0; i<this.baris; i++){
            for (int j=0; j<this.kolom; j++){
                System.out.print(this.nilai[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void compareMatriks(Matriks A, Matriks B){
        for (int i=0; i<this.baris; i++){
            for (int j=0; j<this.kolom; j++){
                if(A.nilai[i][j] >= B.nilai[i][j]){
                    this.nilai[i][j] = 1;
                }
                else {
                    this.nilai[i][j] = 0;
                }
            }
        }
    }
}

public class UTSPBO_210051_Soal3 {
    public static void main(String[] args) {
        Matriks A = new Matriks();
        Matriks B = new Matriks();
        Matriks C = new Matriks();
        
        A.inputUkuran(1);
        A.inputMatriks(1);
        B.inputUkuran(2);
        B.inputMatriks(2);
        C.setUkuran(A.getBaris(), B.getKolom());

        System.out.println("\nOutput :");
        A.cetakMatriks("Matriks 1");
        B.cetakMatriks("Matriks 2");
        
        C.compareMatriks(A, B);
        C.cetakMatriks("Hasil Perbandingan Matriks");
    }
}
