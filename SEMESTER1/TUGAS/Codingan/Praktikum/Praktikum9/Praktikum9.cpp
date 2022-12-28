/*
Nama Program    : Praktikum9
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 10 November 2021
Deskripsi       : Latihan1
*/
/*
#include <iostream>
using namespace std;

struct koordinat {
    float absis;
    float ordinat;
};

void getpoint(koordinat& ttk) {
    cout << "Nasukkan Absis : "; cin >> ttk.absis;
    cout << "Masukkkan Ordinat : "; cin >> ttk.ordinat;
    cout << endl;
}

void printpoint(koordinat ttk) {
    cout << "(" << ttk.absis << ", " << ttk.ordinat << ")";
}

int main() {
    koordinat a, b, c;
    cout << "Input titik a : " << endl; getpoint(a);
    cout << "Input titik b : " << endl; getpoint(b);
    cout << "Input titik c : " << endl; getpoint(c);
    cout << "Titik a = "; printpoint(a);
    cout << "\nTitik b = "; printpoint(b);
    cout << "\nTitik c = "; printpoint(c);
    cout << "\nAbsis = " << c.absis;
}
*/
//===========================================================================================================================================================================================
/*
Nama Program    : Praktikum9
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 10 November 2021
Deskripsi       : Latihan2
*/
/*
#include <iostream>
using namespace std;

struct siswa {
    string nama, npm, nilai;
};

void getpoint(siswa& data) {
    cout << "Nasukkan Nama      : "; cin >> data[i].nama;
    cout << "Masukkkan NPM      : "; cin >> data[i].npm;
    cout << "Masukkkan Nilai    : "; cin >> data[i].nilai;
    cout << endl;
}

void printpoint(siswa data) {
    int x;
    cout << data.nama[x] << endl;
    cout << data.npm[x] << endl;
    cout << data.nilai[x] << endl;
}

int main() {
    int x, i, n;
    cout << "Masukkan banyak siswa: "; cin >> n;
    siswa s[n];

    for (i = 0; i < n; i++) {
        cout << "Siswa ke-" << i + 1 << endl;
        cout << "Nasukkan Nama      : "; cin >> s[i].nama;
        cout << "Masukkkan NPM      : "; cin >> s[i].npm;
        cout << "Masukkkan Nilai    : "; cin >> s[i].nilai;
        cout << endl;
    }

    cout << "Data yang ingin di tampilkan adalah siswa ke-"; cin >> x;
    cout << "Nama : " << s[x - 1].nama  << endl;
    cout << "NPM  : " << s[x - 1].npm   << endl;
    cout << "Nilai: " << s[x - 1].nilai << endl;
}
*/
//===========================================================================================================================================================================================
/*
Nama Program    : Praktikum9
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 10 November 2021
Deskripsi       : Tugas1
*/
/*
#include <iostream>
using namespace std;

struct waktu 
{
    int jam;
    int menit;
    int detik;
};

int main() 
{   
    waktu waktu;
    int sekon;
    cout << "PROGRAM KONVERSI DETIK => FORMAT JAM \n"
         << "===================================="
         << "\nMasukkan detik! "; cin >> sekon;

    waktu.jam = sekon / 3600;
    waktu.menit = (sekon - (waktu.jam * 3600)) / 60;
    waktu.detik = (sekon - (waktu.jam * 3600) - (waktu.menit * 60));

    cout << "Dalam format jam menjadi => " << waktu.jam << " : " << waktu.menit << " : " << waktu.detik << endl;
}
*/
//===========================================================================================================================================================================================
/*
Nama Program    : Praktikum9
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 10 November 2021
Deskripsi       : Tugas2
*/

#include <iostream>
using namespace std;

struct parkir
{
    string plat;
    int jm, jk, mm, mk;
};

void waktu(parkir kendaraan)
{
        cout << "\nWaktu Masuk"
             << "\nJam  : "; cin >> kendaraan.jm;
        cout << "Menit: "; cin >> kendaraan.mm;

        cout << "\nWaktu Keluar"
             << "\nJam  : "; cin >> kendaraan.jk;
        cout << "Menit: "; cin >> kendaraan.mk;
}

void tarif(parkir kendaraan, int& biaya)
{
    int bedaj, bedam;
    bedaj = kendaraan.jk - kendaraan.jm;
    bedam = kendaraan.mk - kendaraan.mm;
    
    bedaj -= 1;
    biaya += 3000;
    if (bedam != 0)
    {
        bedaj++;
    }

    for (int i = 0; i < bedaj; i++)
    {
        biaya += 2000;
    }
    cout << "\nTotal Biaya          : Rp " << biaya;
} 

void struk(parkir kendaraan) 
{
    cout << "\t -----STRUK PARKIR-----\n"
         << "Plat Nomor Kendaraan : " << kendaraan.plat
         << "\nWaktu Masuk          : " << kendaraan.jm << ":" << kendaraan.mm
         << "\nWaktu Keluar         : " << kendaraan.jk << ":" << kendaraan.mk;
}   

