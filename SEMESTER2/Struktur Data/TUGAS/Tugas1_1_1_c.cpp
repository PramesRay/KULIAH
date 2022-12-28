/*  Nama Program    : Tugas1_1_1_c
    Nama            : Prames Ray Lapian
    NPM             : 140810210059
    Tanggal Buat    : 28 Feb 2022
    Deskripsi       : Menampilkan hasil program dari source code yang sudah diberikan
    Lokasi File     : C:\Users\prame\Documents\PRAMES\PERKULIAHAN\SEMESTER 2\Struktur Data\TUGAS
**************************************************/
#include <iostream>
using namespace std;

int main()
{
    int i = 0;
    while (i < 7) 
    {
        if (i < 2) 
        {
            i += 2;
        }
        else 
            cout << (++i) << endl;
            cout << "Bottom of loop" << endl ;
    }
}