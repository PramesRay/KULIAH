#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "Masukkan tinggi segitiga: "; cin >> n;
    for (int i = 1; i <= n; i++)
    {
        for (int j = i; j <= n; j++)
        {
            cout << "  ";
        }

        for (int k = i; k < i*2; k++)
        {
            cout << k << " ";
        }

        if (i == 1)
        {
        for (int k = i*2-1; k > i; k--)
        {
            cout << k-1 << " ";
        }
        }
        cout << endl;
    }

}
