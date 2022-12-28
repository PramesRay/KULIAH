#include <iostream>
#include <string.h>
#include <iomanip>
using namespace std;

struct Pegawai 
{
    char Nama[30];
};

struct Node 
{
    Pegawai info;
    Node* next;
    Node* prev;
};

typedef Node *pointer;
typedef pointer List;

void createElement(pointer& pBaru) 
{
    pBaru = new Node;
    
    cout << "\nData pegawai yang ingin ditambahkan:" << endl;
    cout << "Nama   : "; cin.get(pBaru->info.Nama,30); cin.ignore();

    
    pBaru->next = NULL;
}

void insertFirst(List& first, pointer pBaru) 
{
    if (first == NULL) 
    { 
        first = pBaru;
    } 
    else 
    { 
        pointer pBantu = first;
    
        while (pBantu->next != NULL) 
        {
            pBantu = pBantu->next;
        }
        
        pBantu->next = pBaru;
        pBaru->prev = pBantu;
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
        cout << setw(30) << "NAMA" << endl;
    
        do 
        {
            cout << setw(30) << pBantu->info.Nama << endl;
            
            pBantu = pBantu->next;
        }
        while (pBantu != NULL);
    }
}

void sambungList(List& first1, List& first2)
{
    if (first1 == NULL) 
    { 
        first1 = first2;
    } 
    else if (first2 == NULL) 
    { 
        first2 = first1;
    } 
    else 
    { 
        pointer pBantu1 = first1;
        pointer pBantu2 = first2;
    
        while (pBantu1->next != NULL) 
        {
            pBantu1 = pBantu1->next;
        }

        pBantu1->next = first2;
        pBantu2->prev = pBantu1;

    }
}

int main()
{
    List first1 = NULL, first2 = NULL;
    pointer pBaru;

    createElement(pBaru);
        insertFirst(first1, pBaru);
    createElement(pBaru);
        insertFirst(first1, pBaru);
    createElement(pBaru);
        insertFirst(first1, pBaru);
    
    createElement(pBaru);
        insertFirst(first2, pBaru);
    createElement(pBaru);
        insertFirst(first2, pBaru);
    createElement(pBaru);
        insertFirst(first2, pBaru);
    
    sambungList(first1, first2);

    cout << "List First 1:" << endl;
    traversal(first1);
    cout << "List First 2:" << endl;
    traversal(first2);
}