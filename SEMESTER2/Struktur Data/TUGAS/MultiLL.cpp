#include <iostream>
#include <iomanip>
#include <string.h>

using namespace std;

struct Alamat
{
    char almtPeg[50];
    Alamat *nextAlmt;
};
struct NIP
{
    char NIPPeg[20];
    Alamat *firstAlmt;
    NIP *nextNIP;
};
struct Pegawai
{
    char namaPeg[50];
    NIP *firstNIP;
    Pegawai *nextPeg;
};
typedef Alamat *pAlamat;
typedef NIP *pNIP;
typedef Pegawai *pPeg;
typedef pPeg List;


char menu()
{
    char opsi;
    cout << "======================================" << endl
         << "          MENU PROGRAM PEGAWAI        " << endl
         << "======================================" << endl
         << "1. Input Set Data Pegawai             " << endl
         << "2. Input Data Pegawai                 " << endl
         << "3. Input Data NIP                     " << endl
         << "4. Input Data Alamat                  " << endl
         << "5. Hapus Data Pegawai                 " << endl
         << "6. Hapus Data NIP                     " << endl
         << "7. Hapus Data Alamat                  " << endl
         << "8. Tampilkan Seluruh Data             " << endl
         << "0. Keluar Program                     " << endl
         << "======================================" << endl << endl
         << "opsi\t: "; cin >> opsi;
    return opsi;
}

void createList(List &first)
{
    first = NULL;
}

void createPegawai(pPeg &newPeg)
{
    newPeg = new Pegawai;
    cout << "Nama Pegawai : "; cin.getline(newPeg->namaPeg, 50);
    newPeg->firstNIP = NULL;
    newPeg->nextPeg = NULL;
}

void createNIP(pNIP &newNIP)
{
    newNIP = new NIP;
    cout << "NIP : "; cin.getline(newNIP->NIPPeg, 20);
    newNIP->firstAlmt = NULL;
    newNIP->nextNIP = NULL;
}

void createAlamat(pAlamat &newAlamat)
{
    newAlamat = new Alamat;
    cout << "Alamat : "; cin.getline(newAlamat->almtPeg, 50);
    newAlamat->nextAlmt = NULL;
}

void insertFirstPegawai(List &first, pPeg newPeg)
{
    if (first == NULL)
    {
        first = newPeg;
    }
    else
    {
        newPeg->nextPeg = first;
        first = newPeg;
    }
}

void deleteFirstPegawai(List &first, pPeg &pDelete)
{
    if (first == NULL)
    {
        pDelete = NULL;
        cout << "List Pegawai Kosong\n";
    }
    else if (first->nextPeg == NULL)
    {
        pDelete = first;
        first = NULL;
        cout << "Pegawai " << pDelete->namaPeg << " Berhasil Dihapus\n";
    }
    else
    {
        pDelete = first;
        first = first->nextPeg;
        pDelete->nextPeg = NULL;
        cout << "Pegawai " << pDelete->namaPeg << " Berhasil Dihapus\n";
    }
}

void linearSearchPegawai(List first, char key[], int &status, pPeg &pPegawai)
{
    status = 0;
    pPegawai = first;
    while (pPegawai != NULL && status == 0)
    {
        if (strcmp(pPegawai->namaPeg, key) == 0)
        {
            status = 1;
        }
        else
        {
            pPegawai = pPegawai->nextPeg;
        }
    }
}

void linearSearchNIP(pPeg pPegawai, char key[], int &status, pNIP &pNIP)
{
    status = 0;
    pNIP = pPegawai->firstNIP;
    while (pNIP != NULL && status == 0)
    {
        if (strcmp(pNIP->NIPPeg, key) == 0)
        {
            status = 1;
        }
        else
        {
            pNIP = pNIP->nextNIP;
        }
    }
}

void insertFirstNIP(pPeg pPegawai, pNIP newNIP)
{
    if (pPegawai->firstNIP == NULL)
    {
        pPegawai->firstNIP = newNIP;
    }
    else
    {
        newNIP->nextNIP = pPegawai->firstNIP;
        pPegawai->firstNIP = newNIP;
    }
}

