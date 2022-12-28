/*  Nama Program    : Tugas1_1_2
    Nama            : Prames Ray Lapian
    NPM             : 140810210059
    Tanggal Buat    : 28 Feb 2022
    Deskripsi       : Membuat program untuk menampilkan output yang diminta
    Lokasi File     : C:\Users\prame\Documents\PRAMES\PERKULIAHAN\SEMESTER 2\Struktur Data\TUGAS
**************************************************/
#include <iostream>
using namespace std;

int main()
{
    int n;

    cout << "Masukkan jumlah perulangan: "; cin >> n;

    cout << "\nFor Loop 1" << endl;
    for (int i = 1; i <= n; i++)
    {
        cout << i << ". ";

        for (int j = 1; j <= i; j++)
        {
            cout << "* ";
        }

        cout << endl;
    }

    cout << "\nFor Loop 2" << endl;
    for (int i = 1; i <= n; i++)
    {
        cout << i << ". ";

        for (int j = n; j >= i; j--)
        {
            cout << "* ";
        }

        cout << endl;
    }

    cout << "\nWhile Loop 1" << endl;
    int i = 1;
    int k = n;
    while (i <= n)
    {
        cout << i << ". ";

        int j = 1;        
        while (j <= i)
        {
            cout << "* ";
            j++;
        }
        
        cout << "\n";
        i++;
    }

    cout << "\nWhile Loop 2" << endl;
    i = 1;
    while (i <= n)
    {
        cout << i << ". ";
        
        int j = 1;
        while (j <= k)
        {
            cout << "* ";
            j++;
        }
        
        cout << "\n";
        i++;
        k--;
    }
}