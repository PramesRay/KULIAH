/*
Nama Program    : UAS
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 8 Desember 2021
Deskripsi       : Tugas2
*/
#include <iostream>
using namespace std;

void bubbleSort(int arr[], int n)
{
    for (int i = 0; i < n-1; i++)
    {
        for (int j = 0; j < n-i-1; j++)
        {
            if(arr[j] < arr[j+1])
            {
                swap(arr[j], arr[j+1]);
            }
        }
    }
}

void swap (int& a, int& b)
{
    int t = a;
    a = b;
    b = t;
}

int main()
{
    int n;
    int j = 0;
    cout << "Masukan ukuran array : ";
    cin >> n;
    int array1[n], array2[n], array3[2*n];

    for(int i = 0; i < n; i++)
    {
        cout << "Elemen " << i << " : ";
        cin >> array1[i];
        array3[j] = array1[i];
        j++;
    }

    cout << "Array 2" << endl;
    
    for(int i = 0; i < n; i++)
    {
        cout << "Elemen " << i << " : ";
        cin >> array2[i];
        array3[j] = array2[i];
        j++;
    }
    
    bubbleSort(array3, n*2);
    
    cout << endl << "Output\n";
    
    for(int i = 0; i < n*2; i++)
    {
        cout << array3[i];
    }
}