/*  Nama Program    : Tugas1_2_1
    Nama            : Prames Ray Lapian
    NPM             : 140810210059
    Tanggal Buat    : 21 Feb 2022
    Deskripsi       : Buat menu untuk mencari faktorial, permutasi, kombinasi dengan switch
    Lokasi File     : C:\Users\prame\Documents\PRAMES\PERKULIAHAN\SEMESTER 2\Struktur Data\TUGAS
**************************************************/
#include <iostream>
using namespace std;

void inputdata(int& n, int& r, int& menu)
{
    cout << "\nMENU\n"
         << "1. Faktorial\n"
         << "2. Permutasi\n"
         << "3. Kombinasi\n\n"
         << "Pilihan: "; cin >> menu;
    
    switch (menu)
    {
    case 1: cout << "Masukkan angka yang ingin di faktorialkan! "; cin >> n;
        break;
    case 2: cout << "Masukkan angka untuk variabel n! "; cin >> n;
            cout << "Masukkan angka untuk variabel r! "; cin >> r;
        break;
    case 3: cout << "Masukkan angka untuk variabel n! "; cin >> n;
            cout << "Masukkan angka untuk variabel r! "; cin >> r;
        break;
    }
}

int forfaktorial1(int n)                                                     
{
    int faktorial = 1;
    
    for (int i = 1; i <= n; i++)
    {
        faktorial *= i;
    }

    return faktorial;
}

int whilefaktorial(int n)                                                     
{
    int faktorial = 1;
    int i = 1;

    while (i <= n)
    {
        faktorial *= i;
        i++;
    }

    return faktorial;
}

int permutasi(int n, int r)
{
    int permutasi;

    permutasi = forfaktorial1(n) / forfaktorial1(n-r);

    return permutasi;
}

int kombinasi(int n, int r)
{
    int kombinasi;

    kombinasi = forfaktorial1(n) / (forfaktorial1(n-r)*forfaktorial1(r));

    return kombinasi;
}

void outputdata(int n, int r, int menu)
{
    if (menu == 1)
    {
        cout << "\nHasil dari faktorial " << n << " = " << forfaktorial1(n) << endl;
    }
    else if (menu == 2)
    {
        cout << "\nHasil dari permutasi P(" << n << "," << r << ") = " << permutasi(n, r) << endl;
    }
    else if (menu == 3)
    {
        cout << "\nHasil dari kombinasi C" << n << "," << r << ") = " << kombinasi(n, r) << endl;
    }
}


int main()
{
    int n, r, menu;
    inputdata(n, r, menu);
    outputdata(n, r, menu);
}