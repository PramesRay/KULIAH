/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructure;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;
import Kendaraan.*;
import Waktu.Waktu;
public class LinkedList {
    private ElementList first;

    public LinkedList(){
        this.first = null;
    }

    public void createList(){
        this.first = null;
    }
    
    public ElementList getFirst(){
        return this.first;
    }

    public ElementList createElmnt(String plat,String nama,Waktu d,Waktu p){
      
        ElementList baru = new ElementList();
        switch(nama){
            case "Mobil":
               baru.setData(new Mobil());
                break;
            
            case "Motor":
                baru.setData(new Motor());
                break;
            
            case "Truck":
                baru.setData(new Truck());
                break;

        }

        baru.getData().setWaktudatang(d);
        baru.getData().setWaktuPulang(p);
        baru.getData().setNoKendaraan(plat);
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
    
    public void editData(String wDatang,String wKeluar,ElementList data){
        data.getData().setWaktudatang(new Waktu(wDatang));
        data.getData().setWaktuPulang(new Waktu(wKeluar));

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
    public void deleteIt(ElementList cari){
        ElementList hapus = cari;
        if(cari==first){
           first = first.next;
           
           
        }
        else{
        
         ElementList b4cari = this.first;
         while(b4cari.next!=cari){
           b4cari = b4cari.next;
         }
         
         b4cari.next = cari.next;
     
         
        }
        
    }


    //Traversal
    public String printData(){
        String hasil = " ";
       
       hasil = hasil.concat("\t\t\t\tRekapitulasi Biaya parkir PT Parkir Jaya\n");
        if(this.first == null){
           hasil =  hasil.concat("List Kosong ! \n");
        }
        

        else{
            int no = 1;
            hasil = hasil.concat("================================================================================================================================\n");
            hasil = hasil.concat("No\tNo Kendaraan\tJenis\tJam Masuk\tJam Pulang\tLama Parkir\tLama jam\tBiaya\n");
            hasil = hasil.concat("================================================================================================================================\n");
            ElementList bantu = this.first;
           do{
         
                    hasil = hasil.concat(
                        no + "\t" +
                        bantu.getData().getNoKendaraan() + "\t\t" + 
                        bantu.getData().getJenis()+ "\t" + 
                        bantu.getData().getWaktudatang().getWaktu() + "\t" + 
                        bantu.getData().getWaktuPulang().getWaktu() + "\t" +   
                        bantu.getData().getLamaParkir().getWaktu() + "\t " + 
                        bantu.getData().getLamaJam() + "\t" + 
                        bantu.getData().getBiayaParkir() + "\t  \n"  
                         );
                    no++;

                    bantu = bantu.next;
            } while(bantu!=null);
                
            
            hasil = hasil.concat("================================================================================================================================\n");

        }
        return hasil;
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
    
    public boolean isEmpty(){
       return this.first == null;
    }
    
}
