/*  Nama Program    : 210059_UTSStrukDat_Soal2
    Nama            : Prames Ray Lapian
    NPM             : 140810210059
    Tanggal Buat    : 10 April 2022
    Deskripsi       : Soal 2 UTS
    Lokasi File     : C:\Users\prame\Documents\PRAMES\PERKULIAHAN\SEMESTER 2\Struktur Data\TUGAS
**************************************************/

#include <iostream>
#include <iomanip>
using namespace std;

struct Mahasiswa 
{
    string nama;
    string npm;
    float nilai;
    Mahasiswa *next;
};

struct Node 
{
    Mahasiswa info;
    Node *next;
};

typedef Node* pointer;
typedef pointer List;

void createElement(pointer &pBaru) 
{
    pBaru = new Node;
    cout << "Nama   : "; cin >> pBaru -> info.nama; cin.ignore();
    cout << "NPM    : "; cin >> pBaru -> info.npm; cin.ignore();
    cout << "Nilai  : "; cin >> pBaru -> info.nilai; cin.ignore();
    pBaru -> next = NULL;
}

void insertFirst(List &first, pointer pBaru) 
{
    cout << endl;
    if (first == NULL) 
    { 
        first = pBaru;
    }
    else 
    {			  
        pBaru -> next = first;
        first = pBaru;
    }
}

void rataRata(float &rata, List &first) 
{
    float jumlah = 0;
    int loop = 0;

    if (first == NULL) 
    { 
        cout << "List kosong!\n";
    } 
    else 
    { 
        pointer pBantu = first;
        
        do
        {
            jumlah += pBantu -> info.nilai;
            pBantu = pBantu -> next;
            loop += 1;
        }
        while (pBantu != NULL);

        rata = jumlah / loop;

        cout << "Rata - rata nilai : " << rata << endl;
    }
}

char nilaiMutu(float nilai)
{
    char nilaiMutu;
    
    if (nilai >= 80 && nilai <= 100)
    {
        nilaiMutu = 'A';
    }
    else if (nilai >= 68 && nilai <= 80)
    {
        nilaiMutu = 'B';
    }
    else if (nilai >= 55 && nilai <= 68)
    {
        nilaiMutu = 'C';
    }
    else if (nilai >= 45 && nilai <= 55)
    {
        nilaiMutu = 'D';
    }
    else if (nilai >= 0 && nilai <= 45)
    {
        nilaiMutu = 'E';
    }
    
    return nilaiMutu;
}

string kelulusan(char nilaiMutu) 
{
    string status;
    
    if (nilaiMutu == 'A' || nilaiMutu == 'B' || nilaiMutu == 'C') 
    {
        status = "lulus";
    }
    else 
    {
        status = "tidak lulus";
    }
    
    return status;
}

void traversal(List first, int number)
{
    if (first == NULL) 
    {
        cout << "\nList kosong!" << endl;
    }
    else 
    {
        pointer pBantu = first;
    
        cout << endl; 
        cout << "-------------------------------------------------------------------------" << endl; 
        cout << setw(5) << "NO" << setw(10) << "NPM" << setw(30) << "NAMA"  << setw(10) << "NILAI" << setw(5) << "HM" << setw(10) << "STATUS" << endl;
        cout << "-------------------------------------------------------------------------" << endl;
    
        do
        {
            cout << setw(5) << number << setw(10) << pBantu -> info.npm << setw(30) << pBantu -> info.nama  << setw(10) << pBantu -> info.nilai << setw(5) << nilaiMutu(pBantu -> info.nilai) << setw(10)  << kelulusan(nilaiMutu(pBantu -> info.nilai)) << endl;
            
            number += 1;
            pBantu = pBantu -> next;
        }
        while (pBantu != NULL);   
        cout << "-------------------------------------------------------------------------" << endl;
    }
}

int main()
{
    List first = NULL;
    pointer pBaru;
    float rata;
    int number = 1;
    bool program = true;
    int opsi;

    while (program) 
    {
        createElement(pBaru);
        insertFirst(first, pBaru);

        cout << "\nIngin terus menggunakan program?" << endl
             << "1.YA                              " << endl
             << "2.TIDAK                           " << endl
             << "Pilihan\t: "; cin >> opsi; cin.ignore();

        if (opsi == 1) 
        {
            program = true;
        }
        else if (opsi == 2) 
        {
            program = false;
            cout << "\nTerima kasih!" << endl;
        }
        else 
        {
            program = false;
            cout << "\nPilihan Tidak Tersedia" << endl;
        }
    }

    traversal(first, number);
    rataRata(rata, first);
    
    
}