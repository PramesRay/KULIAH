import java.util.Scanner;
class Matriks {
  Scanner sc = new Scanner(System.in);

  //Atribute
  private int[][] matriks; 
  private int baris;
  private int kolom;

  //Constructor #!
  public Matriks() {
    this.baris = 0;
    this.kolom = 0;
    this.matriks = new int [this.baris][this.kolom];
  }
  
  //Constructor #2
  public Matriks(int baris, int kolom) {
    this.baris = baris;
    this.kolom = kolom;
    this.matriks = new int [this.baris][this.kolom];
  }

  //Setter Size
  public void setSize(int baris, int kolom) {
    this.baris = baris;
    this.kolom = kolom;
  }

  //Getter Baris
  public int getBaris() {
    return this.baris;
  }
  
  //Getter Kolom
  public int getKolom() {
    return this.kolom;
  }

  //Input Size 
  public void inputSize() {
    System.out.print("Baris\t\t\t: ");
    this.baris = sc.nextInt();
    System.out.print("Kolom\t\t\t: ");
    this.kolom = sc.nextInt();
    this.matriks = new int [this.baris][this.kolom];
  }

  //Input Isi Matriks
  public void inputMatriks(){
    for (int i = 0; i < this.baris; i++){
      for (int j = 0; j < this.kolom; j++){
      System.out.print("Masukkan nilai Matriks ke " + (i + 1) + "," + 
                                                      (j + 1) + "\t: ");
      this.matriks[i][j] = sc.nextInt();
      }
    }
  }

  public void addMatriks(Matriks A, Matriks B){
    if (A.baris == B.baris && A.kolom == B.kolom) {
      for (int i = 0; i < this.baris; i++){
        for (int j = 0; j < this.kolom; j++){
          this.matriks[i][j] = A.matriks[i][j] + B.matriks[i][j];
        }
      }
    }
    else
      System.out.println("Matriks Tidak Dapat Dijumlahkan");
  }
  
  public void TimesMatriks(Matriks A, Matriks B){
    if (A.kolom == B.baris) {
      this.baris = A.baris;
      this.kolom = B.kolom;
      this.matriks = new int[A.baris][B.kolom];
      
      for (int i = 0; i < this.baris; i++) {
        for (int j = 0; j < this.kolom; j++) {
          this.matriks[i][j] = 0;
          
          for (int k = 0; k < A.kolom; k++) {
              this.matriks[i][j] += (A.matriks[i][k] * B.matriks[k][j]);
          }
        }
      }
    }
    else
      System.out.println("Matriks Tidak Dapat Dijumlahkan");
  }

  public void cetakMatriks(){
    for (int i = 0; i < this.baris; i++){
      for (int j = 0; j < this.kolom; j++){
        System.out.print(this.matriks[i][j]+ " ");
      }
      System.out.println();
    }   
  }

}

//================================================================================================================================================================

public class Tugas712{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("[MATRIKS A]");
    Matriks A = new Matriks(); //Tes Constructor #1
    A.inputSize();
    A.inputMatriks(); 
    System.out.println("Matriks: ");
    A.cetakMatriks();
    
    System.out.println();
    
    System.out.println("[MATRIKS B]");
    Matriks B = new Matriks(); //Tes Constructor #1
    B.inputSize();
    B.inputMatriks(); 
    System.out.println("Matriks: ");
    B.cetakMatriks();
    
    System.out.println();
    
    System.out.println("[PENJUMLAHAN MATRIKS]");
    Matriks C = new Matriks(A.getBaris() , B.getKolom()); //Tes Constructor #2
    C.addMatriks(A, B);
    C.cetakMatriks();
    
    System.out.println();
    
    System.out.println("[PERKALIAN MATRIKS]");
    Matriks D = new Matriks(A.getBaris() , B.getKolom()); //Tes Constructor #2
    D.TimesMatriks(A, B);
    D.cetakMatriks();

    sc.close();
  }
}
