/*  Nama Program    : 210059_UTSStrukDat_Soal3
    Nama            : Prames Ray Lapian
    NPM             : 140810210059
    Tanggal Buat    : 10 April 2022
    Deskripsi       : Soal 3 UTS
    Lokasi File     : C:\Users\prame\Documents\PRAMES\PERKULIAHAN\SEMESTER 2\Struktur Data\TUGAS
**************************************************/

#include<iostream>
#include <iomanip>
using namespace std;

struct pegawai
{
    int NIP;
    char nama[30];
    int gol;
};

struct node
{
    node *next;
    node *prev;
    pegawai info;
};

typedef node* pointer;
typedef pointer List;

void createElement(pointer &pBaru) 
{
    pBaru = new node;
    cout << "Nama     : "; cin.get(pBaru -> info.nama, 30); cin.ignore(); 
    cout << "NIP      : "; cin >> pBaru -> info.NIP; 
    cout << "Golongan : "; cin >> pBaru -> info.gol; 
    
    pBaru -> next = NULL;
    pBaru -> prev = NULL;
}

void search(List& first, int& key) 
{
    if (first != NULL) 
    {
        cout << "Masukkan NIP yang dicari : "; cin >> key; cin.ignore();
    }
    else 
    {
        key = 0;
    }
}

void linearSearch(List &first, pointer &pCari, int key, pointer& pBantu) 
{
    pCari = first;

    while (pCari != NULL) 
    {
        if (pCari -> info.NIP == key)
        {
            break;
        }
        
        pBantu = pCari;
        pCari = pCari -> next;
    }
}

void insertBefore(List& first, pointer pCari, pointer pBantu, pointer pBaru)
{
    if (first == NULL)
    {
        first = pBaru;
    }
    else if (pCari == first) 
    {
        pBaru -> next = first;
        first -> prev = pBaru;
        pBaru -> prev = NULL;
        first = pBaru;
    }
    else
    {
        pBantu -> next = pBaru;
        pBaru -> prev = pBantu;
        pCari -> prev = pBaru;
        pBaru -> next = pCari;
    }
}

void golGaji(int k)
{
    int gaji;
    
    if(k == 1)
    {
        gaji = 1000000;
    }
    else if(k == 2)
    {
        gaji = 2000000;
    }
    else if(k == 3)
    {
        gaji = 3000000; 
    }
    cout << setw(15) << gaji;
}

void traversal(pointer first) 
{
    if (first == NULL) 
    {
        cout << "list kosong" << endl;
    }
    else 
    {
        pointer pBantu = first;
        
        while (pBantu->next != NULL) 
        {
            pBantu = pBantu->next;
        }

        cout << setw(5) << "NO" << setw(10) << "NIP" << setw(20) << "NAMA" << setw(15) << "GOLONGAN" << setw(15) << "GAJI" << endl;
        int number = 1;
    
        while (pBantu != NULL) 
        {
            cout << setw(5) << number << setw(10) << pBantu->info.NIP << setw(20) << pBantu->info.nama << setw(15) << pBantu->info.gol; 
            golGaji(pBantu->info.gol);
            cout << endl;
            
            pBantu = pBantu->prev;
            number++;
        }
    }
}

void edit(pointer pCari) 
{
    cout << "nama baru : "; cin.get(pCari->info.nama, 30); cin.ignore();
    cout << "golongan baru : "; cin >> pCari->info.gol;
}

void menu(int &opsi) 
{
    cout << endl;
    cout << "========================" << endl
         << "      LIST PEGAWAI      " << endl
         << "========================" << endl
         << "1. Input data           " << endl
         << "2. Cetak data           " << endl
         << "3. Edit data            " << endl
         << "4. keluar               " << endl
         << "Pilihan : "; cin >> opsi; cin.ignore();
    cout << endl;
}

int main() 
{
    List list = NULL;
    pointer pBaru, pHapus, pCari, pBantu;
    int nilai, opsi;
    
    program:
    menu(opsi);

    switch (opsi) 
    {
        case 1 :
            search(list, nilai);
            linearSearch(list, pCari, nilai, pBantu);
            createElement(pBaru);
            insertBefore(list, pCari, pBantu, pBaru);
            goto program;
        break;
        
        case 2 :
            traversal(list);
            goto program;
        break;
        
        case 3 :
            search(list, nilai);
            linearSearch(list, pCari, nilai, pBantu);
            edit(pCari);
            goto program;
        break;

        default :
        break;
    }
}