/*  Nama Program    : Tugas8_2
    Nama            : Prames Ray Lapian
    NPM             : 140810210059
    Tanggal Buat    : 24 April 2022
    Deskripsi       : Membuat program untuk mengolah data pegawai dengan menggunakan operasi PUSH dan POP suatu Tumpukan (Linked List).
    Lokasi File     : C:\Users\prame\Documents\PRAMES\PERKULIAHAN\SEMESTER 2\Struktur Data\TUGAS
**************************************************/

#include <iostream>
#include <string.h>
#include <iomanip>
using namespace std;

struct Pegawai 
{
    char NIP[10];
    char Nama[30];
    char Alamat[30];
    string gol;
    float gaji;
    int TOP;
    Pegawai *next;
};

typedef Pegawai *pointer;
typedef pointer Stack;

Stack S;

string golPegawai(float gaji);
void createStack(Stack& TOP);
void createPegawai(Stack& TOP, pointer& pBaru);
void push(Stack& TOP, pointer pBaru);
void pop(Stack& TOP, pointer& pHapus);
void traversal(Stack TOP);
char menu();

int main() 
{
    Stack TOP = NULL;
    pointer pBaru, pHapus;
    int opsi;
    int found = 0;
    bool program = true;
    createStack(TOP);

    while (program) 
    {
        int pil = menu();
        

        switch (pil) 
        {
            case 1:
                createPegawai(TOP, pBaru);
                push(TOP, pBaru);
                traversal(TOP);
                break;
            
            case 2:
                createPegawai(TOP, pBaru);
                pop(TOP, pBaru);
                traversal(TOP);
                break;
            
            case 3:
                traversal(TOP);
                break;
            
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

void createStack(Stack& TOP)
{
    TOP = NULL;
}

void createPegawai(Stack& TOP, pointer& pBaru)
{
    pBaru = new Pegawai;
    
    cout << "\nData pegawai yang ingin ditambahkan:" << endl;
    cout << "NIP    : "; cin.get(pBaru->NIP,10); cin.ignore();
    cout << "Nama   : "; cin.get(pBaru->Nama,30); cin.ignore();
    cout << "Alamat : "; cin.get(pBaru->Alamat,30); cin.ignore();
    cout << "Gaji   : "; cin >> pBaru->gaji; cin.ignore();
    
    pBaru->gol = golPegawai(pBaru->gaji);
    pBaru->next = NULL;
}

void push(Stack& TOP, pointer pBaru)
{
    cout << "Push Pegawai "<< endl;
    if (TOP == NULL)
    {
        TOP = pBaru;
    }
    else 
    { 
        pBaru->next = TOP;
        TOP = pBaru;
    }
}

void pop(Stack& TOP, pointer& pHapus)
{
    cout << "Pop Stack " << endl;
    
    if (TOP == NULL)
    {
        cout << "Stack kosong " << endl;
        pHapus = NULL;
    }
    else if (TOP->next == NULL)
    {
        pHapus = TOP;
        TOP = NULL;
    }
    else 
    {
        pHapus = TOP;
        TOP = TOP->next;
        pHapus->next = NULL;
    }
}

void traversal(Stack TOP)
{
    pointer pBantu = TOP;
    if (TOP == NULL)
    {
        cout << "Stack kosong " << endl;
        pBantu = NULL;
    }
    else 
    {
        cout << endl;
        cout << setw(10) << "NIP" << setw(30) << "NAMA" << setw(30) << "ALAMAT" << setw(10) << "GOL" << setw(15) << "GAJI" << endl;
    
        do 
        {
            cout << setw(10) << pBantu->NIP << setw(30) << pBantu->Nama << setw(30) << pBantu->Alamat;
            cout << setw(10) << pBantu->gol << setw(15) << fixed << setprecision(0) << pBantu->gaji << endl;
            
            pBantu = pBantu->next;
        }
        while (pBantu != NULL);
    }

    cout << endl;
}

string golPegawai(float gaji) 
{
    string gol;

    if (gaji <= 1000000) 
    {
        gol = "1A";
    }
    else if (gaji > 1000000 && gaji <= 2000000) 
    {
        gol = "1B";
    }
    else if (gaji > 2000000 && gaji <= 3000000) 
    {
        gol = "2A";
    }
    else if (gaji > 3000000 && gaji <= 4000000) 
    {
        gol = "2B";
    }
    else if (gaji > 4000000 && gaji <= 5000000) 
    {
        gol = "3A";
    }
    else if (gaji > 5000000 && gaji <= 6000000) 
    {
        gol = "3B";
    }
    else if (gaji > 6000000 && gaji <= 7000000) 
    {
        gol = "4A";
    }
    else if (gaji > 7000000) 
    {
        gol = "4B";
    }
    
    return gol;
}

char menu() 
{
    int opsi;
    cout << "=======================================" << endl
         << "       MENU PROGRAM STACK PEGAWAI      " << endl
         << "=======================================" << endl
         << "1.  Push Data Pertama Pegawai          " << endl
         << "2.  Pop Data Terakhir Pegawai          " << endl
         << "3.  Print Data Pegawai (Before Key)    " << endl << endl
         << "Pilihan\t: "; cin >> opsi; cin.ignore();
    
    return opsi;
}

