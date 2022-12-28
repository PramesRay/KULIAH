/*
Nama Program    : Praktikum10
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 17 November 2021
Deskripsi       : Latihan1
*/
/*
#include <iostream>
using namespace std;

int main()
{
    int num = 4;
    int* pnum = &num;

    cout << "Isi dari num                   : " << num << endl;
    cout << "Isi pointer num                : " << pnum << endl;
    cout << "Nilai yang ditunjuk pointer    : " << *pnum << "\n\n";
    
    num *= 5;
    
    cout << "Isi dari num                   : " << num << endl;
    cout << "Isi pointer num                : " << pnum << endl;
    cout << "Nilai yang ditunjuk pointer    : " << *pnum << "\n\n";

    *pnum ++;
    
    cout << "Isi dari num                   : " << num << endl;
    cout << "Isi pointer num                : " << pnum << endl;
    cout << "Nilai yang ditunjuk pointer    : " << *pnum << "\n\n";

    delete pnum;
}
*/
//===================================================================================================================================================================================================
/*
Nama Program    : Praktikum10
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 17 November 2021
Deskripsi       : Latihan2
*/

#include <iostream>
using namespace std;

void print(int a, int b)
{
    cout << a << ' ' << b << '\n';
}

int main()
{
    int num = 4;
    int &refnum = num;

    print(num, refnum);

    num--;

    print(num, refnum);

    refnum *= num;

    print(num, refnum);
}

//===================================================================================================================================================================================================
/*
Nama Program    : Praktikum10
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 17 November 2021
Deskripsi       : Latihan3
*/

#include <iostream>
using namespace std;

int main()
{
    int n = 1;
    int* p = &n;

    cout << n << endl;
    cout << &n << endl;
    cout << p << endl;
    cout << *p << endl;
    cout << &p << endl;
    cout << &(*p) << endl;
}

//===================================================================================================================================================================================================
/*
Nama Program    : Praktikum10
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 17 November 2021
Deskripsi       : Latihan4
*/

#include <iostream>
using namespace std;

struct koordinat
{
    int x;
    int y;
};

typedef koordinat* ptrkoordinat;

int main()
{
    ptrkoordinat p_pos0 = new koordinat;

    (*p_pos0).x = 8;
    cout << (*p_pos0).x << '\n';

    p_pos0->y = 6;
    cout << p_pos0->y << '\n';

    return 0;    
}