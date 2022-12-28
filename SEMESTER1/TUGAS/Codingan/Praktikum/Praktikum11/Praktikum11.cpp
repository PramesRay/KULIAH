/*
Nama Program    : Praktikum11
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 24 November 2021
Deskripsi       : Latihan1
*/
/*
#include <iostream>
#include <fstream>
using namespace std;

void bukutulisIsifile(char nfile[]) 
{
    ofstream fileteks;
    fileteks.open(nfile);
    fileteks << "Hello Prames" << endl;
    fileteks.close();
}

void tambahIsifile(char nfile[], char isi[]) 
{
    ofstream fileteks;
    fileteks.open(nfile, ios::app);
    fileteks << "Hello Lapian" << endl
             << isi << endl;   
    fileteks.close();
}

void periksaFile(char nFile[])
{ 
    ifstream fileteks; 
    fileteks.open(nFile); 
    
    if (fileteks.fail()) 
    { 
        cout << "File tidak dapat ditemukan" << endl;
    } 
    else 
    { 
        cout << "File dapat ditemukan" << endl; 
    } 
    
    fileteks.close();
}

void isiFilePerKarakter(char nFile[])
{
    ofstream fileteks;
    fileteks.open(nFile);
    fileteks.put('A');
    fileteks.put('B');
    fileteks.put('c');
    fileteks.put('\n');
    fileteks.close();
}

void cetakIsiFilePerKarakter(char nFile[])
{
    char karakter;
    ifstream fileteks;
    fileteks.open(nFile);
    
    while (!fileteks.eof())
    {
        fileteks.get(karakter);
        cout << karakter  << endl;
    }
    
    fileteks.close();
}

int cariJumlahHurufA(char nFile[])
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
    
    fileteks.close();
    return jumlahA;
}

int main()
{
    char namafile[] = "operasiFile.txt";
    char isi[] = "Hello Lapianners!";

    // bukutulisIsifile(namafile);
    // tambahIsifile(namafile, isi);
    // periksaFile(namafile);
    // isiFilePerKarakter(namafile);
     cetakIsiFilePerKarakter(namafile);
    // cout << "Jumlah huruf A = " << cariJumlahHurufA(namafile) << endl;
}
*/

//=====================================================================================================================================================================================

/*
Nama Program    : Praktikum11
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 24 November 2021
Deskripsi       : Tugas1
*/
/*
#include <iostream>
#include <fstream>
using namespace std;

void buatFile(char nfile[]) 
{
    ofstream fileteks;
    fileteks.open(nfile);
    fileteks.close();
}

void inputIsifile(char nfile[], char isi[]) 
{
    ofstream fileteks;
    fileteks.open(nfile, ios::app);
    fileteks << isi << endl;   
    fileteks.close();
}

void cariJumlahHuruf(char nFile[])
{
    char karakter, n;
    int jumlahKarakter = 0;
    
    ifstream fileteks;
    fileteks.open(nFile);
    
    cout << "Masukkan huruf yang ingin dicari! "; cin >> n;

    while (!fileteks.eof())
    {
        fileteks.get(karakter);
        if (karakter == n)
        {
            jumlahKarakter = jumlahKarakter + 1;
        }
    }

    cout << "Jumlah huruf " << n << " = " << jumlahKarakter;
    
    fileteks.close();
}

int main()
{
    char nFile[] = "operasiFile.txt";
    char isi[] = "Buatlah program untuk menghitung jumlah karakter tertentu, misalnya karakter 'A. Input berupa nama file dan karakter yang akan dihitung.";

    buatFile(nFile);
    inputIsifile(nFile, isi);
    cariJumlahHuruf(nFile);
}
*/

//=====================================================================================================================================================================================

/*
Nama Program    : Praktikum11
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