void deleteFirstNIP(pPeg pPegawai, pNIP &pDelete)
{
    if (pPegawai->firstNIP == NULL)
    {
        pDelete = NULL;
        cout << "List NIP Kosong\n";
    }
    else if (pPegawai->firstNIP->nextNIP == NULL)
    {
        pDelete = pPegawai->firstNIP;
        pPegawai->firstNIP = NULL;
        cout << "NIP " << pDelete->NIPPeg << " Berhasil Dihapus\n";
    }
    else
    {
        pDelete = pPegawai->firstNIP;
        pPegawai->firstNIP = pPegawai->firstNIP->nextNIP;
        pDelete->nextNIP = NULL;
        cout << "NIP " << pDelete->NIPPeg << " Berhasil Dihapus\n";
    }
}

void insertFirstAlmt(pNIP pNIP, pAlamat newAlamat)
{
    if (pNIP->firstAlmt == NULL)
    {
        pNIP->firstAlmt = newAlamat;
    }
    else
    {
        newAlamat->nextAlmt = pNIP->firstAlmt;
        pNIP->firstAlmt = newAlamat;
    }
}

void deleteFirstAlmt(pNIP pNIP, pAlamat &pDelete)
{
    if (pNIP->firstAlmt == NULL)
    {
        pDelete = NULL;
        cout << "List Alamat Kosong\n";
    }
    else if (pNIP->firstAlmt->nextAlmt == NULL)
    {
        pDelete = pNIP->firstAlmt;
        pNIP->firstAlmt = NULL;
        cout << "Alamat " << pDelete->almtPeg << " Berhasil Dihapus\n";
    }
    else
    {
        pDelete = pNIP->firstAlmt;
        pNIP->firstAlmt = pNIP->firstAlmt->nextAlmt;
        pDelete->nextAlmt = NULL;
        cout << "Alamat " << pDelete->almtPeg << " Berhasil Dihapus\n";
    }
}

void traversalPegawai(List first)
{
    pPeg pPegawai = first;
    int no = 1;
    if (first == NULL)
    {
        cout << "List Pegawai kosong" << endl;
    }
    else
    {
        cout << "===============================================================================================\n";
        cout << setw(5) << "No" << setw(30) << "Nama Pegawai" << setw(30) << "NIP" << setw(30) << "Alamat" << endl;
        do
        {
            pNIP pNIP = pPegawai->firstNIP;
            cout << setw(5) << no;
            cout << setw(30) << pPegawai->namaPeg;
            if (pNIP == NULL)
            {
                cout << setw(30) << "NIP kosong";
            }
            else
            {
                cout << setw(30) << pNIP->NIPPeg;
                pAlamat pAlamat = pNIP->firstAlmt;
                if (pAlamat != NULL)
                {
                    cout << setw(30) << pAlamat->almtPeg ;
                    pAlamat = pAlamat->nextAlmt;
                    while (pAlamat != NULL)
                    {
                        cout << endl;
                        cout << setw(95) << pAlamat->almtPeg;
                        pAlamat = pAlamat->nextAlmt;
                    }
                }
                else
                {
                    cout << setw(30) << "Alamat kosong";
                }
                cout << endl;
                pNIP = pNIP->nextNIP;
                while (pNIP != NULL)
                {
                    pAlamat = pNIP->firstAlmt;
                    cout << setw(65) << pNIP->NIPPeg;
                    if (pAlamat == NULL)
                    {
                        cout << setw(30) << "Alamat kosong" << endl;
                    }
                    else
                    {
                        cout << setw(30) << pAlamat->almtPeg;
                        pAlamat = pAlamat->nextAlmt;
                        while (pAlamat != NULL)
                        {
                            cout << endl;
                            cout << setw(95) << pAlamat->almtPeg;
                            pAlamat = pAlamat->nextAlmt;
                        }
                    }
                    pNIP = pNIP->nextNIP;
                }
            }
            cout << endl;
            no++;
            pPegawai = pPegawai->nextPeg;
        }while (pPegawai != NULL);
        cout << "===============================================================================================\n";
    }

}

