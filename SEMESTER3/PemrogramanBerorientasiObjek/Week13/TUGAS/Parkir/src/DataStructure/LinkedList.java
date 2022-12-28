/*
* Nama          : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
* NPM           : 140810210015 , 140810200042 , 140810210059 , 140810210039
* Kelas         : A
* Tanggal       : 16 November 2022
* Nama Program  : LinkedList.java
* Deskripsi     : Soal parkir - class Linked List
*/
package DataStructure;
import java.util.Scanner;
import Kendaraan.*;
public class LinkedList {
    private ElementList first;

    public LinkedList(){
        this.first = null;
    }

    public void createList(){
        this.first = null;
    }

    public ElementList createElmnt(){
        Scanner input = new Scanner(System.in);
        ElementList baru = new ElementList();
        int num;

        System.out.println("Jenis Kendaraan : ");
        System.out.println("1 . Mobil");
        System.out.println("2 . Motor");
        System.out.println("3 . Truck");
        System.out.print("Input...");
        num = input.nextInt();

        switch(num){
            case 1:
               baru.setData(new Mobil());
                break;
            
            case 2:
                baru.setData(new Motor());
                break;
            
            case 3:
                baru.setData(new Truck());
                break;

        }

        baru.getData().inputKendaraan();
        baru.next = null;

        

        return baru;
    }

    //Insert
    public void insertFirst(ElementList baru){
        if(this.first == null){
            this.first = baru;
        }

        else{
            baru.next = this.first;
            this.first = baru;
        }
    }

    public void insertLast(ElementList baru){
        if(this.first == null){
            this.first = baru;
        }

        else{
            ElementList last = first;
            while(last.next !=null){
                last = last.next;
            }

            last.next = baru;
        }
    }
    //Searching
    public ElementList search(String no){
        ElementList hasilCari = this.first;
        int found = 0;

        while(hasilCari!=null && found == 0){
            if(hasilCari.getData().getNoKendaraan().compareTo(no) == 0){
                found = 1;
            }

            else{
                hasilCari = hasilCari.next;
            }
        }
        return hasilCari;
    }

    //Delete
    public void deleteFirst(){
        ElementList hapus;
        if(this.first.next==null){
            hapus = this.first;
            this.first =null;
        }

        else if(this.first ==null){
            System.out.println("Tidak ada yang dihapus ! ");
        }

        else{
            hapus = this.first;
            this.first = this.first.next; 

        }
    }

    public void deleteLast(){
        ElementList hapus;
        if(this.first.next==null){
            hapus = this.first;
            this.first =null;
        }

        else if(this.first ==null){
            System.out.println("Tidak ada yang dihapus ! ");
        }

        else{
            ElementList b4last = first;
            while(b4last.next.next !=null){
                b4last = b4last.next;
            }

            hapus = b4last.next.next;
            b4last.next = null;

        }
    }


    //Traversal
    public String printData(){
        String word = "";
        word += String.format("\t\t\t\tRekapitulasi Biaya parkir PT Parkir Jaya\n");
    if(this.first == null){
        word += String.format("List Kosong ! \n");
    }
    

    else{
        int no = 1;
        word += String.format("================================================================================================================================\n");
        word += String.format("No\tNo Kendaraan\t\tJenis\tJam Masuk\tJam Pulang\tLama Parkir\tLama jam\tBiaya\n");
        word += String.format("================================================================================================================================\n");
        ElementList bantu = this.first;
        while(bantu!=null){
     
                word += String.format(
                    no + "\t" +
                    bantu.getData().getNoKendaraan()            + "\t\t"    + 
                    bantu.getData().getJenis()                  + "\t"      + 
                    bantu.getData().getWaktudatang().getWaktu() + "\t"      + 
                    bantu.getData().getWaktuPulang().getWaktu() + "\t"      +   
                    bantu.getData().getLamaParkir().getWaktu()  + "\t "     + 
                    bantu.getData().getLamaJam()                + "\t\t"    + 
                    bantu.getData().getBiayaParkir()            + "\t  \n"  
                     );
                no++;

                bantu = bantu.next;
        }
            
        
        word += String.format("================================================================================================================================\n");

    }
    
    return word;
    }
    

    public int totalBiaya(){
        int total = 0;
        ElementList bantu = this.first;
        while(bantu!=null){
            total += bantu.getData().getBiayaParkir();
            bantu = bantu.next;
        }

        return total;
    }
    
}
