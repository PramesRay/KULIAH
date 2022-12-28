import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // pembuatan objek
    Kereta[] commuterLine = new Kereta[3];
    Scanner sc = new Scanner(System.in);
    
    for(int i = 0; i < 3; i++){
      commuterLine[i] = new Kereta("A-00" + (i+1));
    }
    
    int select = 1;
    System.out.println("[Pilihan Kereta]");
    System.out.println("1. CommuterLine A-001");
    System.out.println("2. CommuterLine A-002");
    System.out.println("3. CommuterLine A-003");
    System.out.println("0. Keluar");
    System.out.print("Input: "); select = sc.nextInt();
    
    if (select == 0) {
      System.out.println("Terimakasih");
    }
    System.out.println();
    System.out.println();
    
    int program;
    do{
      program = 1;
      System.out.println("[PROGRAM STATUS KERETA COMMUTERLINE " + commuterLine[select-1].getName() + "]");
      System.out.println("1. Status Keberangkatan");
      System.out.println("2. Status Tiba");
      System.out.println("3. Status Posisi");
      System.out.println("0. Keluar");
      System.out.print("Input: "); program = sc.nextInt();

      System.out.println();
      System.out.println();

      switch (program) {
        case 1:
          commuterLine[select+1].statusKeberangkatan();
          break;
        case 2:
          commuterLine[select+1].statusTiba();
          break;
        case 3:
          commuterLine[select+1].statusPergerakan();
          break;
        case 0:
          System.out.println("Terimakasih");
          break;
        }
      System.out.println();
      System.out.println();
    }while (program != 0 && select != 0); 
    sc.close();
  }   
}