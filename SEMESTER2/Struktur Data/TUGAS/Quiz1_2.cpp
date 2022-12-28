/*  Nama Program    : Quiz1_2
    Nama            : Prames Ray Lapian
    NPM             : 140810210059
    Tanggal Buat    : 14 Mar 2022
    Deskripsi       : Membuat list baru dan mencari 4 cara meng-outputkan suatu pointer
    Lokasi File     : C:\Users\prame\Documents\PRAMES\PERKULIAHAN\SEMESTER 2\Struktur Data\TUGAS
**************************************************/
#include <iostream>
using namespace std;

struct ElmtList 
{
    char info; 
    ElmtList* next; 
};

typedef ElmtList* pointerToElmtList; 
typedef pointerToElmtList List;

main()
{ 
    pointerToElmtList p1, p2, p3, p4;
    List First;
    cout <<"Input : "<< endl;
    
    p1 = new ElmtList;
    cout << "info p1 = "; cin >> p1 -> info;
    p1 -> next = NULL;
    
    p2 = new ElmtList;
    cout << "info p2 = "; cin >> p2 -> info; 
    p2 -> next = NULL;
    
    p3 = new ElmtList;
    cout << "info p3 = "; cin >> p3 -> info;
    p3 -> next = NULL;

    p4 = new ElmtList;
    cout << "info p4 = "; cin >> p4 -> info;
    p4 -> next = NULL;

    p1 -> next = p2; 
    p2 -> next = p3; 
    p3 -> next = p4;
    First = p1;
    
    cout << "Output : " << endl;
    cout << "info p1 : " << p1 -> info << endl;
    cout << "info p2 : " << p2 -> info << endl;
    cout << "info p3 : " << p3 -> info << endl;
    cout << "info p4 #1: " << p4 -> info << endl; 
    cout << "info p4 #2: " << p3 -> next -> info << endl; 
    cout << "info p4 #3: " << p2 -> next -> next -> info << endl; 
    cout << "info p4 #4: " << p1 -> next -> next -> next -> info << endl; 
}