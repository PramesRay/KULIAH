/*
Nama Program    : OperasiFile
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 02 Desember 2021
Deskripsi       : Tugas1
*/

#include <iostream>
#include <fstream>
using namespace std;

void tambahIsifile(string nFile, string isi) 
{
    ofstream fileteks;
    fileteks.open(nFile);
    fileteks << isi << endl; 
    fileteks.close();
}

//TUGAS1
void cariJumlahVocalKonsonan(string nFile)
{
    char karakter, n;
    int jumlahKarakterVocal = 0;
    int jumlahKarakterKonsonan = 0;
    
    ifstream fileteks;
    fileteks.open(nFile);
    
    while (!fileteks.eof())
    {
        fileteks.get(karakter);
        if (karakter >= 'A' && karakter <= 'Z')
        {
            if (karakter == 'A' || karakter == 'I' || karakter == 'U' || karakter == 'E' || karakter == 'O')
            {
                jumlahKarakterVocal = jumlahKarakterVocal + 1;
            }
            else 
            {
                jumlahKarakterKonsonan = jumlahKarakterKonsonan + 1;
            }       
        }   
    }

    cout << "Jumlah Vocal\t: " << jumlahKarakterVocal << endl;
    cout << "Jumlah Konsonan\t: " << jumlahKarakterKonsonan << endl;
    
    fileteks.close();
}

int main()
{
    string nFile, isi;

    cout << "PROGRAM PENGHITUNG JUMLAH HURUF VOCAL & KONSONAN"
         << endl
         << endl;
    cout << "Masukkan nama untuk membuat file!" << endl
         << "Input\t\t: "; getline(cin, nFile);
    cout << "\nMasukkan teks untuk mengisi file!" << endl
         << "Input\t\t: "; getline(cin, isi);

    tambahIsifile(nFile, isi);
    cariJumlahVocalKonsonan(nFile);
}

//====================================================================================================================================================================================================================================================

/*
Nama Program    : OperasiFile
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 02 Desember 2021
Deskripsi       : Tugas2
*/

#include <iostream>
#include <fstream>
using namespace std;

void tambahIsifile(string nFile, string isi) 
{
    ofstream fileteks;
    fileteks.open(nFile);
    fileteks << isi << endl; 
    fileteks.close();
}


void cariJumlahHurufA(string nFile)
{
    char karakter;
    int jumlahA = 0;
    ifstream fileteks;
    fileteks.open(nFile);
    
    while (!fileteks.eof())
    {
        fileteks.get(karakter);
        if (karakter == 'A' || karakter == 'a')
        {
            jumlahA++;
        }
    }
    
    cout << "Jumlah huruf A \t: " << jumlahA << endl;

    fileteks.close();
}

int main()
{
    string nFile, isi;

    cout << "PROGRAM PENGHITUNG JUMLAH HURUF A"
         << endl
         << endl;
    cout << "Masukkan nama untuk membuat file!" << endl
         << "Input\t\t: "; getline(cin, nFile);
    cout << "\nMasukkan teks untuk mengisi file!" << endl
         << "Input\t\t: "; getline(cin, isi);

    tambahIsifile(nFile, isi);
    cariJumlahHurufA(nFile);

}

//====================================================================================================================================================================================================================================================

/*
Nama Program    : OperasiFile
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 02 Desember 2021
Deskripsi       : Tugas3
*/

#include <iostream>
#include <fstream>
using namespace std;

void tambahIsifile(string nFile, string isi) 
{
    ofstream fileteks;
    fileteks.open(nFile);
    fileteks << isi << endl; 
    fileteks.close();
}

void cariJumlahPasanganKurungKurawal(string nFile)
{
    char karakter;
    int jumlahPasanganKurungKurawal = 0;
    int buka = 0, tutup = 0, x = 0;
    
    ifstream fileteks;
    fileteks.open(nFile);
    
    while (!fileteks.eof())
    {
        fileteks.get(karakter);
        if (karakter == '{')
        {
            buka += 1;
        }
        else if (karakter == '}')
        {
            tutup += 1;
        }
        
        if (buka != tutup)
        {
            if (buka < tutup)
            {
                x = tutup - buka;
                jumlahPasanganKurungKurawal = (buka + tutup - x) / 2;
            }
            else if (buka > tutup)
            {
                x = buka - tutup;
                jumlahPasanganKurungKurawal = (buka - x + tutup) / 2;
            }
            
        }
        else if (buka = tutup)
        {
            jumlahPasanganKurungKurawal = (buka + tutup) / 2;
        }   
    }
    cout << "Jumlah Pasangan Kurung Kurawal\t: " << jumlahPasanganKurungKurawal << endl;
    
    fileteks.close();
}

int main()
{
    string nFile, isi;

    cout << "PROGRAM PENGHITUNG JUMLAH PASANGAN KURUNG KURAWAL"
         << endl
         << endl;
    cout << "Masukkan nama untuk membuat file!" << endl
         << "Input\t\t: "; getline(cin, nFile);
    cout << "\nMasukkan teks untuk mengisi file!" << endl
         << "Input\t\t: "; getline(cin, isi);
    
    tambahIsifile(nFile, isi);
    cariJumlahPasanganKurungKurawal(nFile);
}

//====================================================================================================================================================================================================================================================

/*
Nama Program    : OperasiFile
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 02 Desember 2021
Deskripsi       : Tugas4
*/

#include <iostream>
#include <fstream>
using namespace std;

void tambahIsifile(string nFile, string isi) 
{
    ofstream fileteks;
    fileteks.open(nFile);
    fileteks << isi << endl; 
    fileteks.close();
}

void enkripsiFile(string nFile, int& x)
{
    char karakter;
    ifstream fileteks;
    fileteks.open(nFile);
    cout << "\nMasukkan besar pergeseran! " << endl
         << "Input\t\t: "; cin >> x;

    cout << "\nHasil Enkripsi\t: ";
    
    while (!fileteks.eof())
    {
        fileteks.get(karakter);

        if (karakter >= 'A' && karakter <= 'Z')
        {
            if (x > 26 || x < 26)
            {
                x %= 26;
            }
            
            if (karakter >= 'a')
            {
                karakter = karakter + x;
                
                if (karakter >= '[' && karakter <= '`')
                {
                    if (x < 0)
                    {
                        karakter -= 6;
                    } 
                    else if (x > 0)
                    {
                        karakter += 6;
                    }
                }
                else if (karakter < '[' && x < 0)
                {
                    karakter -= 6;
                }
            }
            else if (karakter <= 'Z')
            {
                karakter = karakter + x;
                if (karakter >= '[' && karakter <= '`')
                {
                    karakter += 6;
                }
                if (karakter < 'A')
                {
                    karakter += 26;
                }
            }
            if (karakter >= '{')
            {
                karakter -= 26;
            }
        }    

        cout << (char)toupper(karakter);    
    }
    
    fileteks.close();
}

int main()
{
    int x;
    string nFile, isi;

    cout << "PROGRAM ENKRIPSI"
         << endl
         << endl;
    cout << "Masukkan nama untuk membuat file!" << endl
         << "Input\t\t: "; getline(cin, nFile);
    cout << "\nMasukkan teks untuk mengisi file!" << endl
         << "Input\t\t: "; getline(cin, isi);

    tambahIsifile(nFile, isi);
    enkripsiFile(nFile, x);
}