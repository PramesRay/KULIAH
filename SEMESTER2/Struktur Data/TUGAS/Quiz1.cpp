/*  Nama Program    : Quiz1
    Nama            : Prames Ray Lapian
    NPM             : 140810210059
    Tanggal Buat    : 14 Mar 2022
    Deskripsi       : Cari jumlah baris dan jumlah kolom dari suatu matriks
    Lokasi File     : C:\Users\prame\Documents\PRAMES\PERKULIAHAN\SEMESTER 2\Struktur Data\TUGAS
**************************************************/
#include <iostream>
using namespace std;

typedef int matriks[10][10];
typedef int jb[10];
typedef int jk[10];

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

void cariJumlahKolom(int nBaris, int nKolom, matriks x1, jk& jk)
{
    for (int j = 0; j < nKolom; j++) 
    {
        jk[j] = 0;

        for (int i = 0; i < nBaris; i++)
        {
            jk[j] += x1[i][j];
        }

        cout << jk[j] << endl;
    }
}

void cariJumlahBaris(int nBaris, int nKolom, matriks x1, jb& jb)
{
    for (int i = 0; i < nKolom; i++) 
    {
        jb[i] = 0;

        for (int j = 0; j < nBaris; j++)
        {
            jb[i] += x1[i][j];
        }

        cout << endl << jb[i] << endl;
    }
}

int main()
{
    matriks x1;
    jb jb;
    jk jk;
    int nBaris, nKolom;
    banyakData(nBaris, nKolom);
    isiMatriks(nBaris, nKolom, x1);
    cetakMatriks(nBaris, nKolom, x1);
    cariJumlahBaris(nBaris, nKolom, x1, jb);
    cariJumlahKolom(nBaris, nKolom, x1, jk);
}

