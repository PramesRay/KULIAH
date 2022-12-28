/*
Nama Program    : Nilaimutu
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 20 September 2021
Deskripsi       : Membuat program penentu huruf mutu
*/

#include <iostream>
using namespace std;

int main()
{
    float tugas, kuis, uts, uas, nilai;
    char hurufmutu;

    cout << "Masukkan nilai Tugas: "; cin >> tugas;
    cout << "Masukkan nilai Kuis: "; cin >> kuis;
    cout << "Masukkan nilai UTS: "; cin >> uts;
    cout << "Masukkan nilai UAS: "; cin >> uas;

    nilai = ((tugas * 0.25) + (kuis * 0.2) + (uts * 0.25) + (uas * 0.3));
    if (nilai >= 80 && nilai <= 100)
    {
        hurufmutu = 'A';
    }
    else if (nilai >= 68 && nilai < 80)
    {
        hurufmutu = 'B';
    }
    else if (nilai >= 56 && nilai < 68)
    {
        hurufmutu = 'C';
    }
    else if (nilai >= 45 && nilai < 56)
    {
        hurufmutu = 'D';
    }
    else if (nilai >= 0 && nilai < 45)
    {
        hurufmutu = 'E';
    }

    if (nilai >= 0 && nilai <= 100)
    {
        cout << "Nilai akhir = " << nilai <<  " (" << hurufmutu << ")\n";
    }
    else {
        cout << "Yang bener atuh inputnya! Sok restart program ini, terus input nilainya yang bener!\n";
    }
}