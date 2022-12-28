/*
Nama Program    : UAS
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 8 Desember 2021
Deskripsi       : Tugas1
*/

// #include <iostream>
// using namespace std;

// struct waktu
// {
//     int hari, bulan, tahun;
// };

// int main() 
// {   
//     waktu waktu;
//     int hari, sisaTahun, sisaBulan;
//     cout << "PROGRAM KONVERSI HARI => TAHUN \n"
//          << "===================================="
//          << "\nMasukkan Jumlah Hari! "; cin >> hari;

//     waktu.tahun = hari / 365;
//     sisaTahun   = hari % 365;
//     waktu.bulan = sisaTahun / 30;
//     sisaBulan   = sisaTahun % 30;
//     waktu.hari  = sisaBulan;

//     cout << "Dalam tahun menjadi => " << waktu.tahun << " Tahun " << waktu.bulan << " Bulan " << waktu.hari << " Hari" << endl;
// }


/*
Nama Program    : UAS
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 8 Desember 2021
Deskripsi       : Tugas2
*/
// #include <iostream>
// using namespace std;

// void bubbleSort(int arr[], int n)
// {
//     for (int i = 0; i < n-1; i++)
//     {
//         for (int j = 0; j < n-i-1; j++)
//         {
//             if(arr[j] < arr[j+1])
//             {
//                 swap(arr[j], arr[j+1]);
//             }
//         }
//     }
// }

// void swap (int& a, int& b)
// {
//     int t = a;
//     a = b;
//     b = t;
// }

// int main()
// {
//     int n;
//     int j = 0;
//     cout << "Masukan ukuran array : ";
//     cin >> n;
//     int array1[n], array2[n], array3[2*n];

//     for(int i = 0; i < n; i++)
//     {
//         cout << "Elemen " << i << " : ";
//         cin >> array1[i];
//         array3[j] = array1[i];
//         j++;
//     }

//     cout << "Array 2" << endl;
    
//     for(int i = 0; i < n; i++)
//     {
//         cout << "Elemen " << i << " : ";
//         cin >> array2[i];
//         array3[j] = array2[i];
//         j++;
//     }
    
//     bubbleSort(array3, n*2);
    
//     cout << endl << "Output\n";
    
//     for(int i = 0; i < n*2; i++)
//     {
//         cout << array3[i];
//     }
// }


/*
Nama Program    : UAS
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 8 Desember 2021
Deskripsi       : Tugas3
*/

#include <iostream>
using namespace std;

int main()
{
    int n1, n2, n3;
    int min, max;
    
    cout << "Masukkan tiga buah angka: " << endl; 
    cin >> n1;
    cin >> n2; 
    cin >> n3;

    int* pn1 = &n1;
    int* pn2 = &n2;
    int* pn3 = &n3;

    min = *pn1;
	
	if (*pn2 < min)
    {
		min = *pn2;
	}
	if (*pn3 < min)
    {
		min = *pn3;
	}
	
	//Menentukan nilai terbesar
	max = *pn1;
	
	if (*pn2 > max)
    {
		max = *pn2;
	}
	if (*pn3 > max)
    {
		max = *pn3;
	}

    cout << "Angka terbesar adalah: " << max << endl;
    cout << "Angka terkecil adalah: " << min << endl;
}


/*
Nama Program    : UAS
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 8 Desember 2021
Deskripsi       : Tugas4
*/

// #include <iostream>
// using namespace std;

// struct mahasiswa
// {
//     string nama, npm;
//     int nilai;
// };

// void swap(int& a, int& b){
//     int temp = a;
//     a = b;
//     b = temp;
// }

// int main()
// {   
//     mahasiswa mahasiswa[30];
//     int n;

//     cout << "Masukkan banyak mahasiswa yang ingin di inputkan datanya: "; cin >> n;
    
//     for (int i = 0; i < n; i++)
//     {
//         cout << "\nMahasiswa " << i+1;
//         cin.ignore();
//         cout << "\nNama           : "; getline(cin, mahasiswa[i].nama);
//         cout << "NPM            : ";   getline(cin, mahasiswa[i].npm);
//         cout << "Nilai          : ";   cin >> mahasiswa[i].nilai;    
//     }

//     for (int i = 0; i < n - 1; i++) 
//     {
//         for (int j = 0; j < n - i - 1; j++) 
//         {
//             if (mahasiswa[j].nilai < mahasiswa [j + 1].nilai)
//             {
//                 swap(mahasiswa[j].nilai, mahasiswa[j + 1].nilai);
//             }
//         }
//     }

//     for (int i = 0; i < n; i++) 
//     {
//         cout << "Mahasiswa ke-" << i + 1 << endl;
//         cout << "\nNama           : " << mahasiswa[i].nama << endl;
//         cout << "NPM            : " << mahasiswa[i].npm << endl;
//         cout << "Nilai          : " << mahasiswa[i].nilai << endl;
//     }

// }


/*
Nama Program    : UAS
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 8 Desember 2021
Deskripsi       : Tugas5
*/