/*
* Nama    : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
* NPM     : 140810210015 , 140810200042 , 140810210059 , 140810210039
* Kelas : A
* Tanggal : 11 November 2022
* Nama Program : Main.cpp
* Deskripsi :  Program Main cpp
*/
#include "waktu.h"
#include "waktu.cpp"
#include "Kendaraan.h"
#include "Kendaraan.cpp"
#include "LinkedList.h"
#include "LinkedList.cpp"
#include "ElementList.h"
#include "ElementList.cpp"
#include "Motor.h"
#include "Motor.cpp"
#include "Mobil.h"
#include "Mobil.cpp"
#include "Truck.h"
#include "Truck.cpp"



#include <iostream>

 void menu(){
        std::cout<<"===== MENU =====\n";
        std::cout<<"1 . Tambah Data\n";
        std::cout<<"2 . Hapus Data\n";
        std::cout<<"3 . Cari Data\n";
        std::cout<<"4 . Tampilkan Data\n";
        std::cout<<"5 . Keluar\n";
        std::cout<<"Masukkan Pilihan....\n";
    }

int main()
{
    ElementList *baru = new ElementList();
    ElementList *cari = new ElementList();
    LinkedList listKendaraan;
    listKendaraan.createList();
    int pil;
    std::string no;
    std::string cont ="Y";
try{
    do 
        {
            menu();
            std::cin>>pil;
            system("cls");

            switch(pil){
                case 1:
                   std::cout<<"=== Metode Penambahan ===\n";
                   std::cout<<"1 . Insert First\n";
                   std::cout<<"2 . Insert Last\n";
                    std::cout<<"Masukkan Pilihan....";
                    std::cin>>pil;
                    system("cls");

                    switch(pil){
                        case 1:
                       std::cout<<"Data ditambah dengan insert first...\n";
                        baru = listKendaraan.createElmnt();
                        listKendaraan.insertFirst(baru);
                        break;

                        case 2:
                       std::cout<<"Data ditambah dengan insert last...\n";
                        baru = listKendaraan.createElmnt();
                        listKendaraan.insertLast(baru);
                        break;

                        default:
                       std::cout<<"Bukan Termasuk pilihan ! \n";
                        break;
                    }

                    break;
                
                case 2:
                   std::cout<<"=== Metode Penghapusan ===\n";
                   std::cout<<"1 . Delete First\n";
                   std::cout<<"2 . Delete Last\n";
                    std::cout<<"Masukkan Pilihan....";
                    std::cin>>pil;
                    system("cls");

                    switch(pil){
                        case 1:
                       std::cout<<"Data dihapus dengan delete first...\n";
                        listKendaraan.deleteFirst();
                        break;

                        case 2:
                       std::cout<<"Data dihapus dengan delete last...\n";
                        listKendaraan.deleteLast();
                        break;

                        default:
                       std::cout<<"Bukan Termasuk pilihan ! \n";
                        break;
                    }

                    break;
                
                case 3:
                    std::cout<<"Masukkan Plat nomor yang ingin dicari : ";
                   std::cin.ignore();
                    std::getline(std::cin,no);
                    cari = listKendaraan.search(no);

                    if(cari == nullptr){
                       std::cout<<"Data Tidak ditemukan ! \n";
                    }

                    else{
                       std::cout<<"Data Ditemukan , Detail : \n";
                        cari->getData()->getKendaraan();
                    }
                    break;
                
                case 4:
                    listKendaraan.printData();
                    std::cout<<"Total Biaya Parkir = "<<listKendaraan.totalBiaya()<<"\n";
                    break;
                case 5:
                    cont ="N";
                    break;
                
                default:
                   std::cout<<"Bukan termasuk Pilihan ! \n";
                    break;      
            }
            if(pil!=5){
           std::cout<<"\n\nApakah program masih ingin dilanjutkan ? (Y/N)\n";
            std::cin>>cont;
            system("cls");
            }


        }while(cont == "Y");
}

       
    
catch(...){
    std::cout<<"Terdapat error...";
}
    std::cout<<"=== TERIMA KASIH ===";

}
