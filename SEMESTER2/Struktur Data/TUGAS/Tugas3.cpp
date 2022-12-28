/*  Nama Program    : Tugas4
    Nama            : Prames Ray Lapian
    NPM             : 140810210059
    Tanggal Buat    : 20 Mar 2022
    Deskripsi       : Menambahkan fungsi Delete First, Insert Last, Delete Last pada tugas 3
    Lokasi File     : C:\Users\prame\Documents\PRAMES\PERKULIAHAN\SEMESTER 2\Struktur Data\TUGAS
**************************************************/
#include <iostream>
using namespace std;

struct Mahasiswa 
{
    char nama[30];
    char npm[12];
    int nilai;
    Mahasiswa *next;
};

typedef Mahasiswa* MahasiswaPtr;
typedef MahasiswaPtr LinkedList;

void createMhs(MahasiswaPtr &pNew) 
{
    pNew = new Mahasiswa;
    cout << "Nama   : "; cin >> pNew -> nama;
    cout << "NPM    : "; cin >> pNew -> npm;
    cout << "Nilai  : "; cin >> pNew -> nilai;
    pNew -> next = nullptr;
}

void insertFirst(LinkedList &head, MahasiswaPtr pNew) 
{
    cout << endl;
    if (head == nullptr) 
    { 
        head = pNew;
    }
    else 
    {			  
        pNew -> next = head;
        head = pNew;
    }
}

void insertLast(LinkedList &head, MahasiswaPtr &pNew)
{
    if (head == nullptr)
    {
        head = pNew;
    }
    else 
    {
        MahasiswaPtr last = head;
        do 
        {
            last = last -> next;
        }
        while (last -> next != nullptr);
        
        last -> next = pNew;
    }
}

void printMhs(LinkedList &head) 
{
    if (head == nullptr) 
    { 
        cout << "List kosong!\n";
    } 
    else 
    { 
        MahasiswaPtr pHelp = head;
        
        do
        {
            cout << pHelp -> npm << " | " << pHelp -> nama << " \t| " << pHelp -> nilai << endl;
            pHelp = pHelp -> next;
        }
        while (pHelp != nullptr);
    }
}

void deleteFirst(LinkedList &head, MahasiswaPtr &pHapus) 
{
    if (head == nullptr)
    {
        pHapus = nullptr;
        cout << "\nList kosong!\n";
    }
    else if (head == nullptr)
    {
        pHapus = head;
        head = nullptr;
    }
    else 
    {
        pHapus = head;
        head = head -> next;
        pHapus -> next = nullptr;
        
        cout << "\nData berhasil dihapus!\n";
    }
    
    
}

void deleteLast(LinkedList &head, MahasiswaPtr &pHapus) 
{
    if (head == nullptr)
    {
        pHapus = nullptr;
        cout << "\nList kosong!\n";
    }
    else if (head -> next == nullptr)
    {
        pHapus = head;
        head = nullptr;
    }
    else 
    {
        MahasiswaPtr last = head;
        MahasiswaPtr precLast = nullptr;
        
        do 
        {
            precLast = last;
            last = last -> next;
        }
        while (last -> next != nullptr);
        
        precLast -> next = nullptr;

        cout << "\nData berhasil dihapus!\n";
    }
}

void deleteList(LinkedList &head) 
{
    if (head == nullptr) 
        return;
    
    MahasiswaPtr currentmhs = head;
    MahasiswaPtr nextmhs = nullptr;
    
    while (currentmhs != nullptr) 
    {
        nextmhs = currentmhs -> next;
        delete currentmhs;
        currentmhs = nextmhs;
    }

    head = nullptr;
}

void search(LinkedList &head, MahasiswaPtr &pSearch, string &key) 
{
    pSearch = head;
    
    cout << "Masukkan data yang ingin dicari: "; cin >> key;

    while (pSearch != nullptr) 
    {
        if (pSearch -> npm == key)
        break;
    
        pSearch = pSearch -> next;
    }
}


