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