int main()
{
    int biaya;
    parkir kendaraan;
    cout << "Plat Nomor Kendaraan: "; getline(cin, kendaraan.plat);
    
    cout << "\nWaktu Masuk"
         << "\nJam  : "; cin >> kendaraan.jm;
    cout << "Menit: "; cin >> kendaraan.mm;

    cout << "\nWaktu Keluar"
         << "\nJam  : "; cin >> kendaraan.jk;
    cout << "Menit: "; cin >> kendaraan.mk;

    system ("cls");
    struk(kendaraan);
    tarif(kendaraan, biaya);
}

//===========================================================================================================================================================================================
/*
Nama Program    : Praktikum9
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 10 November 2021
Deskripsi       : Tugas3
*/
/*
#include <iostream>
using namespace std;

struct data
{
    string nama, npm;
    char predikat;
    int nilai;
};

void inputdata(int jumlah, data mahasiswa[])
{
    for (int i = 0; i < jumlah; i++)
    {
        cout << "\nMahasiswa " << i+1;
        cin.ignore();
        cout << "\nNama           : "; getline(cin, mahasiswa[i].nama);
        cout << "NPM            : ";   getline(cin, mahasiswa[i].npm);
        cout << "Predikat (A-E) : ";   cin >> mahasiswa[i].predikat;
        
        if (mahasiswa[i].predikat == 'A' || mahasiswa[i].predikat == 'a') 
        {
            mahasiswa[i].nilai = 100;
        }
        else if (mahasiswa[i].predikat == 'B' || mahasiswa[i].predikat == 'b' ) 
        {
            mahasiswa[i].nilai = 80;
        }
        else if (mahasiswa[i].predikat == 'C' || mahasiswa[i].predikat == 'c' ) 
        {
            mahasiswa[i].nilai = 70;
        }
        else if (mahasiswa[i].predikat == 'D' || mahasiswa[i].predikat == 'd') 
        {
            mahasiswa[i].nilai = 60;
        }
        else if (mahasiswa[i].predikat == 'E' || mahasiswa[i].predikat == 'e') 
        {
            mahasiswa[i].nilai = 50;
        }
    }
}

void swap(char& x, char& y) 
{
	char temp = x;
	x = y;
	y = temp;
}

void swapstring(string& x, string& y) 
{
	string temp = x;
	x = y;
	y = temp;
}

void maxmin(int jumlah, data mahasiswa[], int pilihan) 
{
    for (int i = jumlah - 1; i > 0; i--) 
    {
		for (int j = 0; j < i; j++) 
        {
			if (mahasiswa[j].predikat < mahasiswa[j+1].predikat)
				swap(mahasiswa[j].predikat, mahasiswa[j+1].predikat);
		}
	}
    
    if (pilihan == 2) 
    {
        cout << "\nNilai tertinggi : " << (char)toupper(mahasiswa[jumlah-1].predikat);
    }
    else if (pilihan == 3) 
    {
        cout << "\nNilai terendah : " << (char)toupper(mahasiswa[0].predikat);
    }
}

void ratarata(int jumlah, data mahasiswa[]) 
{
    float rata = 0;
    
    for (int i = 0; i < jumlah; i++) 
    {
        rata = rata + mahasiswa[i].nilai;
    }
    
    rata = rata / jumlah;
    cout << "\nNilai rata - rata: " << rata;
}

void sort(data mahasiswa[], int n) 
{
	for (int i = n - 1; i > 0; i--) 
    {
		for (int j = 0; j < i; j++) 
        {
			if (mahasiswa[j].npm > mahasiswa[j+1].npm)
				swapstring(mahasiswa[j].npm, mahasiswa[j+1].npm);
		}
	}
}

void urutannpm(data mahasiswa[], int n) 
{
    cout << "\nUrutan NPM Secara Ascending:\n";
    
    for (int i = 0; i < n; i++)
        cout << "Mahasiswa " << i+1 << " : " << mahasiswa[i].npm << endl;
}


int main()
{
    int jumlah, pilihan;
    
    cout << "Jumlah Mahasiswa : "; cin >> jumlah;
    data mahasiswa[jumlah];
    system ("cls");
    cout << "PILIHAN: "
         << "\n1. Nilai Terendah    "
         << "\n2. Nilai Tertinggi   "
         << "\n3. Nilai Rata-rata   "
         << "\n4. Urutan NPM        "
         
         << "\nMasukkan pilihan : "; cin >> pilihan;

    switch (pilihan)
    {
        case 1 :
            inputdata(jumlah, mahasiswa);
            ratarata(jumlah, mahasiswa);
            break;
        case 2 :
            inputdata(jumlah, mahasiswa);
            maxmin(jumlah, mahasiswa, pilihan);
            break;
        case 3 :
            inputdata(jumlah, mahasiswa);
            maxmin(jumlah, mahasiswa, pilihan);
            break;
        case 4 :
            inputdata(jumlah, mahasiswa);
            sort(mahasiswa, jumlah);
            urutannpm(mahasiswa, jumlah);
            break;
        default :
            break;
    }
}
*/
