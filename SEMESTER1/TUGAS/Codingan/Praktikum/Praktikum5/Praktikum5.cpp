/*
Nimi Program    : Praktikum5
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 29 September 2021
Deskripsi       : Latihan1 (For Looping)
*/
/*
#include <iostream>
using namespace std;

int main ()
{
    int sisa_ayam = 10;

    for (int i = 10; i > 1; i--)
    {
        sisa_ayam--;
        cout << "Anak ayam turun " << i << ", mati 1 tinggal " << sisa_ayam << endl; 

        if ( sisa_ayam == 1)
        {
            cout << "Anak ayam turunlah 1, mati 1 tinggal induknya";
        }
    }
}
*/
/*
Nama Program    : Praktikum5
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 29 September 2021
Deskripsi       : Latihan2 (While Looping)
*/
/*
#include <iostream>
using namespace std;

int main (int argc, char const *argv[])
{
    int stop_pada = 20;
    int counter = 0;

    while (counter <= stop_pada)
    {
        if (counter < stop_pada)
        {
            cout << "Masih angka ke " << counter << ", belum waktunya untuk berhenti." << endl;
        }
        else 
        {
            cout << "Sudah angka ke " << counter << ". " << endl;
        }
    counter++;
    } 
}
*/

/*
Nama Program    : Praktikum5
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 29 September 2021
Deskripsi       : Latihan3 (Do-While Looping)
*/
/*
#include <iostream>
using namespace std;

int main (int argc, char const *argv[])
{
    char pilihan;

    do 
    {
        cout << "Selamat datang pada permainan\n";
        cout << "\n=== ceritanya sudah selesai bermain ===\n";
        cout << "Ketik Y untuk bermain kembali";
        cin >> pilihan;
    }
    while (pilihan == 'y' || pilihan == 'y');

    cout << "terimakasih sudah bermain";
}
*/

/*
Nama Program    : Praktikum5
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 29 September 2021
Deskripsi       : Latihan4 (Break & Continue) 
*/
/*
#include <iostream>
using namespace std;

int main (int argc, char const *argv[])
{
    int i, j = 1;

    cout << "Ini pakai continue\n";
    while (i <= 5)
    {
        if (i == 3)
        {
            i++;
            continue;
        }
        cout << i << endl;
        i++;
    }
    cout << "Ini pakai break\n";
    while (j <= 5)
    {
        if (j == 3)
        {
            j++;
            break;
        }
        cout << j << endl;
        j++;
    }
    return 0;
}
*/

/*
Nama Program    : Praktikum5
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
    int kasus, n;
    cout << "=== PROGRAM SEGITIGA BINTANG ===\n\n"
         << "        Pilihan Segitiga\n"
         << "1. Segitiga siku-siku kanan atas\n"
         << "2. Segitiga siku-siku kiri bawah\n"
         << "3. Letter X \n\n"
         << "Silahkan pilih segitiga dengan menginput nomor pilihan! ";
    cin >> kasus;

    switch (kasus)
    {
        case 1:
        cout << "Masukkan lebar: ";
        cin >> n;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                cout << "  ";
            }

            for (int k = i; k <= n; k++)
            {
                cout << "* ";
            }
            cout << endl;
        }
        break;

        case 2:
        cout << "Masukkan lebar: ";
        cin >> n;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                cout << "* ";
            }
            cout << endl;
        }
        break;

        case 3:
        cout << "Masukkan tinggi (genap): ";
        cin >> n;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j < n; j++)
            {
                if (i == j || (i + j == n))
                {
                    cout << "(" << i << ", " << j << ")";
                }
                else 
                {
                    cout << "  ";
                }
            }
            cout << endl;
        }
    }
    
}
*/

/*
Nama Program    : Praktikum5
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 29 September 2021
Deskripsi       : Tugas2
*/
/*
#include <iostream>
using namespace std;

int main()
{
    int i, x, n;
    i = 0;
    cout << "Masukkan angka yang ingin di Sigma dan di Faktorialkan: ";
    cin >> n;

    for (x = 1; x <= n; x++)
    {
        i = i + x;
    }
    cout << "Nilai sigma: " << i << endl;

    x = n;

    for(int i = 1; n > i;)
    {
        n = n - 1;
        x = x * n;
    }
    cout << "Nilai Faktorial: " << x << endl;
    return 0;
}
*/

/*
Nama Program    : Praktikum5
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 29 September 2021
Deskripsi       : Tugas3
*/
/*
#include <iostream>
using namespace std;

int main()
{
	int s, n, bil;
    cout << "=== PROGRAM BILANGAN PRIMA ===\n"
         << "Input angka mulai: ";
    cin >> s;
	cout << "Input angka maksimal: ";
	cin >> n;

	for (int i = s; i <= n; i++)
    {
		bil = 0;
		for (int j = 1; j <= i; j++)
        {
			if (i % j == 0)
            {
				bil = bil + 1;
			}
		}
		if (bil == 2)
		cout << i <<" ";
	}
}
*/
/*
#include <iostream>
using namespace std;

int main()
{
    string kata;
    int n, i;
    bool palindrome = true;
 
    cout << "=== PALINDROME CHECKER ===" << endl;
    cout << "Silahkan Input Suatu Kata : ";
    getline (cin, kata);
    n = kata.length();

    for (i = 0; i < n; i++)
    {
        if (kata [i] != kata [n-i-1])
        {
            palindrome = false;
            break;
        }
    }

    if (palindrome == true)
    {
        cout << "YA\n\n";
    }
    else
    {
        cout << "BUKAN\n\n";
    }
}
*/

#include <iostream>
using namespace std;
 
int main()
{
  cout << "=== PROGRAM BELAH KETUPAT ===" << endl;
 
  int n, i, j, k, l = 1;
 
  cout << "Input lebar belah ketupat: ";
  cin >> n;
  cout << endl;
 
    if (n % 2 == 0)
    {
        for (i = 0; i < n/2; i++)
        {
            for (j = n/2; j > i; j--)
            {
                cout << " ";
            }
            for (k = 1; k <= l; k++)
            {
                cout << "*";
            }
            l += 2;
            cout << endl;
        }
        l -= 2;
        for (i = 0; i < n/2; i++)
        {
            for (j = 0; j <= i; j++)
            {
                cout << " ";
            }
            for (j = l; j > 0; j--)
            {
                cout << "*";
            }
            l-=2;
            cout << endl;
        }
    } 
    else
    {        
        for (i = 0; i < n/2; i++)
        {
            for(j = n/2; j >= i; j--)
            {
                cout << " ";
            }
                for (k = 1; k <= l; k++)
                {
                  cout << "*";
                }
            l += 2;
            cout << endl;
        }
        for (i = 0; i < n - n/2; i++)
        {
            for (j = 0; j <= i; j++)
            {
                cout << " ";
            }
            for (j = l; j > 0; j--)
            {
              cout << "*";
            }
            l -= 2;
            cout << endl;
        }
    }
}

/*
#include <iostream>
using namespace std;

int main() 
{
	int n;
	
	cout << "banyak baris : ";
	cin >> n;

	int i = 0;
	while (i < n) 
    {
		int j = 1;
		while (j <= n) 
        {
			cout << j << " ";
			j++;
		}
		
		cout << endl;
		n--;
	}
}
*/

