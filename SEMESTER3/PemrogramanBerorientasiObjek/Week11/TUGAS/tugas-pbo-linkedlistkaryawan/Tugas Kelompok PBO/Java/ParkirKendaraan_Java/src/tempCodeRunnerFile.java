/*
* Nama          : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
* NPM           : 140810210015 , 140810200042 , 140810210059 , 140810210039
* Kelas         : A
* Tanggal       : 16 November 2022
* Nama Program  : App.java
* Deskripsi     : Soal parkir - class main (program parkir dengan singly linked list)
*/
import DataStructure.*;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String no;
        LinkedList listKendaraan = new LinkedList();
        ElementList baru = new ElementList();
        ElementList cari = new ElementList();
        String cont = "Y";
        int pil;
        try{
        do 
        {
            menu();
            pil = input.nextInt();
            clearScreen();

            switch(pil){
                case 1:
                    System.out.println("=== Metode Penambahan ===");
                    System.out.println("1 . Insert First");
                    System.out.println("2 . Insert Last");
                    System.out.print("Masukkan Pilihan....");
                    pil = input.nextInt();
                    clearScreen();

                    switch(pil){
                        case 1:
                        System.out.println("Data ditambah dengan insert first...");
                        baru = listKendaraan.createElmnt();
                        listKendaraan.insertFirst(baru);
                        break;

                        case 2:
                        System.out.println("Data ditambah dengan insert last...");
                        baru = listKendaraan.createElmnt();
                        listKendaraan.insertLast(baru);
                        break;

                        default:
                        System.out.println("Bukan Termasuk pilihan ! ");
                        break;
                    }

                    break;
                
                case 2:
                    System.out.println("=== Metode Penghapusan ===");
                    System.out.println("1 . Delete First");
                    System.out.println("2 . Delete Last");
                    System.out.print("Masukkan Pilihan....");
                    pil = input.nextInt();
                    clearScreen();

                    switch(pil){
                        case 1:
                        System.out.println("Data dihapus dengan delete first...");
                        listKendaraan.deleteFirst();
                        break;

                        case 2:
                        System.out.println("Data dihapus dengan delete last...");
                        listKendaraan.deleteLast();
                        break;

                        default:
                        System.out.println("Bukan Termasuk pilihan ! ");
                        break;
                    }

                    break;
                
                case 3:
                    System.out.print("Masukkan Plat nomor yang ingin dicari : ");
                    input.nextLine();
                    no = input.nextLine();
                    cari = listKendaraan.search(no);

                    if(cari == null){
                        System.out.println("Data Tidak ditemukan ! ");
                    }

                    else{
                        System.out.println("Data Ditemukan , Detail : ");
                        cari.getData().getKendaraan();
                    }
                    break;
                
                case 4:
                    listKendaraan.printData();
                    System.out.println( "Total Biaya parkir = " + listKendaraan.totalBiaya());
                   
                    break;
                case 5:
                    cont ="N";
                    break;
                
                default:
                    System.out.println("Bukan termasuk Pilihan ! ");
                    break;      
            }
            if(pil!=5){
            System.out.println("\n\nApakah program masih ingin dilanjutkan ? (Y/N)");
            cont = input.next();
            clearScreen();
            }


        }while(cont.compareTo("Y") == 0);

        System.out.println("=== TERIMA KASIH ===");
    }

    catch(Exception e){
        System.out.println("Terdapat suatu error pada input...program diakhiri");    
    }

    finally{
        input.close();
    }

    }

    static void clearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    static void menu(){
        System.out.println("===== MENU =====");
        System.out.println("1 . Tambah Data");
        System.out.println("2 . Hapus Data");
        System.out.println("3 . Cari Data");
        System.out.println("4 . Tampilkan Data");
        System.out.println("5 . Keluar");
        System.out.print("Masukkan Pilihan....");
    }

    
    
}
