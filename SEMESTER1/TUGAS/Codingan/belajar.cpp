#include <iostream>
using namespace std;
//=================================================================================================================================================================
/*
int main()
{
    int n;
    do
    {
        cout << "Masukkan Angka yang ingin anda cek! ";
        cin >> n;

        if (n % 2 == 0)
        {
            cout << n << " Merupakan bilangan Genap!";
        }
        else 
        {
            cout << n << " Merupakan bilangan Ganjil!";
        }

    } while (n/n != 1);
}
*/
//=================================================================================================================================================================
/*
int main ()
{
    int n, p;
    cout << "Masukkan Angka yang ingin dioperasikan! ";
    cin >> n;
    cout << endl;
    cout << "Masukkan Angka yang akan mengoperasikan angka sebelumnya! ";
    cin >> p;
    cout << endl;

    cout << n << " + " << p << " = " << n + p << endl;
    cout << n << " - " << p << " = " << n - p << endl;
    cout << n << " x " << p << " = " << n * p << endl;
    cout << n << " / " << p << " = " << n / p << endl;
}
*/
//=================================================================================================================================================================
/*
int main ()
{
    int i, j, k, n;
    cout << "input lebar! ";
    cin >> n;
    cout << endl;
    if (n > 100)
    {
        return 0;
    }
    for (i = 1; i <= n; i++)
    {
        for (j = n; j > i; j--)
        {
            cout << " ";
        }
        for (k = 1; k <= i; k++)
        {
            cout << "* ";
        }
        cout << endl;
    }
}
*/
/*
void output(harga, pesanan)
{
    cout << "TOTAL PESANAN ANDA ADALAH ";
}

int main ()
{
    int n;
    cout << "+++++++++++ DAFTAR MENU ++++++++++++" << endl
         << "+  1. Nasi Goreng /t Rp 15.000     +" << endl
         << "+  2. Indomie Goreng /t Rp 5.000   +" << endl
         << "+  3. Indomie Kuah /t Rp 5.000     +" << endl 
         << "+  4. Ketoprak /t Rp 15.000        +" << endl
         << "+                                  +" << endl
         << "+                                  +" << endl
         << "+                                  +" << endl
         << "++++++++++++++++++++++++++++++++++++" << "\n\n"
         << "Silahkan Pilih menu dengan memasukkan nomor menu! ";
    cin >> n;
    cout << "\n";

    switch (n)
    {
        case 1:
            cout << "TOTAL PESANAN ANDA ADALAH Rp 15.000 \n\n";
            break;
        case 2:
            cout << "TOTAL PESANAN ANDA ADALAH Rp 5.000 \n\n";
            break;
        case 3:
            cout << "TOTAL PESANAN ANDA ADALAH Rp 5.000 \n\n";
            break;
        case 4:
            cout << "TOTAL PESANAN ANDA ADALAH Rp 15.000 \n\n";
            break;
    }

}
*/
//=================================================================================================================================================================
/*
int main ()
{
    int jam, menit, detik;
    string format;
    cout << "PROGRAM KONVERSI FORMAT JAM 12 KE 24 \n\n"
         << "Masukkan Format Waktu! \n"
         << "Jam:\t";
    cin >> jam;
    cout << "Menit:\t";
    cin >> menit;
    cout << "Detik:\t";
    cin >> detik;
    cout << "AM/PM:\t";
    cin >> format;
    cout << endl;
    
    if (jam > 12 || jam <= 0 || menit >= 60 || menit <= 0 || detik >= 60 || detik <= 0)
    {
        cout << "Silahkan masukkan jam, menit, dan detik dengan benar!\n"
             << "Hint: Input jam harus angka 0 - 12\n"
             << "      Input menit & detik harus angka 0 - 59";
        return 0;
    }
    if (format == "PM" || format == "pm")
    { 
        cout << "Dalam format 24 jam menjadi: "
             << jam + 12 << " : " << menit << " : " << detik;
    }
    else if (format == "AM" || format == "am")
    {
        cout << "Dalam format 24 jam menjadi: "
             << jam << " : " << menit << " : " << detik;
    }
    
    else
    {
        cout << "Silahkan masukkan format jam dengan benar!";   
    }
    return 0;
}
*/
//=================================================================================================================================================================
/*
int main()
{
    int l, i, j, n, x, si, sj, ji, jj;
    char T, S, B, U, arahan;
    cout << "Masukkan rasio peta! "; cin >> l;
    char arr[l][l];

    for (i = 1; i <= l; i++)
    {
        for (j = 1; j <= l; j++)
        {
            cout << "Koordinat (" << i << ", " << j << ") = ";
            cin >> arr[i][j];
        }
    }

    system ("cls");
    cout << "PETA LETAK RUMAH SUJONO DAN JUMINTEN" << endl;
    for (int i = 1; i <= l; i++)
    {
        for (int j = 1; j <= l; j++)
        {
            cout << arr[i][j] << " ";
        }
        cout << endl;
    }

    for (int i = 1; i <= l; i++)
    {
        for (int j = 1; j <= l; j++)
        {
            if (arr[i][j] == 'S') {
                si = i;
                sj = j;
            }
            else if (arr[i][j] == 'J') {
                ji = i;
                jj = j;
            }
        }
    }

    cout << endl
         << "Masukkan ada berapa banyak arahan! "; cin >> n;
    cout << "Silahkan masukkan arahan menuju rumah Juminten!" << endl;
    for (i = 1; i <= n; i++)
    {
        cout << "Arahan " << i << ": "; cin >> arahan;
        
        switch (arahan) {
            case 'T' : sj++;
            break;
            case 'B' : sj--;
            break;
            case 'U' : si--;
            break;
            case 'S' : si++;
            break;
        }
    }

    cout << "Koordinat Sujono saat ini: (" << si << ", " << sj << ")";

    if (si == ji && sj == jj)
    {
        cout << endl
             << "Akurat!";
    }
    else 
    {   
        cout << endl
             << "Tidak Akurat!";
    }
}
*/
//=================================================================================================================================================================
// void putarString(string n);
// void hitungJumlahHuruf(string n);
// void kataPertama(string n);
// void penambahanKata(string n);

// int main()
// {
//     string n;
//     cout << "Masukkan kata yang ingin diolah! "; 

// }

// void putarString(string n) 
// {
//     string arr;
//     int x;

//     for (int i = x; i >= 0; i--)
//     {
//         cout << arr[i];
//     }
// }

// void hitungJumlahHuruf(string n)
// {
//     string h;
//     int x = 0;

//     cout << "Masukkan huruf yang ingin dicari! "; cin >> h;
//     while (n == h)
//     {
//         x++;
//     }

//     cout << x;
// }


// #include <iostream>
// using namespace std;

// int main() 
// {
//     string n, x;

//     cout << "ini pake getline = ";
//     getline(cin, x);
//     cout << x << endl;

//     cout << "Ini pake cin = ";
//     cin >> n;
//     cout << n << endl;
// }

// #include <iostream>
// using namespace std;

// int main() 
// {
//     int buka = 5;
//     int tutup = 3;
//     int x;

//     x = buka % tutup;

//     cout << x;
// }

int isPrima(int bil)
{

	for (int i = 1; i <= 20; i++)
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
            cout << i << " ";

	}
    return bil;
}

int main()
{
    int bil;
        cout << bil << " ";

}