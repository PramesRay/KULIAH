/*
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 22 Desember 2021
Deskripsi       : Tugas1 Array
*/

// #include <iostream>
// using namespace std;

// typedef int Matriks[10][10];

// void InputMatriks(Matriks arr, int& baris, int& kolom)
// {
//     cout << "Silahkan masukkan panjang & lebar dari matriks!" << endl;
//     cout << "Panjang = "; cin >> baris;
//     cout << "Lebar   = "; cin >> kolom;

//     cout << "Silahkan masukkan matriks sesuai dengan kolom & barisnya!" << endl;

//     for (int i = 0; i < baris; i++)
//     {
//         for (int j = 0; j < kolom; j++)
//         {
//             cout << "Baris " << i + 1 << " & Kolom " << j + 1 << " = "; cin >> arr[i][j];
//         }
//     }
// }

// void PrintMatriks(Matriks arr, int baris, int kolom)
// {   

//     for (int i = 0; i < baris; i++)
//     {
//         for (int j = 0; j < kolom; j++)
//         {
//             cout << arr[i][j] << " ";
//         }
//         cout << endl;
//     }
// }

// void PenjumlahanMatriks()
// {
    
// }

// void PerkalianMatriks()
// {
    
// }

// void TransposeMatriks()
// {
    
// }

// int main()
// {   
//     Matriks arr;
//     int baris, kolom;
//     InputMatriks(arr, baris, kolom);
//     PrintMatriks(arr, baris, kolom);
// }




//======================================================================================================================================================================================================================================

// #include <iostream>
// using namespace std;

// int main()
// {
//     int n;
//     cout << "Masukkan tinggi segitiga: "; cin >> n;
//     for (int i = 1; i <= n; i++)
//     {
//         for (int j = i; j <= n; j++)
//         {
//             cout << "  ";
//         }

//         for (int k = i; k < i*2; k++)
//         {
//             cout << k << " ";
//         }

//         if (i == 1)
//         {
//         for (int k = i*2-1; k > i; k--)
//         {
//             cout << k-1 << " ";
//         }
//         }
//         cout << endl;
//     }

// }

//======================================================================================================================================================================================================================================

// #include <iostream>
// using namespace std;

// int main()
// {
//     int num1, num2;
//     char opr;
//     cout << "Masukkan angka yang akan dioperasikan!" << endl
//          << "Angka 1 : "; cin >> num1;
//     cout << "Angka 2 : "; cin >> num2;

//     cout << "Masukkan operator! "; cin >> opr;

//     if (opr == '+')
//     {
//         cout << num1 << " + " << num2 << " = " << num1 + num2;
//     }
//     else if (opr == '-')
//     {
//         cout << num1 << " - " << num2 << " = " << num1 - num2;
//     }
//     else if (opr == '*')
//     {
//         cout << num1 << " * " << num2 << " = " << num1 * num2;
//     }else if (opr == '/')
//     {
//         cout << num1 << " / " << num2 << " = " << num1 / num2;
//     }
// }


#include <iostream>
using namespace std;

int main()
{
    int n;
    // for (int i = 1; i <= 5; i++)
    // {
    //     for (int j = 5/2; j <= 1; j++)
    //     {
    //         cout << "* ";
    //     }
    //     cout << endl;
    // }

    // for (int i = 1; i <= 5; i++)
    // {
    //     for (int j = 1; j <= 5; j++)
    //     {
    //         if (j == i)
    //         {
    //             cout << "* ";
    //         }
    //         else if (j+i == (5+1))
    //         {
    //             cout << "* ";
    //         }
    //         else
    //         { 
    //         cout << "  ";
    //         }
    //     }
    //     cout << endl;
    // }

    cout << "Masukkan panjang pola : ";
    cin >> n;

    cout << "Pola 5\n";
    for(int i = 1; i < n; i++){
        for(int j = 1; j < i; j++){
            cout << " ";
        }
        for (int k = n; k >= (2*i - n); k--){
            cout << "*";
        }   
        cout << endl;
    }

    for(int i = 1; i <= n; i++){
        for(int j = n; j > i; j--){
            cout << " ";
        }
        for( int k = 1; k <= (2*i - 1); k++){
            cout << "*";
        }

        cout << endl;
    }

    cout << "Pola 6\n";

}