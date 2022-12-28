/*
Nama Program    : Praktikum8
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 3 November 2021
Deskripsi       : Latihan1
*/
/*
#include <iostream>
using namespace std;

void banyakData(int& n);
void isiLarik(int a[], int n);
void printLarik(int a[], int n);

int main() {
    int x[10];
    int n;
    banyakData(n);
    isiLarik(x, n);
    printLarik(x, n);
}

void banyakData(int& n) {
    cout << "Banyak Data: "; cin >> n;
}

void isiLarik(int a[], int n) {
    cout << "Silahkan input data larik: " << endl;
    for (int i = 0; i < n; i++) {
        cout << "Data ke-" << i + 1 << " = "; cin >> a[i]; 
    }
}

void printLarik(int a[], int n) {
    cout << "\nData yang telah dimasukkan ke larik: " << endl;
    for (int i = 0; i < n; i++) {
        cout << "Data ke-" << i + 1 << " = " << a[i] << endl;
    }
}
*/
//================================================================================================================================================
/*
Nama Program    : Praktikum8
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 3 November 2021
Deskripsi       : Latihan2
*/
/*
#include <iostream>
using namespace std;

typedef int matriks[10][10];

void banyakdata(int& a, int& b);
void isimatriks(matriks x, int a, int b);
void cetakmatriks(matriks x, int a, int b);

int main() {
    matriks x;
    int nbaris, nkolom;
    banyakdata(nbaris, nkolom);
    isimatriks(x, nbaris, nkolom);
    cetakmatriks(x, nbaris, nkolom);
}

void banyakdata(int& a, int& b) {
    cout << "Banyak Baris: "; cin >> a;
    cout << "Banyak Kolom: "; cin >> b;
}

void isimatriks(matriks x, int a, int b) {
    for (int i = 0; i < a; i++) {
        for (int j = 0; j < b; j++) {
            cout << "Baris " << i + 1 << ", Kolom " << j + 1 << " = ";
            cin >> x[i][j];
        }
    }
}

void cetakmatriks(matriks x, int a, int b) {
    for (int i = 0; i < a; i++) {
        for (int j = 0; j < b; j++) {
            cout << x[i][j] << "\t";
        }
        cout << endl;
    }
}
*/
//===================================================================================================================================================
/*
Nama Program    : Praktikum8
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 3 November 2021
Deskripsi       : Latihan3
*/
/*
#include <iostream>
using namespace std;

void swap(int&a, int&b);
void bubblesort(int arr[], int n);
void printarr(int arr[], int n);

int main() {
    int larik[] = {12, 36, 5, 19, 0};
    int n = sizeof(larik)/sizeof(larik[0]);
    cout << "Array sebelum sorting: \n"; printarr(larik, n);
    bubblesort(larik, n);

    cout << "\nArray setelah sorting: \n"; printarr(larik, n);
}

void swap(int& a, int& b){
    int temp = a;
    a = b;
    b = temp;
}

void bubblesort(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr [j] > arr [j + 1])
                swap(arr[j], arr[j + 1]);
        }
    }
}

void printarr(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        cout << "Data ke-" << i + 1 << " = " << arr[i] << endl;
    }
}
*/
//==================================================================================================================================================
/*
Nama Program    : Praktikum8
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 3 November 2021
Deskripsi       : Tugas1
*/
/*
#include <iostream>
using namespace std;

typedef int matriks[15][15];

void isiMatriks(int nBaris, int nKolom, matriks x1) { 
    if (nBaris > 0 && nKolom > 0) {
        cout << "\nMasukkan isi matriks\n"; 

        for (int i = 0; i < nBaris; i++) {
            for (int j = 0 ; j < nKolom ; j++) {
                cout << "Baris " << i+1 << ", Kolom " << j+1 << " = "; cin >> x1[i][j];
            }
            cout << endl;
        }
    } 
}

void banyakData(int& nBaris, int& nKolom) {
    cout << "Banyak baris : "; cin >> nBaris; 
    cout << "Banyak kolom : "; cin >> nKolom;
}

void cetakMatriks(int nBaris, int nKolom, matriks x1) {
    cout << "=============================\n"
         << "Matriks:\n";
    
    for (int i = 0; i < nBaris; i++) {
        for (int j = 0; j < nKolom; j++) { 
            cout << x1[i][j] << "\t";
        }
        cout << endl;
    }
}

void penjumlahanMatriks(int nBaris, int nKolom, matriks x1, int nBaris2, int nKolom2, matriks x2) {
    cout << "MATRIKS A\n\n"; 
    banyakData(nBaris, nKolom); 
    isiMatriks(nBaris, nKolom, x1);
    cetakMatriks(nBaris, nKolom, x1);
    cout << "=============================\n" 
         << "MATRIKS B\n\n"; 
    banyakData(nBaris2, nKolom2);
    
    if (nBaris == nBaris2 && nKolom == nKolom2) {
        isiMatriks(nBaris2, nKolom2, x2);
        
        for (int i = 0; i < nBaris; i++) {
            for (int j = 0; j < nKolom; j++) { 
                x1[i][j] += x2[i][j];
            } 
        }
        
        cetakMatriks(nBaris, nKolom, x1);
        cout << "=============================\n" 
             << "Hasil penjumlahan:\n";
        
        for (int i = 0; i < nBaris; i++) {
            for (int j = 0; j < nKolom; j++) {
                cout << x1[i][j] <<" ";
            }
            cout << endl;
        }   
    }
    else {
        cout << "Matriks tidak dapat dijumlahkan.\n"; 
    }
}

void perkalianMatriks(int nBaris, int nKolom, matriks x1, int nBaris2, int nKolom2, matriks x2, matriks x3) {
    int hasil = 0;
    cout << "MATRIKS A\n\n"; 
    banyakData(nBaris, nKolom); 
    isiMatriks(nBaris, nKolom, x1);
    cetakMatriks(nBaris, nKolom, x1);
    cout << "=============================\n"
         << "MATRIKS B\n\n"; 
    
    banyakData(nBaris2, nKolom2);
    
    if (nKolom == nBaris2 && nBaris == nKolom2) {
        isiMatriks(nBaris2, nKolom2, x2); 
        for(int i = 0; i < nBaris; i++) {
            for (int j = 0; j < nKolom2; j++) { 
                for(int k = 0; k < nBaris2; k++) {
                    hasil = hasil + x1[i][k] * x2[k][j]; 
                }
                x3[i][j] = hasil;
                hasil = 0; 
            }
        }
        
        cetakMatriks(nBaris, nKolom, x1);
        cout <<"=============================\n" 
             << "Hasil perkalian: \n";
        
        for (int i = 0; i < nBaris; i++) { 
            for (int j = 0; j < nKolom2; j++) {
                cout << x3[i][j] <<" ";
            }
            cout << endl;
        } 
    } 
    else {
        cout << "Matriks tidak dapat dikalikan.\n"; 
    }
}

void transposeMatriks(int nBaris, int nKolom, matriks x1) { 
    banyakData(nBaris, nKolom);
    isiMatriks(nBaris, nKolom, x1);
    cetakMatriks(nBaris, nKolom, x1);
    cout << "=============================\n"
         << "Hasil:\n";
    
    for(int i = 0; i < nKolom; i++) {
        for(int j = 0; j < nBaris; j++) { 
            cout << x1[j][i] <<" ";
        }
        cout << endl;
    }
}

int main() {
    int nBaris, nKolom, nBaris2, nKolom2, option; matriks x1, x2, x3;
    
    cout << "====================\n" 
         << " KALKULATOR MATRIKS\n"
         << "====================\n";
    cout << "1. Cetak Matriks\n" 
         << "2. Perkalian Matriks\n" 
         << "3. Penjumlahan Matriks\n" 
         << "4. Transpose Matriks\n";

    cout << "\nPilihan : "; cin >> option;
    cout << "\n\n"; 
    switch (option){
        case 1:
            banyakData(nBaris, nKolom); 
            isiMatriks(nBaris, nKolom, x1);
            cetakMatriks(nBaris, nKolom, x1);        
        break;
        case 2:
            perkalianMatriks( nBaris, nKolom, x1, nBaris2, nKolom2, x2, x3);
        break;
        case 3:
            penjumlahanMatriks(nBaris, nKolom, x1, nBaris2, nKolom2, x2);
        break;
        case 4:
            transposeMatriks(nBaris, nKolom, x1); 
        break;
        default:
        break;
    }
}
*/
//=======================================================================================================================================================
/*
Nama Program    : Praktikum8
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 3 November 2021
Deskripsi       : Tugas2
*/

