#include <iostream>
#include <iomanip>
using namespace std;

string month[13]{"", "Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                 "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

string day[8]{"", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"};

int tgl[32]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
            21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};

int maxDay[13]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

int main()
{
    int startDay, lastDay, loop = 0, counter = 0;

    for (int i = 1; i <= 12; i++) //loop bulan
    {
        cout << month[i] << endl;
        
        for (int j = 1; j <= 7; j++) //loop hari
        {
            cout << setw(5) << day[j];
        }
        cout << endl;

        for(int k = 1; k <= maxDay[i]; k++) //loop tanggal
        {
            cout << setw(5) << k;
            loop++;

            if (k % 7 != 0 && loop % 7 == 0 && k <= 7)
            {
                for (k = 1; k <= 7; counter++)
                {
                    counter++;

                    cout << counter ;
                }
                
            }

            if (loop % 7 == 0)
            {
                cout << endl;
            }
        }
        cout << endl << endl;        
    }
}