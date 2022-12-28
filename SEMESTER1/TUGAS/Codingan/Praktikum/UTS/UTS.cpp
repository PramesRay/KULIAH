/*
Nama Program    : UTS
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 27 Oktober 2021
Deskripsi       : soal1
*/
/*
#include <iostream>
using namespace std;

int main ()
{
	for (int i = 1; i <= 4; i++)
    {
		cout << "minggu : " << i << endl;
		
        for (int j = 1; j <= 5; j++)
        {
			if (i == 2) 
            {
				break;
			}
			cout << "hari : " << j << endl;
		}
	}
}
*/
//=====================================================================================================================================================================================
/*
Nama Program    : UTS
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 27 Oktober 2021
Deskripsi       : soal2
*/
/*
#include <iostream>
using namespace std;

int main ()
{
    int n, i = 0, j = 0;
    string genap = "ganjil", prima = "bukan ";
    cout << "Masukkan bilangan: ";
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        cout << "I";

        if (i % 5 == 0)
        cout << " ";
    }

    if (n % 2 == 0)
    {
        genap = "genap";
    }

    for (int i = 1; i < n; i++)
        if (n % i == 0)
            j++;
    
    if (j == 1)
    {
        prima = "adalah ";
    }

    cout << "\n" << n << " " << "adalah bilangan " << genap;
    cout << "\n" << n << " " << prima << "bilangan prima";
}
*/
//=====================================================================================================================================================================================
/*
Nama Program    : UTS
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 27 Oktober 2021
Deskripsi       : soal3
*/
/*
#include <iostream>
using namespace std;

int main ()
{
    string kalimat;
    int nkata, nkalimat, i = 0;
    cout << "masukan banyak kalimat : ";
    cin >> nkalimat;
    cout << endl;

    while (i < nkalimat)
    {
        nkata = 0;
        cin.ignore();
        getline(cin, kalimat);
        
        for (int i = 0; i <= kalimat.size(); i++)
        {
            if (kalimat[i] == ' ')
            {
                nkata++;
            }
        }
        cout << nkata + 1;
        cout << "\n\n";
        i++;
    }
}
*/
//=====================================================================================================================================================================================
/*
Nama Program    : UTS
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 27 Oktober 2021
Deskripsi       : soal4
*/

#include <iostream>
using namespace std;

int translate_to_num(string Huruf)
{
    if (Huruf == "a")
        return 1;
    else if (Huruf == "b")
        return 2;
    else if (Huruf == "c")
        return 3;
    else if (Huruf == "d")
        return 4;
    else if (Huruf == "e")
        return 5;
    else if (Huruf == "f")
        return 6;
    else if (Huruf == "g")
        return 7;
    else if (Huruf == "h")
        return 8;
    else if (Huruf == "i")
        return 9;
    else if (Huruf == "j")
        return 10;
    else if (Huruf == "k")
        return 11;
    else if (Huruf == "l")
        return 12;
    else if (Huruf == "m")
        return 13;
    else if (Huruf == "n")
        return 14;
    else if (Huruf == "o")
        return 15;
    else if (Huruf == "p")
        return 16;
    else if (Huruf == "q")
        return 17;
    else if (Huruf == "r")
        return 18;
    else if (Huruf == "s")
        return 19;
    else if (Huruf == "t")
        return 20;
    else if (Huruf == "u")
        return 21;
    else if (Huruf == "v")
        return 22;
    else if (Huruf == "w")
        return 23;
    else if (Huruf == "x")
        return 24;
    else if (Huruf == "y")
        return 25;
    else if (Huruf == "z")
        return 26;
}

char translate(int nomorHuruf)
{
    if (nomorHuruf == 1)
        return 'a';
    else if (nomorHuruf == 2)
        return 'b';
    else if (nomorHuruf == 3)
        return 'c';
    else if (nomorHuruf == 4)
        return 'd';
    else if (nomorHuruf == 5)
        return 'e';
    else if (nomorHuruf == 6)
        return 'f';
    else if (nomorHuruf == 7)
        return 'g';
    else if (nomorHuruf == 8)
        return 'h';
    else if (nomorHuruf == 9)
        return 'i';
    else if (nomorHuruf == 10)
        return 'j';
    else if (nomorHuruf == 11)
        return 'k';
    else if (nomorHuruf == 12)
        return 'l';
    else if (nomorHuruf == 13)
        return 'm';
    else if (nomorHuruf == 14)
        return 'n';
    else if (nomorHuruf == 15)
        return 'o';
    else if (nomorHuruf == 16)
        return 'p';
    else if (nomorHuruf == 17)
        return 'q';
    else if (nomorHuruf == 18)
        return 'r';
    else if (nomorHuruf == 19)
        return 's';
    else if (nomorHuruf == 20)
        return 't';
    else if (nomorHuruf == 21)
        return 'u';
    else if (nomorHuruf == 22)
        return 'v';
    else if (nomorHuruf == 23)
        return 'w';
    else if (nomorHuruf == 24)
        return 'x';
    else if (nomorHuruf == 25)
        return 'y';
    else if (nomorHuruf == 26)
        return 'z';
}

int main()
{
    string kode, semi, semi2 = "", semiHasil = "";
    int banyakGeser, semiHasil1;
    cout << "Masukan kode yang akan di enkripsi : ";
    cin >> kode;
    cout << "Masukan banyak pergeseran : ";
    cin >> banyakGeser;

    int panjang = kode.length();
    for (int i = 0; i < panjang; i++)
    {
        semi = kode.substr(i, 1);
        semi2 += to_string(translate_to_num(semi));
    }

    for (int j = 0; j < panjang; j++)
    {
        semiHasil1 = stoi(semi2.substr(j, 1)) + 1;
        semiHasil += translate(semiHasil1);
    }
    
    cout << semiHasil;

}

/*
Nama Program    : UTS
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 27 Oktober 2021
Deskripsi       : soal5
*/

#include <iostream>
using namespace std;

void konvert(int& jam, string am_pm)
{
    if (am_pm == "PM")
    {
        jam += 12;
    }

    if (jam == 24)
        jam = 00;
    
}

int main()
{
    int jam, menit;
    string am_pm;

    cin >> jam >> menit >> am_pm;

    cout << "Format 12 Jam : " << jam << ":" << menit << am_pm << "\n";
    konvert(jam, am_pm);
    cout << "Format 24 Jam : " << jam << ":" << menit;

    
}