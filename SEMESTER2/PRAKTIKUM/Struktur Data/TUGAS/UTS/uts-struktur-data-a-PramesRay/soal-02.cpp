#include <iostream>
#include <string.h>
#include <iomanip>
using namespace std;

struct Pemain 
{
    string Nama;
    int Angkatan;
    int JumlahGol;
};

struct Node 
{
    Pemain info;
    Node* next;
};

typedef Node *pointer;
typedef pointer List;

void createElement(pointer& pBaru);
void insertLast(List& first, pointer pBaru);
void traversal(List first);
void linearSearch (List first, pointer& pCari, string nama, int& found);
void update(List& first, string nama, int angkatan, int gol);
void createUpdate(List first, pointer pCari, int found, string& nama, int& angkatan, int& gol);
char menu();

int main() 
{
    List first = NULL;
    pointer pBaru, pHapus, pCari, preCari;
    string nama;
    int angkatan;
    int gol;
    int opsi;
    int found = 0;
    bool program = true;

    while (program) 
    {
        int pil = menu();

        switch (pil) 
        {
            case 1:
                createElement(pBaru);
                insertLast(first, pBaru);
                traversal(first);
                break;

            case 2:
                createUpdate(first, pCari, found, nama, angkatan, gol);
                break;

            case 3:
                traversal(first);

            default:
                cout << "\nPilihan Tidak Tersedia." << endl;
                break;
        }
        
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
}

void createElement(pointer& pBaru) 
{
    pBaru = new Node;
    
    cout << "\nData Pemain yang ingin ditambahkan:" << endl;
    cout << "Nama      : "; cin >> pBaru -> info.Nama; cin.ignore();
    cout << "Angkatan  : "; cin >> pBaru -> info.Angkatan; cin.ignore();
    cout << "Jumlah GOL: "; cin >> pBaru -> info.JumlahGol; cin.ignore();
    
    pBaru -> next = NULL;
}

void insertLast(List& first, pointer pBaru) 
{
    if (first == NULL) 
    {
        first = pBaru;
    }
    else 
    {
        pointer last = first;
        
        while (last -> next != NULL)
        {
            last = last -> next;
        }
        
        last -> next = pBaru;
    }
}

void linearSearch(List first, pointer& pCari, string nama, int& found) 
{
    found = 0;
    pCari = first;

    while (found == 0 && pCari != NULL) 
    {
        if (pCari -> info.Nama != nama) 
        {
            found = 1;
        }
        else 
        {
            pCari = pCari -> next;
        }
    }
}

void createUpdate(List first, pointer pCari, int found, string& nama, int& angkatan, int& gol) 
{    
    cout << "\nMasukkan Nama yang ingin di-update\t: "; cin >> nama; cin.ignore();
    linearSearch(first, pCari, nama, found);

    if (found) 
    {
        cout << "\nData Pemain diubah menjadi:" << endl;
        cout << "Nama      : "; cin >> pCari -> info.Nama; cin.ignore();
                                       pCari -> info.Nama = nama;
        cout << "Angkatan  : "; cin >> pCari -> info.Angkatan; cin.ignore();
                                       pCari -> info.Angkatan = angkatan;
        cout << "Jumlah GOL: "; cin >> pCari -> info.JumlahGol; cin.ignore();
                                       pCari -> info.JumlahGol = gol; 
        
        update(first, nama, angkatan, gol);

        cout << endl;
        traversal(first);
    }
    else 
    {
        cout << "\nData Tidak Ditemukan!" << endl;
    }
      
}

void update(List& first, string nama, int angkatan, int gol)
{
    pointer temp = first;
    
    while (temp != nullptr)
    {
        if (temp -> info.Nama == nama)
        {
            temp -> info.Angkatan = angkatan;
            temp -> info.JumlahGol = gol;
        }
        temp = temp -> next;
    }
}

void traversal(List first) 
{
    if (first == NULL) 
    {
        cout << "\nList kosong!" << endl;
    }
    else 
    {
        pointer pBantu = first;
        cout << endl;
        cout << setw(30) << "NAMA" << setw(10) << "ANGKATAN" << setw(5) << "GOL" << endl;
    
        do 
        {
            cout << setw(30) << pBantu->info.Nama << setw(10) << pBantu->info.Angkatan << setw(5) << pBantu->info.JumlahGol << fixed << setprecision(0) << endl;
            
            pBantu = pBantu -> next;
        }
        while (pBantu != NULL);
    }
}

char menu() 
{
    int opsi;
    cout << "======================================" << endl
         << "          MENU PROGRAM Pemain        " << endl
         << "======================================" << endl
         << "1. Input Data (Last)                  " << endl
         << "2. Update Data                        " << endl
         << "3. Tampilkan seluruh Data             " << endl << endl
         << "Pilihan\t: "; cin >> opsi; cin.ignore();
    
    return opsi;
}