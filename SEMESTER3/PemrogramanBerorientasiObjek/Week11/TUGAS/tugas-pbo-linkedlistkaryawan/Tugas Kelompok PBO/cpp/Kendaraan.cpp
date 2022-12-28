#include "Kendaraan.h"

        Kendaraan::Kendaraan(){
            this->no = " ";
           
        }

        //Input
        void Kendaraan::setNoKendaraan(std::string no){
            this->no = no;
        }

        void Kendaraan::setJenis(std::string jenis){
            this->jenis = jenis;
        }

        void Kendaraan::setWaktuDatang(Waktu datang){
            this->datang = datang;

        }

        void Kendaraan::setWaktuPulang(Waktu pulang){
            this->pulang=pulang;
        }

        void Kendaraan::inputKendaraan(){
            std::cout<<"\n--- INPUT KENDARAAN ---\n";
            std::cout<<"No Kendaraan : ";
            std::cin.ignore();
            std::getline(std::cin,this->no);

            std::cout<<"\n-- Jam Masuk Kendaraan --\n";
            this->datang.inputWaktu();

            std::cout<<"\n-- Jam Keluar Kendaraan --\n";
            this->pulang.inputWaktu();
        }

        //Output  
        std::string Kendaraan::getNoKendaraan(){
            return this->no;
        }

        std::string Kendaraan::getJenis(){
            return this->jenis;
        }

        Waktu Kendaraan::getWaktudatang(){
            return this->datang;
        }

        Waktu Kendaraan::getWaktuPulang(){
            return this->pulang;
        }

        //Proses 
        Waktu Kendaraan::getLamaParkir(){
            return this->datang.cariDurasi(this->pulang);
        }

        int Kendaraan::getLamaJam(){
        int hasil = 0;
            if(this->getLamaParkir().getMenit()>=10 || this->getLamaParkir().getJam()>=1){
                hasil = this->getLamaParkir().getJam();

                if( this->getLamaParkir().getMenit()>0 || this->getLamaParkir().getDetik()>0 ){
                    hasil +=1;
                }
           
            }
            return hasil;
        }

        void Kendaraan::getKendaraan(){
            std::cout<<"No kendaraan = " << this->no<<"\n";
            std::cout<<"Jenis = " << this->jenis<<"\n";
            std::cout<<"Jam Masuk = " << this->getWaktudatang().getWaktu()<<"\n";
            std::cout<<"Jam Pulang = " << this->getWaktuPulang().getWaktu()<<"\n";
            std::cout<<"Lama Parkir = "<<this->getLamaParkir().getWaktu()<<"\n";
            std::cout<<"Lama jam = " << this->getLamaJam()<<"\n";
            std::cout<<"Biaya = " << this->getBiayaParkir();
        }

        int Kendaraan::getBiayaParkir(){return 0;}