#include <iostream>
using namespace std;

void BanyakData(int& x) {
    cout << "Masukan banyak array: ";
	cin >> x;
}

void InputAngka(int arr[], int x) {
    for (int i = 0; i < x; i++) {
		cout << "Masukan angka ke " << i+1 << " : ";
		cin >> arr[i];
		cout << endl;
    }
}

void Insertion(int arr[], int x) {
    int i, j; 
    for (int i = 1; i < x; i++) {
		int key = arr[i];
		int j = i - 1;        
		while (j >= 0 && arr[j] > key) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = key;
	}
}

void Selection(int arr[], int x) {
    int i, j, temp, pos;
    for (int i = 0; i < x-1; i++) {
        pos = i;
        int temp;

        for(int j = i+1; j < x; j++) {
            if(arr[j] < arr[pos]){
                pos = j;
            }
        }   
        temp = arr[pos];
        arr[pos] = arr[i];
        arr[i] = temp;
    }
}

void merge(int arr[], int l, int m, int r)
{
	int i, j, k;
	int x1 = m - l + 1;
	int x2 = r - m;
	
	int L[x1], R[x2];
	
	for (i = 0; i < x1; i++)
	    L[i] = arr[l + i];
	for (j = 0; j < x2; j++)
	    R[j] = arr[m + 1 + j];
	
	i = 0;
	j = 0;
	k = l;
	while (i < x1 && j < x2)
	{
	    if (L[i] <= R[j])
	    {
	        arr[k] = L[i];
	        i++;
	    }
	    else
	    {
	        arr[k] = R[j];
	        j++;
	    }
	    k++;
	}
	
	while (i < x1)
	{
	    arr[k] = L[i];
	    i++;
	    k++;
	}
	
	while (j < x2)
	{
	    arr[k] = R[j];
	    j++;
	    k++;
    }
}	
void MergeSort(int arr[], int l, int r)
{
	if (l < r)
	{
	    int m = l + (r - l) / 2;
	    MergeSort(arr, l, m);
	    MergeSort(arr, m + 1, r);
	    merge(arr, l, m, r);
	}
}

void OutputHasil(int arr[], int x) {
    int h;
    cout << "Hasil Ascending: " << endl;
    for (int h = 0; h < x; h++) {
		cout << arr[h] << " ";
	}
}

int main() {
    int h, i, j, x;
    BanyakData(x);
    int arr[x];
    InputAngka(arr, x);
    //Silahkan dipilih!
    //Insertion(arr, x);
    //Selection(arr, x);
    //MergeSort(arr, 0, x);
    OutputHasil(arr, x);
}
