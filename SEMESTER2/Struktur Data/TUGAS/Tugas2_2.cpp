/*  Nama Program    : Tugas2_2
    Nama            : Prames Ray Lapian
    NPM             : 140810210059
    Tanggal Buat    : 4 Mar 2022
    Deskripsi       : Cari bilai rata-rata dan nilai maksimum dari data mahasiswa
    Lokasi File     : C:\Users\prame\Documents\PRAMES\PERKULIAHAN\SEMESTER 2\Struktur Data\TUGAS
**************************************************/
#include <iostream>
using namespace std;

struct mahasiswa 
{
    char NPM[12] ;
    char nama[20];
    int nilai;
};

typedef mahasiswa LarikMhs[10];
LarikMhs mhs;

void inputData(int& n)
{
    cout << "Banyak data : "; cin >> n;
}

void inputMahasiswa (LarikMhs& Mhs, int n) 
{
    for (int i = 0; i < n; i++) 
    {
        cout << "\nMasukan data mahasiswa ke- " << (i+1) << endl;
        cout << "NPM : "; cin >> Mhs[i].NPM;
        cout << "Nama : "; cin >> Mhs[i].nama;
        cout << "Nilai : "; cin >> Mhs[i].nilai;
    }
}
void cetakMahasiswa(LarikMhs Mhs, int n)
{
    cout << "DATA MAHASISWA " << endl;
    for (int i = 0; i < n; i++) 
    {
        cout << Mhs[i].NPM << " \t| " << Mhs[i].nama << " \t\t| " << Mhs[i].nilai << endl;
    }
}

void rataRataNilai(LarikMhs Mhs, int n, float& rata)
{
    float jumlah;
    for (int i = 0; i < n; i++)
    {
        jumlah = jumlah + Mhs[i].nilai;
    }
        
    rata = jumlah/n;
}

void nilaiMaksimum(LarikMhs Mhs, int n, float& maksimum)
{   
    maksimum = Mhs[0].nilai;
    
    for (int i = 0; i < n; i++) 
    {
        if (Mhs[i].nilai >= maksimum)  
        {
            maksimum = Mhs[i].nilai;
        }
    }
}

void printData(LarikMhs Mhs, int n, float rata, float maksimum)
{
    cout << "rata - rata nilai mahasiswa        : " << rata << endl;
    cout << "Nilai maksimum dari semua mahasiswa: " << maksimum << endl;
}

main()
{
    LarikMhs mhs;
    int n;
    float rata, maksimum;
    inputData(n);
    inputMahasiswa(mhs,n);
    rataRataNilai(mhs, n, rata);
    nilaiMaksimum(mhs, n, maksimum);
    printData(mhs, n, rata, maksimum);
}
