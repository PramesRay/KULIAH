/*
Nama Program    : Praktikum6
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 13 Oktober 2021
Deskripsi       : Latihan1
*/

#include <iostream>
using namespace std;

void swap (int& x, int& y)
{
    int temp;
    temp = x;
    x = y;
    y = temp;
}

int main ()
{
    int x, y;
    cout << "x = ";
    cin >> x;
    cout << "y = ";
    cin >> y;

    swap (x, y);

    cout << "\n SWAP \n" << endl
         << "x = " << x << endl
         << "y = " << y << endl;
}


/*
Nama Program    : Praktikum6
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 13 Oktober 2021
Deskripsi       : Latihan2
*/
/*
#include <iostream>
using namespace std;

void fungsi (int a, int b, int c)
{
    b = ++a;
    c += b;
    a = b + c;
    
    cout << a << ", " << b << ", " << c;
}

int main()
{
    int a, b, c, y;
    a = b = c = y = 2;

    fungsi(c, a, b);
    system("pause");
    cout << a << b << c << y;

    system("pause");

    fungsi(a + b, c, y);
    system("pause");
    cout << a << b << c << y;
    
}
*/