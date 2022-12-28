/*  Nama Program    : 210059_UTSStrukDat_Soal1
    Nama            : Prames Ray Lapian
    NPM             : 140810210059
    Tanggal Buat    : 10 April 2022
    Deskripsi       : Soal 1 UTS
    Lokasi File     : C:\Users\prame\Documents\PRAMES\PERKULIAHAN\SEMESTER 2\Struktur Data\TUGAS
**************************************************/

#include <iostream>
using namespace std;

typedef int Larik[15];

void inputBanyakData(int& n)
{
    cout << "Input banyak data : "; cin >> n;
}

void inputData(Larik& data, int n) 
{
    for (int i = 0; i < n; i++) 
    {
        cout << "\nMasukan data mahasiswa ke- " << (i+1) << endl 
             << "Nilai : "; cin >> data[i];
    }
}

void cetakData(Larik data, int n)
{
    cout << "=========" << endl
         << "  DATA   " << endl
         << "=========" << endl;
    
    for (int i = 0; i < n; i++) 
    {
        cout << data[i] << endl;
    }
}

int deleteLarik(Larik& data, int& n, int key, int status)
{
    status = 0;
    cout << "Data yang ingin dihapus : "; cin >> key; cin.ignore();

    for (int i = 0; i < n; i++) 
    {
        if (data[i] == key) 
        {
            status = 1;
            data[i] = data[i + 1];
            n -= 1;
            cout << "Data berhasil dihapus" << endl;
            break;
        }
        else if (i == n) 
        {
            cout << "Data tidak ditemukan" << endl;
            break;
        }
    }
    return 0;    
}   

int main()
{
    Larik data;
    int n, key, help;
    inputBanyakData(n);
    inputData(data, n);
    cetakData(data, n);
    
    deleteLarik(data, n, key, help);
    
    cetakData(data, n);

}