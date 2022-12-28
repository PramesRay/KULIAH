/**
 * Nama Program : Test.java
 * Nama Anggota : Oriex Mawan Junnior, Qurrota Qamra Ariva, Muhammad Fauzan Azhiima
 * NPM (beruruta dengan nama anggota): 140810210001, 140810210037, 140810210041
 * Tanggal Buat : 16 November 2022
 * Deskripsi : Membuat daftar parkir dengan mengimplementasikan inheritance dan package
 */
import Strukdat.*;
import barang.*;
import java.util.Scanner;

public class Test{
    public static void main(String args[]){
        // inisialisasi dan create list 
        Node pbantu;
        LinkedList daftarParkir = new LinkedList();
        int pilihan = 0; //, found = 0;
        // String key = "";
        do {
            pilihan = menu();
            switch (pilihan) {
                case 1:
                    daftarParkir.insertLast(daftarParkir.createElm());
                    break;
                case 2:
                    daftarParkir.deleteFirst();
                    break;
                case 3:
                    daftarParkir.traversal();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (true);
        
    }
    static int menu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Operasi : ");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Print");
        System.out.println("4. Exit");
        System.out.print("> ");
        int pilihan = scan.nextInt();
        return pilihan;
    }
}