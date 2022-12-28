#include <iostream>
using namespace std;

int main()
{
    int a, b ,c;

    cout << "Masukan angka pertama  : ";
    cin >> a;

    cout << "Masukan angka kedua    : ";
    cin >> b;

    cout << "Masukan angka ketiga   : ";
    cin >> c;
    
    cout << "__________________________\n";
    cout << "\n";

    if (a > b && a > c)
    {
    cout << "Bilangan terbesar adalah " << a << "\n";
    } 
        else if (b > c)
    {
        cout << "Bilangan terbesar adalah " << b << "\n";
    } 
            else 
    {
            cout << "Bilangan terbesar adalah " << c << "\n";
    }
    if (c < b && c < a)
    {
    cout << "Bilangan terkecil adalah " << c << "\n";
    } 
        else if (b < a)
    {
        cout << "Bilangan terkecil adalah " << b << "\n";
    } 
            else 
    {
            cout << "Bilangan terkecil adalah " << a << "\n";
    }
}
