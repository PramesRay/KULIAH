/*  Nama Program    : Tugas2_3
    Nama            : Prames Ray Lapian
    NPM             : 140810210059
    Tanggal Buat    : 4 Mar 2022
    Deskripsi       : Cari pencerminan terhadap sumbu X dan sumbu Y dari suatu titik, dan cari titik tengah antara dua titik
    Lokasi File     : C:\Users\prame\Documents\PRAMES\PERKULIAHAN\SEMESTER 2\Struktur Data\TUGAS
**************************************************/
#include <iostream>
using namespace std;

struct koordinat 
{
    float absis;
    float ordinat;
};

void inputTitik(koordinat& ttk)
{
    cout << "Masukkan absis     : "; cin >> ttk.absis;
    cout << "Masukkan ordinat   : "; cin >> ttk.ordinat;
}

void pencerminan(koordinat ttk, int& ttkabsis, int& ttkordinat)
{
    ttkabsis = 0 - ttk.absis;
    ttkordinat = 0 - ttk.ordinat;
}

void titikTengah(koordinat ttk1, koordinat ttk2, float& centerabsis, float& centerordinat)
{
    centerabsis = (ttk1.absis + ttk2.absis) / 2;
    centerordinat = (ttk1.ordinat + ttk2.ordinat) / 2;

    cout << "Titik tengah antara A - B  : (" << centerabsis << ", " << centerordinat << ")" << "\n\n";
}

void printData(koordinat ttk, int ttkabsis, int ttkordinat)
{
    cout << "("<< ttk.absis << "," << ttk.ordinat << ")" << endl;
    cout << "Pencerminan terhadap sumbu X : (" << ttk.absis << ", " << ttkordinat << ")" << endl;
    cout << "Pencerminan terhadap sumbu Y : (" << ttkabsis << ", " << ttk.ordinat << ")" << "\n\n";
}

int main()
{
    int mx, my;
    float cx, cy;
    koordinat a, b;

    cout << "Input titik A" << endl;
    inputTitik(a);
    cout << "Input titik A" << endl;
    inputTitik(b);

    pencerminan(a, mx, my);
    printData(a, mx, my);

    pencerminan(b, mx, my);
    printData(b, mx, my);

    titikTengah(a, b, cx, cy);
}