/*
Nama Program    : persamaankuadrat
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 20 September 2021
Deskripsi       : Membuat program pencari akar akar persamaan kuadrat
*/

#include <iostream>
#include <math.h>

using namespace std;

int main()
{
    float a,b,c,determinan,x1,x2;

    cout << "Mencari x1 dan x2 dari persamaan kuadrat: ax^2 + bx + c \n\n";

    menu :
    cout << "Masukkan nilai a : "; cin >> a;
    cout << "Masukkan nilai b : "; cin >> b;
    cout << "Masukkan nilai c : "; cin >> c;

    if (a == 0)
    {
        cout << "a gaboleh 0. sok input ulang!\n";
        goto menu;
    }

    determinan = (b*b)-(4*a*c);

    x1 = (-b+sqrt(determinan))/(2*a);
    
    if (determinan > 0)
    {
        x2=(-b-sqrt(determinan))/(2*a);
    }

    else if (determinan == 0)
    {
        x2=x1;
    }

    else if (determinan < 1)
    {
        cout << "imajiner \n";
        exit(0);
    }

    cout << "x1 = " << x1 << "\n";
    cout << "x2 = " << x2 << "\n";

}