#ifndef KENDARAAN_H
#define KENDARAAN_H
#include<iostream>
#include "waktu.h"

class Kendaraan{
    protected:
        std::string no;
        std::string jenis;
        Waktu datang;
        Waktu pulang;
    
    public:
        Kendaraan();

        //Input
        void setNoKendaraan(std::string no);

        void setJenis(std::string jenis);

        void setWaktuDatang(Waktu datang);

        void setWaktuPulang(Waktu pulang);

        void inputKendaraan();

        //Output  
        std::string getNoKendaraan();

        std::string getJenis();

        Waktu getWaktudatang();

        Waktu getWaktuPulang();

        void getKendaraan();
        //Proses 
        Waktu getLamaParkir();

        int getLamaJam();

        virtual int getBiayaParkir();
   

};

#endif