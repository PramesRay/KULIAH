import java.util.Scanner;

class Matriks{
  private int baris, kolom;
  private int[][] nilai;
  
  Matriks(){
    this.baris = 0;
    this.kolom = 0;
    this.nilai = new int[baris][kolom];
  }

  public void inputSize() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Baris\t\t\t: ");
    this.baris = sc.nextInt();
    System.out.print("Kolom\t\t\t: ");
    this.kolom = sc.nextInt();
    this.nilai = new int [this.baris][this.kolom];
  }

  public void inputMatriks(){
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < this.baris; i++){
      for (int j = 0; j < this.kolom; j++){
        System.out.print("Masukkan nilai Matriks ke ("+(i+1)+","+(j+1)+") : ");
        this.nilai[i][j]=sc.nextInt();
      }
    }
  }

  public void compareMatriks(Matriks A, Matriks B){
    for (int i = 0; i < this.baris; i++){
      for (int j = 0; j < this.kolom; j++){
        if (A.nilai[i][j] >= B.nilai[i][j]){
          this.nilai[i][j] = 1;
        }
        else{
          this.nilai[i][j] = 0;
        }
      }
    }
  }

  public void printMatriks(){
    for (int i = 0; i < this.baris; i++){
      for (int j = 0; j < this.kolom; j++){
        System.out.print(this.nilai[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

}

public class UTSPBO_Soal3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("[MATRIKS A]");
    Matriks A = new Matriks();
    A.inputSize();
    A.inputMatriks();
    System.out.println();
    
    System.out.println("[MATRIKS B]");
    Matriks B = new Matriks();
    B.inputSize();
    B.inputMatriks();
    System.out.println();
    
    System.out.println("[HASIL]");
    Matriks Hasil = new Matriks();
    Hasil.inputSize(); // Samakan baris dan kolomnya dengan matriks lain
    Hasil.compareMatriks(A, B);
    Hasil.printMatriks();
    System.out.println();

    sc.close(); 
  }
}
