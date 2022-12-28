/*  Nama Program    : Tugas8_1
    Nama            : Prames Ray Lapian
    NPM             : 140810210059
    Tanggal Buat    : 24 April 2022
    Deskripsi       : Membuat program untuk mengolah data pegawai dengan menggunakan operasi PUSH dan POP suatu Tumpukan (Array).
    Lokasi File     : C:\Users\prame\Documents\PRAMES\PERKULIAHAN\SEMESTER 2\Struktur Data\TUGAS
**************************************************/

#include <iostream>
using namespace std;

const int maxElemen = 255;

struct Stack 
{
    char isi[maxElemen];
    int TOP;
};

Stack S;

void createStack (Stack& S)
{
    S.TOP = -1;
}

void push (Stack& S, char elemenBaru) 
{
    if (S.TOP == maxElemen-1)
    {
        cout <<"Stack Overflow" << endl;
    }
    else
    {
        S.TOP = S.TOP + 1;
        S.isi[S.TOP] = elemenBaru;
    }
}

void pop(Stack& S, char& elemenHsl)
{
    if (S.TOP < 0) 
    {
        cout << "Stack Underflow " << endl;
    }
    else 
    {
        elemenHsl= S.isi[S.TOP];
        S.TOP=S.TOP - 1;
    }
}

void traversal(Stack& S)
{
    int idxBantu = S.TOP; 

    while (idxBantu >= 0) 
    {
        cout << S.isi[idxBantu] << " " ;
        idxBantu = idxBantu-1;
    }
    
    cout << endl;
}

main()
{
    Stack myTumpukan;
    char hasil;
    
    cout<<"Program STACK menggunakan array"<<endl;
    
    createStack(myTumpukan);
    push(myTumpukan,'A');
    push(myTumpukan,'B');
    push(myTumpukan,'C');
    traversal(myTumpukan); 
    pop(myTumpukan,hasil);
    
    cout<<"Setelah pop : " << hasil<<endl; 
    
    traversal(myTumpukan); // B A
    pop(myTumpukan,hasil);
    
    cout<<"Setelah pop : " << hasil<<endl; // B
    
    traversal(myTumpukan); // A
    pop(myTumpukan,hasil);
    
    cout<<"Setelah pop : " << hasil<<endl; // A
    
    traversal(myTumpukan); // Stack Kosong
}
