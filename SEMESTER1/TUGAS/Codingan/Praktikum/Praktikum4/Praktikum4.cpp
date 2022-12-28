/*
Nama Program    : Increment_Decrement
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 29 September 2021
Deskripsi       : Latihan1
*/
/*
#include <iostream>
using namespace std;

int main()
{
    int a, b, c;
    a = 20;
    b = ++a;
    c = a + b--;

    cout << a << endl;
    cout << b << endl;
    cout << c << endl;
}
*/
/*
Nama Program    : Switch_Case
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 29 September 2021
Deskripsi       : Tugas1
*/
/*
#include <iostream>
using namespace std;

int main()
{
    int menu;
    cout << "========= MENU MAKANAN =========\n"
            "1. Nasi Goreng\n"
            "2. Mie Goreng\n"
            "3. Kwetiau Goreng\n"
            "4. Kerupuk Goreng\n"

            "Pilih menu : ";
    cin >> menu;

    switch (menu)
    {
        int jumlah;
    case 1:
        cout << "Mau pesan berapa porsi? ";
        cin >> jumlah ;
        cout << "Anda memesan Nasi Goreng sebanyak " << jumlah << " porsi";
        break;
    case 2:
        cout << "Mau pesan berapa porsi? ";
        cin >> jumlah ;
        cout << "Anda memesan Mie Goreng sebanyak " << jumlah << " porsi";
        break;
    case 3:
        cout << "Mau pesan berapa porsi? ";
        cin >> jumlah ;
        cout << "Anda memesan Kwetiau Goreng sebanyak " << jumlah << " porsi";
        break;
    case 4:
        cout << "Mau pesan berapa porsi? ";
        cin >> jumlah ;
        cout << "Anda memesan Kerupuk Goreng sebanyak " << jumlah << " porsi";
        break;
    default:
        cout << "Mohon maaf, pesanan anda tidak terdapat di dalam menu kami";
        break;
    }
}
/*
Nama Program    : Increment_Decrement
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 29 September 2021
Deskripsi       : Tugas2
*/

#include <iostream>
using namespace std;

int main()
{
    int a, b, c;
    a = 100;                // a = 100

    b = 30;                 // b = 30

    b = ++a;                // b = a
                            // a = a + 1 = 100 + 1 = 101
                            // a = 101
                            // b = 101

    b++;                    // b = 101 + 1 = 102
    c = (a--) + (b++);      // a-- = 101 - 1 = 100
                            // b++ = 102 + 1 = 103
                            // c = 100 + 103 = 203
    cout << a << endl;
    cout << b << endl;
    cout << c << endl;
}