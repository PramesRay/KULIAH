#include "LinkedList.h"
#include "Motor.h"
#include "Mobil.h"
#include "Motor.h"
#include "Truck.h"

  LinkedList::LinkedList(){
        this->first = nullptr;
    }

    void LinkedList::createList(){
        this->first = nullptr;
    }

    ElementList* LinkedList::createElmnt(){
        ElementList *baru = new ElementList();
        int num;

       std::cout<<"Jenis Kendaraan : \n";
       std::cout<<"1 . Mobil\n";
       std::cout<<"2 . Motor\n";
       std::cout<<"3 . Truck\n";
       std::cout<<"Input...";
       std::cin>>num;

        switch(num){
            case 1:
               baru->setData(new Mobil());
                break;
            
            case 2:
                baru->setData(new Motor());
                break;
            
            case 3:
                baru->setData(new Truck());
                break;

        }

        baru->getData()->inputKendaraan();
        baru->next = nullptr;

        

        return baru;
    }

    //Insert
    void LinkedList::insertFirst(ElementList *baru){
        if(this->first == nullptr){
            this->first = baru;
        }

        else{
            baru->next = this->first;
            this->first = baru;
        }
    }

   void LinkedList::insertLast(ElementList *baru){
        if(this->first == nullptr){
            this->first = baru;
        }

        else{
            ElementList* last = first;
            while(last->next !=nullptr){
                last = last->next;
            }
            last->next = baru;
        }
    }
    //Searching
    ElementList* LinkedList::search(std::string no){
        ElementList *hasilCari = this->first;
        int found = 0;

        while(hasilCari!=nullptr && found == 0){
            if(hasilCari->getData()->getNoKendaraan() == no){
                found = 1;
            }

            else{
                hasilCari = hasilCari->next;
            }
        }
        return hasilCari;
    }

    //Delete
   void LinkedList::deleteFirst(){
        ElementList *hapus;
        if(this->first->next==nullptr){
            hapus = this->first;
            this->first =nullptr;
        }

        else if(this->first ==nullptr){
           std::cout<<"Tidak ada yang dihapus ! \n";
        }

        else{
            hapus = this->first;
            this->first = this->first->next; 

        }
    }

    void LinkedList::deleteLast(){
        ElementList* hapus;
        if(this->first->next==nullptr){
            hapus = this->first;
            this->first =nullptr;
        }

        else if(this->first ==nullptr){
           std::cout<<"Tidak ada yang dihapus ! ";
        }

        else{
            ElementList *b4last = this->first;
            while(b4last->next->next !=nullptr){
                b4last = b4last->next;
            }

            hapus = b4last->next->next;
            b4last->next = nullptr;

        }
    }


    //Traversal
    void LinkedList::printData(){
       std::cout<<"\t\t\t\tRekapitulasi Biaya parkir PT Parkir Jaya\n";
        if(this->first == nullptr){
           std::cout<<"List Kosong ! ";
        }
        

        else{
            int no = 1;
           std::cout<<"================================================================================================================================\n";
           std::cout<<"No\tNo Kendaraan\t\tJenis\tJam Masuk\tJam Pulang\tLama Parkir\tLama jam\tBiaya\n";
           std::cout<<"================================================================================================================================\n";
            ElementList *bantu = this->first;
            while(bantu!=nullptr){
         
                   std::cout<<
                        no << "\t" <<
                        bantu->getData()->getNoKendaraan() << "\t\t" << 
                        bantu->getData()->getJenis()<< "\t" << 
                        bantu->getData()->getWaktudatang().getWaktu() << "\t" << 
                        bantu->getData()->getWaktuPulang().getWaktu() << "\t" <<   
                        bantu->getData()->getLamaParkir().getWaktu() << "\t " << 
                        bantu->getData()->getLamaJam() << "\t\t" << 
                        bantu->getData()->getBiayaParkir() << "\t  \n"  
                         ;
                    no++;

                    bantu = bantu->next;
            }
                
            
           std::cout<<"================================================================================================================================\n";

        }
    }

    int LinkedList::totalBiaya(){
        int hasil = 0;

          ElementList *bantu = this->first;
            while(bantu!=nullptr){
                hasil +=bantu->getData()->getBiayaParkir();
                bantu = bantu->next;
            }

        return hasil;


    }