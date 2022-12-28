/*
* Nama      : Prames Ray Lapian
* NPM       : 140810210059
* Kelas     : A
* Tanggal   : 17 Oktober 2022
* Deskripsi : Class jawaban assignment-06 soal-01
*/

import java.util.Scanner;
class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{
            cls();
            menu();
        } while (exit() == 1);
        
        System.out.println("Terima kasih telah menggunakan program");
        sc.close();
    }

    static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("[Menu Input]:\n 1. int\n 2. String\n 3. Integer");
        System.out.print("Opsi: ");
        int opsi = sc.nextInt();
        switch(opsi){
            case 1 :
                int a = inputInt();
                System.out.println("Output :");
                System.out.println(intToInteger(a) + "(Integer)");
                System.out.println(intToString(a) + "(String)");
                break;
            case 2 :
                String b = inputString();
                System.out.println("Output :");
                System.out.println(StringToInt(b) + "(int)");
                System.out.println(StringToInteger(b) + "(Integer)");
                break;
            case 3 :
                Integer c = inputInteger();
                System.out.println();
                System.out.println("Output :");
                System.out.println(IntegerToInt(c) + "(int)");
                System.out.println(IntegerToString(c) + "(String)");
                break;
            default :
                System.out.println("Pilih yg bener la!!");
                break;
        }
    }

    static int exit(){
        Scanner sc = new Scanner(System.in);
        int program;
        System.out.println();
        System.out.println("Apakah ingin melanjutkan: ");
        System.out.println("1. Ya");
        System.out.println("2. Keluar");
        System.out.print("Opsi: ");
        program = sc.nextInt();
        return program;
    }
    
    static int inputInt(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan int : ");
        int n = sc.nextInt();
        return n;
    }

    static String inputString(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan String : ");
        String n = sc.nextLine();
        return n;
    }

    static Integer inputInteger(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Integer : ");
        Integer n = sc.nextInt();
        return n;
    }

    static Integer intToInteger(int x){
        Integer obj = Integer.valueOf(x);
        return obj;
    }

    static String intToString(int x){
        String obj = String.valueOf(x);
        return obj;
    }

    static int IntegerToInt(Integer x){
        int obj = x.intValue();
        return obj;
    }

    static String IntegerToString(Integer x){
        int a = Integer.valueOf(x);
        String obj = String.valueOf(a);
        return obj;
    }

    static int StringToInt(String x){
        int obj = Integer.parseInt(x);
        return obj;
    }

    static Integer StringToInteger(String x){
        Integer obj = Integer.parseInt(x);
        return obj;
    }

    static void cls() {
        System.out.print("\033[H\033[2J");  
    }
}