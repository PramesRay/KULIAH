/*
Nama Program    : Praktikum10
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 24 November 2021
Deskripsi       : Tugas2
*/

#include <iostream>
#include <fstream>
using namespace std;

void enkripsiFile(char nFile[], int x)
{
    char karakter;
    ifstream fileteks;
    fileteks.open(nFile);
    cout << "\nHasil enkripsi\t: ";
    while (!fileteks.eof())
    {
        fileteks.get(karakter);

        if (karakter >= 'A' && karakter <= 'Z')
        {
            karakter = karakter + x;
        }
        else 
        {
            karakter = karakter;
        }

        cout << karakter;
    }
    
    fileteks.close();
}

void tambahIsifile(char nfile[], string isi) 
{
    ofstream fileteks;
    fileteks.open(nfile);
    fileteks << isi << endl; 
    fileteks.close();
}

int main()
{
    int i, x;
    string isi;
    char nFile[] = "operasiFile.txt";

    cout << "PROGRAM ENKRIPSI FILE TEKS"
         << endl
         << endl;
    cout << "Masukkan teks untuk mengisi file!" << endl
         << "Input\t\t: "; getline(cin, isi);

    tambahIsifile(nFile, isi);

    cout << "\nMasukkan besar pergeseran! " << endl
         << "Input\t\t: "; cin >> x;
    
    enkripsiFile(nFile, x);
}