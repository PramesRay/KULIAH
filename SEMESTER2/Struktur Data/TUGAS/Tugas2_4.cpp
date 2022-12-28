/*  Nama Program    : Tugas2_4
    Nama            : Prames Ray Lapian
    NPM             : 140810210059
    Tanggal Buat    : 4 Mar 2022
    Deskripsi       : Cari bilai rata-rata dan nilai maksimum dari data mahasiswa
    Lokasi File     : C:\Users\prame\Documents\PRAMES\PERKULIAHAN\SEMESTER 2\Struktur Data\TUGAS
**************************************************/
#include <iostream>
using namespace std;

typedef int matriks[10][10];

void banyakData(int& nBaris, int& nKolom) 
{
    cout << "Banyak baris : "; cin >> nBaris; 
    cout << "Banyak kolom : "; cin >> nKolom;
}

void isiMatriks(int nBaris, int nKolom, matriks x1) 
{ 
    if (nBaris > 0 && nKolom > 0) 
    {
        cout << "\nMasukkan isi matriks\n"; 

        for (int i = 0; i < nBaris; i++) 
        {
            for (int j = 0 ; j < nKolom ; j++) 
            {
                cout << "Baris " << i+1 << ", Kolom " << j+1 << " = "; cin >> x1[i][j];
            }
            cout << endl;
        }
    } 
}

void cetakMatriks(int nBaris, int nKolom, matriks x1) 
{
    cout << "=============================\n"
         << "Matriks:\n";
    
    for (int i = 0; i < nBaris; i++) 
    {
        for (int j = 0; j < nKolom; j++) 
        { 
            cout << x1[i][j] << "\t";
        }
        cout << endl;
    }
}

void penjumlahanMatriks(int nBaris, int nKolom, matriks x1, int nBaris2, int nKolom2, matriks x2) 
{
    cout << "MATRIKS A\n\n"; 
    
    banyakData(nBaris, nKolom); 
    isiMatriks(nBaris, nKolom, x1);
    
    cout << "=============================\n" 
         << "MATRIKS B\n\n"; 
    
    banyakData(nBaris2, nKolom2);
    
    if (nBaris == nBaris2 && nKolom == nKolom2) 
    {
        isiMatriks(nBaris2, nKolom2, x2);
        
        for (int i = 0; i < nBaris; i++) 
        {
            for (int j = 0; j < nKolom; j++) 
            { 
                x1[i][j] += x2[i][j];
            } 
        }
                
        cout << "=============================\n" 
             << "Hasil penjumlahan:\n";
        
        for (int i = 0; i < nBaris; i++) 
        {
            for (int j = 0; j < nKolom; j++) 
            {
                cout << x1[i][j] <<"\t";
            }
            cout << endl;
        }   
    }
    else 
    {
        cout << "Matriks tidak dapat dijumlahkan.\n"; 
    }
}

void perkalianMatriks(int nBaris, int nKolom, matriks x1, int nBaris2, int nKolom2, matriks x2, matriks x3) {
    int hasil = 0;
    cout << "MATRIKS A\n\n"; 
    
    banyakData(nBaris, nKolom); 
    isiMatriks(nBaris, nKolom, x1);
    
    cout << "=============================\n"
         << "MATRIKS B\n\n"; 
    
    banyakData(nBaris2, nKolom2);
    
    if (nKolom == nBaris2 && nBaris == nKolom2) 
    {
        isiMatriks(nBaris2, nKolom2, x2); for(int i = 0; i < nBaris; i++) 
        {
            for (int j = 0; j < nKolom2; j++) 
            { 
                for(int k = 0; k < nBaris2; k++) 
                {
                    hasil = hasil + x1[i][k] * x2[k][j]; 
                }
                
                x3[i][j] = hasil;
                hasil = 0; 
            }
        }
        
        cout <<"=============================\n" 
             << "Hasil perkalian: \n";
        
        for (int i = 0; i < nBaris; i++) { 
            for (int j = 0; j < nKolom2; j++) {
                cout << x3[i][j] <<"\t";
            }
            cout << endl;
        } 
    } 
    else 
    {
        cout << "Matriks tidak dapat dikalikan.\n"; 
    }
}

int main ()
{
    int nBaris, nKolom, nBaris2, nKolom2, option; matriks x1, x2, x3;
    
    cout << "====================\n" 
         << " KALKULATOR MATRIKS\n"
         << "====================\n";
    cout << "1. Cetak Matriks\n" 
         << "2. Perkalian Matriks\n" 
         << "3. Penjumlahan Matriks\n";

    cout << "\nPilihan : "; cin >> option;
    cout << "\n\n"; 
    switch (option)
    {
        case 1:
            banyakData(nBaris, nKolom); 
            isiMatriks(nBaris, nKolom, x1);
            cetakMatriks(nBaris, nKolom, x1);        
        break;
        case 2:
            perkalianMatriks( nBaris, nKolom, x1, nBaris2, nKolom2, x2, x3);
        break;
        case 3:
            penjumlahanMatriks(nBaris, nKolom, x1, nBaris2, nKolom2, x2);
        break;
    }
}