#include "waktu.h"


        Waktu::Waktu(int jam,int menit,int detik){
            this->jam = jam;
            this->menit = menit;
            this->detik = detik;
        }
        Waktu::Waktu(){
            this->jam = 0;
            this->menit =0;
            this->detik=0;
        }
        void Waktu::setJam(int jam){
            this->jam = jam;
        }
        void Waktu::setMenit(int menit){
            this->menit = menit;
        }
        void Waktu::setDetik(int detik){
            this->detik = detik;
        }
        void Waktu::inputWaktu(){
            std::cout<<"Masukkan jam : ";
            std::cin>>this->jam;

            std::cout<<"Masukkan menit : ";
            std::cin>>this->menit;

            std::cout<<"Masukkan detik : ";
            std::cin>>this->detik;
        }
        int Waktu::getJam(){
            return this->jam;
        }
        int Waktu::getMenit(){
            return this->menit;
        }
        int Waktu::getDetik(){
            return this->detik;
        }
        std::string Waktu::getWaktu(){
            std::string nolJam ="";
            std::string nolMenit="";
            std::string nolDetik="";

            if(this->jam<10){
                nolJam="0";
            }
            if(this->menit<10){
                nolMenit="0";
            }
            if(this->detik<10){
                nolDetik="0";
            }
            
            
            return nolJam + std::to_string(this->jam) + ":" + nolMenit+ std::to_string(this->menit) + ":" +nolDetik+ std::to_string(this->detik);
        }
        int Waktu::convertToSecond(){
            int hasil = this->detik + this->menit*60 + this->jam*3600;
            return hasil;
        }
        void Waktu::secondToClock(int second){
            this->menit=second/60;
            this->detik=second%60;
            this->jam=this->menit/60;
            this->menit=this->menit%60;
        }
        Waktu Waktu::cariDurasi(Waktu akhir){
             Waktu temp;

            int detikAwal = this->convertToSecond();
            int detikAkhir = akhir.convertToSecond();
            if(detikAkhir<detikAwal){
                detikAkhir+=86400;
            }
            int detikHasil = detikAkhir - detikAwal;

            

            temp.secondToClock(detikHasil);
            return temp;
        }

