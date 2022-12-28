/*
Nama Program    : Praktikum5
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 19 Oktober 2021
Deskripsi       : Tugas1
*/
/*
#include <iostream>
#include <limits>
using namespace std;

void output_hasil(float suhuAwal, float suhuAkhir, char tempAwal, char tempAkhir)
{
    cout << "hasil : " << suhuAwal << " " << tempAwal << " == " << suhuAkhir << " " << tempAkhir << "\n\n";
}

float input_suhu(string skala)
{
    float suhu;
    cout << "Masukan suhu dalam " << skala << " : ";
    cin >> suhu;
    return suhu;
}

int konversi_ke(string opsi1, string opsi2, string opsi3)
{
    system("CLS");
    float input;
    do
    {
        cout << "pilih skala untuk tujuan konversi\n"
             << "=== PILIHAN ===\n"
             << opsi1 << "(1)\n"
             << opsi2 << "(2)\n"
             << opsi3 << "(3)\n"
             <<"tidak jadi   (4)\n"
             << "\n> ";
        cin >> input;
        if (input > 0 && input < 5)
          break;
        else if (int(input)- input != 0 || input < 1 || input > 4 || !(cin >> input))
        {
          cout << "Invalid Input\n";
          cin.clear();
          cin.ignore(numeric_limits<streamsize>::max(), '\n');
        }
        
    } while (int(input)- input != 0 || input < 1 || input > 4);

    return int(input);   
}

void kelvin()
{
  system("CLS");
  float suhu = input_suhu("kelvin");
  int konversiKe = konversi_ke("Celcius      ", "Fahrenheit   ", "Reamur       "); 
  if (konversiKe == 1) 
    output_hasil(suhu, suhu - 273.15, 'K', 'C');
  else if (konversiKe == 2) 
    output_hasil(suhu, suhu * (9.0/5.0) - 459.67, 'K', 'F');
  else if (konversiKe == 3) 
    output_hasil(suhu, (suhu - 274.15) * (4.0/5.0), 'K', 'R');
  else if (konversiKe == 4){};
}

void reamur()
{
  system("CLS");  
  float suhu = input_suhu("reamur");
  int konversiKe = konversi_ke("Celcius      ", "fahrenheit   ", "kelvin       ");
  if (konversiKe == 1) 
    output_hasil(suhu, suhu / 0.8, 'R', 'C');
  else if (konversiKe == 2) 
    output_hasil(suhu, (suhu * 2.25) + 32, 'R', 'F');
  else if (konversiKe == 3) 
    output_hasil(suhu, (suhu / 0.8) + 273.15, 'R', 'K');
  else if (konversiKe == 4);

}

void fahrenheit()
{
  system("CLS");
  float suhu = input_suhu("fahrenheit");
  int konversiKe = konversi_ke("Celcius      ", "reamur       ", "kelvin       ");
  if (konversiKe == 1) 
    output_hasil(suhu, (suhu - 32) * (5.0/9.0), 'F', 'C');
  else if (konversiKe == 2) 
    output_hasil(suhu, (suhu - 32) * (4.0/9.0), 'F', 'R' );
  else if (konversiKe == 3) 
    output_hasil(suhu, (suhu + 459.67) * (5.0 / 9.0), 'F', 'K');
  else if (konversiKe == 4);
}

void celsius()
{
  system("CLS");
  float suhu = input_suhu("celcius");
  int konversiKe = konversi_ke("fahrenheit    ", "reamur       ", "kelvin       ");
  if (konversiKe == 1) 
    output_hasil(suhu, suhu * (9.0 / 5.0) + 32.0, 'C', 'F');
  else if (konversiKe == 2) 
    output_hasil(suhu, suhu * (4.0 / 5.0), 'C', 'R');
  else if (konversiKe == 3) 
    output_hasil(suhu, suhu + 273.15, 'C', 'K');
  else if (konversiKe == 4);
  
}

int main()
{
    int input, mengulang;
    cout << "Program konversi suhu !\n";
    do
    {
        while(true)
        {
            cout << "tolong pilih skala untuk memulai\n"
                 <<"=====Pilihan=====\n"
                 <<"Celcius       (1)\n"
                 <<"Fahrenheit    (2)\n"
                 <<"Reamur        (3)\n"
                 <<"Kelvin        (4)\n"
                 <<"Keluar        (5)\n"
                 <<"\n> ";
            cin >> input;
            if (input <= 5 && input >= 1)
                break;
            else
            {
                cout << "input invalid, tolong masukan input yang valid\n";
                cin.clear();
                cin.ignore(numeric_limits<streamsize>::max(), '\n');
            }
        }

        switch (input)
        {
        case 1:
            celsius();
            break;
        case 2:
            fahrenheit();
            break;
        case 3:
            reamur();
            break;
        case 4:
            kelvin();
            break;
        case 5:
            return 0;
            break;
        default:
        cout << "Invalid Input";
            break;
        }
        while(true)
        {
            cout << "Mau mengulang lagi?\n"
                 << "====pilihan====\n"
                 << "iya         (1)\n"
                 << "tidak       (2)\n";
            cin >> mengulang;
            if (mengulang == 1 || mengulang == 2)
                break;
            else
            {
                cout << "input invalid, tolong masukan input yang valid\n";
                cin.clear();
                cin.ignore(numeric_limits<streamsize>::max(), '\n');
            }
        }
        if(mengulang == 2) 
            return 0; 
         
    } while(true);
}
*/

/*
Nama Program    : Praktikum5
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 19 Oktober 2021
Deskripsi       : Tugas2
*/

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
    for (int i = 1; n > i;)
    {
      n = n - 1;
      x = x * n;
    }
    cout << "Nilai Faktorial: " << x << endl;
    return 0;
}