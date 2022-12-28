/*
Nama Program    : Praktikum9
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 10 November 2021
Deskripsi       : Tugas2
*/

#include <iostream>
using namespace std;

struct parkir
{
    string plat;
    int jm, jk, mm, mk, biaya;
};

void waktu(parkir kendaraan)
{
        cout << "\nWaktu Masuk"
             << "\nJam  : "; cin >> kendaraan.jm;
        cout << "Menit: "; cin >> kendaraan.mm;

        cout << "\nWaktu Keluar"
             << "\nJam  : "; cin >> kendaraan.jk;
        cout << "Menit: "; cin >> kendaraan.mk;
}

int tarif(parkir kendaraan)
{
    int bedaj, bedam, biaya;
    bedaj = kendaraan.jk - kendaraan.jm;
    bedam = kendaraan.mk - kendaraan.mm;
    
    bedaj -= 1;
    if (bedam != 0)
    {
        bedaj++;
    }
    kendaraan.biaya += 3000;
    
    for (int i = 0; i < bedaj; i++)
    {
        kendaraan.biaya += 2000;
    }

    return kendaraan.biaya;
} 

void struk(parkir kendaraan) 
{
    cout << "\t -----STRUK PARKIR-----\n"
         << "Plat Nomor Kendaraan :" << kendaraan.plat
         << "\nWaktu Masuk          : " << kendaraan.jm << ":" << kendaraan.mm
         << "\nWaktu Keluar         : " << kendaraan.jk << ":" << kendaraan.mk
         << "\nTotal Biaya          : Rp " << kendaraan.biaya;
}   

int main()
{
    parkir kendaraan;
    cout << "Plat Nomor Kendaraan: "; cin >> kendaraan.plat;
    waktu(kendaraan);
    kendaraan.biaya = tarif(kendaraan);
    system ("cls");
    struk(kendaraan);
}