#ifndef WAKTU_H
#define WAKTU_H

#include<iostream>
class Waktu{
    private:
        int jam,menit,detik;
     public:
        Waktu(int jam,int menit,int detik);
        Waktu();
        void setJam(int jam);
        void setMenit(int menit);
        void setDetik(int detik);
        void inputWaktu();
        int getJam();
        int getMenit();
        int getDetik();
        std::string getWaktu();
        int convertToSecond();
        void secondToClock(int second);
        Waktu cariDurasi(Waktu akhir);

};

#endif