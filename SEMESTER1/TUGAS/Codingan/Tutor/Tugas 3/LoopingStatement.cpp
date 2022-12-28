/*
Nama Program    : Looping Statement
Nama            : Prames Ray Lapian
NPM             : 140810210059
Tanggal Buat    : 26 September 2021
Deskripsi       : Membuat Pola
*/

#include <iostream>
using namespace std;

int main()
{
int i, j, k, a;
cout << "Input Lebar Roket: ";
cin >> a;
cout << "=====================\n";
cout << " THIS IS YOUR ROCKET \n";
cout << "=====================\n";
cout << endl;

// looping segitiga atas
  for (i = 1; i <= a; i++)
  {
    for (j = i; j < a; j++)
    {
      cout << " ";
    }
    for (k = 1; k <= i; k++)
    {
      cout << "* ";
    }
    cout << endl;
  }
// looping segitiga bawah
  for (i = 1; i < a; i++)
  {
    for (j = 1; j <= i; j++)
    {
      cout << " ";
    }
    for (k = i; k < a; k++)
    {
      cout << "* ";
    }
    cout << endl;
  }
}


/*
for (i = 1; i <= a; i++)
{
    for (j = 1; j <= a-i; j++)
    {
        cout<<" ";
    }
    for (k = 1; k <= i+(i-1); k++)
    {
        cout<<"*";
    }
    cout << endl;
  }
}

for (i = 1; i <= 2*a; i++) 
{
    for(j=1; j <= 2*a-1; j++) 
    {
      cout << "* ";
    }
    cout << endl;
  }
return 0;
}
*/

/*
  for (i = 1; i <= a; i++)
  {
    for (j = 1; j <= a; j++)
    {
      cout << "(" << i << "," << j << ")";
    }
    cout << "\n\n";
  }

  for (i = 1; i <= a; i++)
  {
    for (j = 1; j <= a; j++)
    {
      if (i + j < a+(a-1))
      {
        if ((i+j) % 2 != 0 )
        {
          cout << " ";
        }
      }
      else
      {
        cout << "*";
      }
    }
    cout << endl;
  }
*/

/*

  *
 * *
* * *
 * *
  * 

*/ 

