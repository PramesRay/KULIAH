/*  Nama Program    : Latihan2_1
    Nama            : Prames Ray Lapian
    NPM             : 140810210059
    Tanggal Buat    : 4 Mar 2022
    Deskripsi       : Cari rata-rata dan Nilai minimum
    Lokasi File     : C:\Users\prame\Documents\PRAMES\PERKULIAHAN\SEMESTER 2\Struktur Data\TUGAS
**************************************************/
#include <iostream>
using namespace std;

typedef int larik[10];

void inputData(int& n)
{
    cout << "Masukkan banyak data: ";
    cin >> n;
}

void rataRata(larik data, int n, float& rata)
{
    float jumlah;
    
    for (int i = 0; i < n; i++)
    {
        cout << "Data ke-" << i+1 << " \t: ";
        cin >> data[i];
        jumlah += data[i];
    }
        
    rata = jumlah/n;
    cout << "rata - rata \t: " << rata << endl;
}

void nilaiMinimum(larik data, int n, float& minimum)
{
    minimum = data[0];
    
    for (int i = 0; i < n; i++) 
    {
        if (data[i] <= minimum)  
        {
            minimum = data[i];
        }
    }
    cout << "Nilai minimum \t: " << minimum << endl;
}

void nilaiMaksimum(larik data, int n, float& maksimum)
{
    
    maksimum = data[0];
    
    for (int i = 0; i < n; i++) 
    {
        if (data[i] >= maksimum)  
        {
            maksimum = data[i];
        }
    }
    cout << "Nilai maksimum \t: " << maksimum << endl;
}

void printData(larik data, int n, float rata, float minimum, float maksimum)
{
    rataRata(data, n, rata);
    nilaiMinimum(data, n, minimum);
    nilaiMaksimum(data, n, maksimum);
}

int main()
{
    larik data;
    int n;
    float rata, minimum, maksimum, jumlah;
    inputData(n);
    system("CLS");
    printData(data, n, rata, minimum, maksimum);
}