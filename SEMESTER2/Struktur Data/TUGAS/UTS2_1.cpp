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
        S.TOP += 1;
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
        S.TOP -= 1;
    }
}

void traversal(Stack& S)
{
    int idxBantu = S.TOP; 

    while (idxBantu >= 0) 
    {
        cout << "__" << endl
             << S.isi[idxBantu] << endl;
        idxBantu -= 1;
    }
    
}

void swap(Stack& S, int idx)
{
    char temp;
    temp = S.isi[idx];
    S.isi[idx] = S.isi[idx + 1];
    S.isi[idx + 1] = temp;
}

main()
{
    Stack myTumpukan;
    char hasil, temp;
    
    cout << "PROGRAM SWAP MENGGUNAKAN STACK ARRAY" << endl;

    createStack(myTumpukan);
    
    push(myTumpukan,'A');
    push(myTumpukan,'B');

    cout << "\nSebelum SWAP:" << endl;
    traversal(myTumpukan); 

    cout << "\nSetelah SWAP:" << endl;
    swap(myTumpukan, 0);
    traversal(myTumpukan);
}