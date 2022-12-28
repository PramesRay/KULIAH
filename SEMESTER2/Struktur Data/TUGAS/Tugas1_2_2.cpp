/*  Nama Program    : Tugas1_2_2
    Nama            : Prames Ray Lapian
    NPM             : 140810210059
    Tanggal Buat    : 22 Feb 2022
    Deskripsi       : Menentukan hasil program dari source code yang sudah diberikan
    Lokasi File     : C:\Users\prame\Documents\PRAMES\PERKULIAHAN\SEMESTER 2\Struktur Data\TUGAS
**************************************************/
#include <iostream>
using namespace std;

void fungsi(int a, int &b, int &c)
{
    b = ++a;
    c += --b;
    a--;
    
    cout << "a = " << a << "\n"
         << "b = " << b << "\n"
         << "c = " << c << "\n\n";
}

int main()
{
    int a = 2, c = 2, b = 2, y = 2;
    
    cout << "\nFunction yang dipanggil: fungsi(c, a, b) " << "\n"
         << "Rumus pada function berubah menjadi: "     << "\n"
         << "a = ++c"                                   << "\n"
         << "b += --a"                                  << "\n"
         << "c--"                                       << "\n"
         << "Dan a akan mengeluarkan nilai c"           << "\n"
         << "    b akan mengeluarkan nilai a"           << "\n"
         << "    c akan mengeluarkan nilai b"           << "\n"
         << "HASIL"                                     << "\n";                             
    fungsi(c, a, b);
    
    cout << "===================================================" << "\n"
         << "Nilai variable saat ini setelah function dipanggil: " << "\n"
         << "a = " << a << "\n"
         << "b = " << b << "\n"
         << "c = " << c << "\n"
         << "y = " << y << "\n"
         << "===================================================" << "\n\n";
    
    cout << "Function yang dipanggil: fungsi(a + b, c, y) " << "\n"
         << "Rumus pada function berubah menjadi: "         << "\n"
         << "c = ++(a+b)"                                   << "\n"
         << "y += --c"                                      << "\n"
         << "(a+b)--"                                       << "\n"
         << "Dan a akan mengeluarkan nilai (a + b)"         << "\n"
         << "    b akan mengeluarkan nilai c"               << "\n"
         << "    c akan mengeluarkan nilai y"               << "\n"
         << "HASIL"                                         << "\n";
    fungsi(a + b, c, y);

    cout << "=========================================================" << "\n"
         << "Nilai variable saat ini setelah semua function dipanggil: " << "\n"
         << "a = " << a << "\n"
         << "b = " << b << "\n"
         << "c = " << c << "\n"
         << "y = " << y << "\n"
         << "=========================================================" << "\n\n";
}
