#include <iostream>
using namespace std;

const int maxElement = 300;
struct Stack
{
    int member[maxElement];
    int top;
};
Stack Stok;

void createStack(Stack &Stok)
{
    Stok.top = -1;
}

char peek(Stack Stok)
{
    return Stok.member[Stok.top];
}

bool isEmpty(Stack Stok)
{
    if (Stok.top < 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}

void push(Stack &Stok, int data)
{
    if (isEmpty(Stok))
    {
        cout << "Stock Full!\n";
    }
    else
    {
        Stok.top += 1;
        Stok.member[Stok.top] = data;
    }
}

void pop(Stack &Stok, int &pDelete)
{
    if (isEmpty(Stok))
    {
        cout << "Stock Kosong!\n";
    }
    else
    {
        pDelete = peek(Stok);
        Stok.top -= 1;
    }
}

int main()
{
    int stok, opsi, n;

    do
    {
        cout << "----- Inventory Kopi ----- \n";
        cout << "Stok barang = " << stok << " Buah\n";
        cout << "1. Tambah Stok Barang\n";
        cout << "2. Kurang Stok Barang\n";
        cout << "3. Undo\n";
        cout << "Pilihan :\n";
        cin >> opsi;

        switch (opsi)
        {
        case 1:
            cout << "Tambahkan Berapa?\n";
            cin >> n;
            stok = stok + n;
            push(Stok, stok);
            break;
        case 2:
            cout << "Kurangkan Berapa?\n";
            cin >> n;
            stok = stok - n;
            push(Stok, stok);
            break;
        case 3:
            pop(Stok, stok);
            if ((stok == stok) && (stok > 0))
            {
                pop(Stok, stok);
            }
            break;
        default:
            break;
        }
    } while (opsi >= 1 && opsi <= 3);
}