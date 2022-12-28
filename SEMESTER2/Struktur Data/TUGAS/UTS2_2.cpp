#include <iostream>
using namespace std;

struct ElemenQueue 
{
    char info;
    ElemenQueue* next;
};

typedef ElemenQueue* pointer;
typedef pointer List;

struct Queue 
{
    List Head;
    List Tail;
};

Queue Q;

void createQueue(Queue& Q) 
{
    Q.Head = NULL;
    Q.Tail = NULL;
}

void createElement(pointer &pBaru) 
{
    pBaru = new ElemenQueue;
    cout << "input Data     : "; cin >> pBaru->info;
    pBaru->info = pBaru->info;
    pBaru->next = NULL;
}

void insertQueue(Queue& Q, pointer pBaru)
{
    if (Q.Head==NULL && Q.Tail==NULL) 
    {
        Q.Head = pBaru;
        Q.Tail = pBaru;
    }
    else 
    {
        pointer temp = Q.Head;
        Q.Head = pBaru;
        Q.Head->next = temp;
    }
}

void deleteQueue(Queue& Q, pointer& pHapus)
{
    cout << "Delete Queue" << endl;
    if (Q.Head == NULL && Q.Tail == NULL) 
    { 
        pHapus = NULL;
        cout << "Antrian kosong "<< endl;
    }
    else if (Q.Head == Q.Tail) 
    { 
        pHapus = Q.Head;
        Q.Head = NULL;
        Q.Tail = NULL;
    }   
    else 
    {
        pointer preTail = Q.Head;
        while (preTail->next != Q.Tail)
        {
            preTail = preTail->next;
        }
        
        Q.Tail = preTail;
        pHapus = Q.Tail;
        pHapus->next = NULL;
    }
}

void traversal(Queue Q) 
{
    if (Q.Head == NULL) 
    {
        cout << "\nAntrian kosong!" << endl;
    }
    else 
    {
        pointer pBantu = Q.Head;
        cout << endl;

        do 
        {
            cout << pBantu->info << "|\t";
            pBantu = pBantu -> next;
        }
        while (pBantu != NULL);
    }
}

char menu() 
{
    int opsi;
    cout << "=======================================" << endl
         << "          MENU PROGRAM QUEUE           " << endl
         << "=======================================" << endl
         << "1. Insert Queue                        " << endl
         << "2. Delete Queue                        " << endl
         << "3. Print Queue                         " << endl << endl
         << "Pilihan\t: "; cin >> opsi; cin.ignore();
    
    return opsi;
}

int main()
{
    Queue Q;
    pointer pBaru, pHapus;
    int opsi;
    int found = 0;
    bool program = true;
    createQueue(Q);

    while (program) 
    {
        int pil = menu();
        

        switch (pil) 
        {
            case 1:
                
                createElement(pBaru);
                insertQueue(Q, pBaru);
                traversal(Q);
                break;
            
            case 2:
                deleteQueue(Q, pHapus);
                traversal(Q);
                break;
            
            case 3:
                traversal(Q);
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