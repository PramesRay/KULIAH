#include <iostream>
using namespace std;

struct ElemenQueue 
{
    char info;
    int prior;
    ElemenQueue* next;
    ElemenQueue* prev;

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
    cout << "input Priority : "; cin >> pBaru->prior;
    pBaru->info = pBaru->info;
    pBaru->prior = pBaru->prior;
    pBaru->next = NULL;
}

void enqueue(Queue& Q, pointer pBaru) 
{
    if (Q.Head==NULL && Q.Tail==NULL) 
    {
        Q.Head = pBaru;
        Q.Tail = pBaru;
        return;
    }

    pointer temp = Q.Head;
    pointer tempPrev = NULL;

    while (temp->next != NULL && pBaru->prior >= temp->prior) 
    {
        tempPrev = temp;
        temp = temp->next;
    }

    if (temp == Q.Head && pBaru->prior < temp->prior) 
    {
        pBaru->next = Q.Head;
        Q.Head = pBaru;
    }
    else if (temp == Q.Tail && pBaru->prior > temp->prior)
    {
        Q.Tail->next = pBaru;
        Q.Tail = pBaru;
    }
    else 
    {
        tempPrev->next = pBaru;
        pBaru->next = temp;
    }
}

char menu() 
{
    int opsi;
    cout << "=======================================" << endl
         << "          MENU PROGRAM QUEUE           " << endl
         << "=======================================" << endl
         << "1. Insert Queue                        " << endl
         << "2. Print Queue                         " << endl << endl
         << "Pilihan\t: "; cin >> opsi; cin.ignore();
    
    return opsi;
}

void traversal(Queue Q) 
{
    pointer temp = Q.Head;
    do
    {
        cout << temp->info << ", " << temp->prior << '\n';
        temp = temp->next;
    }
    while (temp != NULL);
}


int main()
{
    Queue Q;
    pointer pBaru;
    int opsi;
    int found = 0;
    bool program = true;

    while (program) 
    {
        int pil = menu();
        

        switch (pil) 
        {
            case 1:
                createQueue(Q);
                createElement(pBaru);
                enqueue(Q, pBaru);
                traversal(Q);
                break;
            
            case 2:
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