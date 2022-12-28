#include <iostream>
using namespace std;

const int maxElemen = 255;

struct Stack 
{
    int isi[maxElemen];
    int TOP;
};

Stack S;

void createStack (Stack& S)
{
    S.TOP = -1;
}

void push (Stack& S, int elemenBaru) 
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

void pop(Stack& S, int& elemenHsl)
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

void swap(int& a, int& b){
    int temp = a;
    a = b;
    b = temp;
}

void BubbleSort(Stack& S)
{
    for(int i=0; i<S.TOP-1; i++)
    {
        for(int j=0; j<S.TOP-i-1; j++)
        {
            if(S.isi[j]<S.isi[j+1])
            {
                swap(S.isi[j], S.isi[j+1]);
            }
        }
    }
}

main()
{
    Stack myTumpukan;
    int temp;
    
    cout << "PROGRAM STACK ARRAY" << endl;

    createStack(myTumpukan);
    
    push(myTumpukan, 6);
    push(myTumpukan, 9);
    push(myTumpukan, 8);
    push(myTumpukan, 10);
    push(myTumpukan, 1);

    cout << "\nSebelum Sort:" << endl;
    traversal(myTumpukan); 

    cout << "\nSetelah Sort:" << endl;
    BubbleSort(myTumpukan);
    traversal(myTumpukan);
}

