import java.util.Scanner;
class Latihan {
  private int absis, ordinat;

  public Latihan(){
    this.absis = 0; 
    this.ordinat = 0; 
  }
  public Latihan(int absis, int ordinat){
    this.absis = absis; 
    this.ordinat = ordinat; 
  }

  public void setAbsis(int absis){
    this.absis = absis;
  }

  public void setOrdinat(int ordinat){
    this.ordinat = ordinat;
  }

  public int getAbsis(){
    return this.absis;
  }

  //Getter num2
  public int getOrdinat(){
      return this.ordinat;
  }

  public int pencerminanAbsis(int absis){
    int cermin = (absis * -1);
    return cermin;
  }

  public int pencerminanOrdinat(int ordinat){
    int cermin = (ordinat * -1);
    return cermin;
  }

  public void print(int absis, int ordinat){
    System.out.println("absis\t\t: " + absis);
    System.out.println("ordinat\t\t: " + ordinat);
}

}

public class Acsent {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Latihan obj = new Latihan();

    obj.setAbsis(input("Absis\t: "));
    obj.setOrdinat(input("Ordinat\t: "));

    System.out.println("[SEBELUM PENCERMINAN)");
    obj.print(obj.getAbsis(), obj.getOrdinat());
    
    System.out.println("[PENCERMINAN TERHADAP X)");
    obj.print(obj.pencerminanAbsis(obj.getAbsis()), 
              obj.getOrdinat());
    
    System.out.println("[PENCERMINAN TERHADAP Y)");
    obj.print(obj.getAbsis(), 
              obj.pencerminanAbsis(obj.getOrdinat()));

    sc.close();
  }

  static int input(String pesan) {
    Scanner sc = new Scanner(System.in);
    System.out.print(pesan);
    int num = sc.nextInt();

    return (num);
  }

  
}
