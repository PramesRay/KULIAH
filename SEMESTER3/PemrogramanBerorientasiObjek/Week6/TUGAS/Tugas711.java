import java.util.Scanner;
class Array {
  Scanner sc = new Scanner(System.in);

  //Atribute
  private int[] arr1D; 
  private int size;

  //Constructor #!
  public Array() {
    this.size = 0;
    this.arr1D = new int [this.size];
  }
  
  //Constructor #2
  public Array(int size) {
    this.size = size;
    this.arr1D = new int [this.size];
  }

  //Setter Size
  public void setSize(int size) {
    this.size = size;
  }

  //Setter Arr1D
  public void setArr1D(int[] x){
    this.arr1D = x;
  }

  //Getter Size
  public int getSize() {
    return this.size;
  }
  
  //Getter Arr1D
  public int getArr1D(int x) {
    return this.arr1D[x];
  }

  //Input Size 
  public void inputSize() {
    System.out.print("Ukuran Array\t\t: ");
    this.size = sc.nextInt();
    this.arr1D = new int [this.size];
  }

  //Input Isi Arr1D
  public void inputLarik() {
    for (int i = 0; i < this.size; i++){
      System.out.print("Data ke - "+(i+1)+"\t\t: ");
      this.arr1D[i] = sc.nextInt();
    }
  }

  //Method Pencari Nilai Rata-Rata dalam Arr1D
  public float cariRata(){
    float jumlah = 0;
    
    for (int i = 0;i < this.size; i++){
      jumlah = jumlah + this.arr1D[i];
    }
    
    return(jumlah/this.size);
  }

  //Method Pencari Nilai Tertinggi
  public int nilaiMax() {
    int max = arr1D[0]; 
    for (int i = 0; i < this.size; i++){
      if (this.arr1D[i] > max){
        max = this.arr1D[i];
      }
    }
    return (max);
  }
  
  //Method Pencari Nilai Terrendah
  public int nilaiMin() {
    int min = arr1D[0]; 
    for (int i = 0; i < this.size; i++){
      if (this.arr1D[i] < min){
        min = this.arr1D[i];
      }
    }
    return (min);
  }

  
  public void cetakArr1D(){
    System.out.println("[DATA]");
    for (int i = 0; i < this.size; i++){
      System.out.println("Data ke - "+(i+1)+"\t\t: " + this.arr1D[i]);
    }
  }

  public void bubblesort() {
    int temp = 0;
    for (int i = 0; i < this.size - 1; i++) {
      for (int j = 0; j < this.size -i-1; j++) {
        if (this.arr1D[j] > this.arr1D[j+1]){
          temp = this.arr1D[j];
          this.arr1D[j] = this.arr1D[j+1];
          this.arr1D[j+1] = temp;
        }
      }
    }
  }

  public void cetakHasil(){
    System.out.println("Rata Rata Nilai Data\t: " + cariRata());
    System.out.println("Nilai Data Tertinggi\t: " + nilaiMax());
    System.out.println("Nilai Data Terrendah\t: " + nilaiMin());
    System.out.println("Ascending Data\t: "); cetakArr1D();
    }
}

//================================================================================================================================================================

public class Tugas711 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Array obj = new Array(); //Tes Constructor #1

    obj.inputSize();
    obj.inputLarik(); 
    obj.bubblesort();
    obj.cetakHasil();

    sc.close();
  }
}