void deleteByKey(LinkedList &head, MahasiswaPtr &pDelete, string key) 
{
    search(head, pDelete, key);

    if (head == nullptr || pDelete == nullptr) 
    {
        cout << "Node tidak ditemukan!\n";
    } 
    else 
    {
        MahasiswaPtr pHelp;

        if (pDelete == head) 
        {
            head = head -> next;
            pDelete -> next = nullptr;
        } 
        else if (pDelete -> next == nullptr) 
        { 
            pHelp -> next = pDelete;
            pHelp -> next = nullptr;
            pDelete -> next = nullptr;
        } 
        else 
        {
            pHelp -> next = pDelete -> next;
            pDelete -> next = nullptr;
        }
        
        delete pDelete;
        cout << "\nData berhasil dihapus!\n";
    }
}


void rataRata(float &rata, LinkedList &head) 
{
    float jumlah = 0;
    int loop = 0;

    if (head == nullptr) 
    { 
        cout << "List kosong!\n";
    } 
    else 
    { 
        MahasiswaPtr pHelp = head;
        
        do
        {
            jumlah += pHelp -> nilai;
            pHelp = pHelp -> next;
            loop += 1;
        }
        while (pHelp != nullptr);

        rata = jumlah / loop;

        cout << "Rata - rata nilai : " << rata << endl;
    }
}

void nilaiMaksimal(float &maksimal, LinkedList &head) 
{
    if (head == nullptr) 
    { 
        cout << "List kosong!\n";
    } 
    else 
    { 
        MahasiswaPtr pHelp = head;
        
        do
        {
            if (pHelp -> nilai >= maksimal)  
            {
                maksimal = pHelp -> nilai;
            }
            
            pHelp = pHelp -> next;
        }
        while (pHelp != nullptr);

        cout << "Maksimal nilai    : " << maksimal << endl;
    }
}

int main() 
{
    LinkedList head = nullptr;
    MahasiswaPtr pNew, pHapus;
    float ratarata, maksimal;
    char option, end;
    string key;
    bool program = true;

    while (program)
    {
        cout << "====================================" << endl
             << "              MENU                  " << endl
             << "====================================" << endl
             << "1. Input data mahasiswa di awal     " << endl
             << "2. Input data mahasiswa di akhir    " << endl
             << "3. Hapus data mahasiswa di awal     " << endl
             << "4. Hapus data mahasiswa di akhir    " << endl
             << "5. Hapus data mahasiswa yang dipilih" << endl
             << "6. rata-rata data mahasiswa         " << endl
             << "7. nilai tertinggi mahasiswa        " << endl
             << "8. Print seluruh data mahasiswa     " << endl << endl
             << "Pilihan : "; cin >> option;
        cout << endl;

        switch (option)
        {
            case '1':
                cout << "========================" << endl
                     << "   PENDATAAN MAHASISWA  " << endl
                     << "========================" << endl;
                createMhs(pNew);
                insertFirst(head, pNew);
                break;
            
            case '2':
                cout << "========================" << endl
                     << "   PENDATAAN MAHASISWA  " << endl
                     << "========================" << endl;
                createMhs(pNew);
                insertLast(head, pNew);
                break;
            
            case '3':
                deleteFirst(head, pHapus);
                break;
            
            case '4':
                deleteLast(head, pHapus);
                break;
            
            case '5':
                deleteByKey(head, pHapus, key);
                break;

            case '6':
                rataRata(ratarata, head);
                break;
            
            case '7':
                nilaiMaksimal(maksimal,head);
                break;
            
            case '8':
                printMhs(head);
                break;

            default:
                cout << "\nPerintah tidak tersedia!\n";
                break;
        }

        cout << endl << "================================" << endl
                     << "1. Kembali ke awal" << endl 
                     << "2. Akhiri program" << endl << endl
                     << "Pilihan : "; cin >> end;
        cout         << "================================" << endl;

        if (end == '1')
        {
            program = true;
        }
        else if (end == '2')
        {
            program = false;
            cout << "\nProgram telah berakhir..." << endl << "Terima kasih..." << endl;
        }
        else 
        {
            program = false;
            cout << "\nPilihan tidak tersedia\n"
                 << "================================";
        }
    }

}