int main()
{
    List listPegawai;
    pPeg pNewPegawai, pDeletePegawai, pPegawai;
    pNIP pNewNIP, pDeleteNIP, pNIP;
    pAlamat pNewAlamat, pDeleteAlamat;
    bool program = true;
    char opsi, key[50];
    int status;

    createList(listPegawai);

    while (program)
    {
        system("cls");
        opsi = menu();
        cin.ignore();
        
        switch (opsi)
        {
            case '1' :
                createPegawai(pNewPegawai);
                insertFirstPegawai(listPegawai, pNewPegawai);
                    createNIP(pNewNIP);
                    insertFirstNIP(pNewPegawai, pNewNIP);
                        createAlamat(pNewAlamat);
                        insertFirstAlmt(pNewNIP, pNewAlamat);
                
                cout << "Data berhasil ditambahkan" << endl;

                system("pause");
                break;
            
            case '2':
                createPegawai(pNewPegawai);
                insertFirstPegawai(listPegawai, pNewPegawai);
                
                cout << "Pegawai berhasil ditambahkan" << endl;
                
                system("pause");
                break;
                
            case '3':
                //cari Pegawai
                cout << "Masukkan nama Pegawai : "; cin.getline(key, 50);
                
                linearSearchPegawai(listPegawai, key, status, pPegawai);
                if (status == 1)
                {
                    //tambahkan NIP
                    createNIP(pNewNIP);
                    insertFirstNIP(pPegawai, pNewNIP);
                    cout << "NIP berhasil ditambahkan" << endl;
                }
                else
                {
                    cout << "Pegawai tidak ditemukan" << endl;
                }
                
                system("pause");
                break;
                
            case '4':
                //cari Pegawai
                cout << "Masukkan nama Pegawai : "; cin.getline(key, 50);
                
                linearSearchPegawai(listPegawai, key, status, pPegawai);
                if (status == 1)
                {
                    //cari NIP
                    cout << "Masukkan NIP : "; cin.getline(key, 20);
                    
                    linearSearchNIP(pPegawai, key, status, pNIP);
                    if (status == 1)
                    {
                        //tambah Alamat
                        createAlamat(pNewAlamat);
                        insertFirstAlmt(pNIP, pNewAlamat);
                        
                        cout << "Alamat berhasil ditambahkan" << endl;
                    }
                    else
                    {
                        cout << "NIP tidak ditemukan" << endl;
                    }
                }
                else
                {
                    cout << "Pegawai tidak ditemukan" << endl;
                }
                system("pause");
                break;
                
            case '5':
                //hapus Pegawai
                deleteFirstPegawai(listPegawai, pDeletePegawai);
                
                system("pause");
                break;
                
            case '6':
                //hapus NIP
                cout << "Masukkan nama Pegawai : "; cin.getline(key, 50);
                
                linearSearchPegawai(listPegawai, key, status, pPegawai);
                if (status == 1)
                {
                    deleteFirstNIP(pPegawai, pDeleteNIP);
                }
                else
                {
                    cout << "Pegawai tidak ditemukan" << endl;
               
                system("pause");
                break;
                
            case '7':
                //hapus Alamat
                cout << "Masukkan nama Pegawai : "; cin.getline(key, 50);
                
                linearSearchPegawai(listPegawai, key, status, pPegawai);
                if (status == 1)
                {
                    cout << "Masukkan NIP : "; cin.getline(key, 20);
                    
                    linearSearchNIP(pPegawai, key, status, pDeleteNIP);
                    if (status == 1)
                    {
                        deleteFirstAlmt(pDeleteNIP, pDeleteAlamat);
                    }
                    else
                    {
                        cout << "NIP tidak ditemukan" << endl;
                    }
                }
                else
                {
                    cout << "Pegawai tidak ditemukan" << endl;
                }
                system("pause");
                break;
                
            case '8':
                //traversal
                system("cls");
                
                traversalPegawai(listPegawai);
                
                system("pause");
                break;
                
            case '0':
                program = false;
                break;
                
            default :
                cout << "opsi tidak ada" << endl;
                system("pause");
                break;
                
        }
        cout << "Program Selesai Terima Kasih!\n";
    }
}