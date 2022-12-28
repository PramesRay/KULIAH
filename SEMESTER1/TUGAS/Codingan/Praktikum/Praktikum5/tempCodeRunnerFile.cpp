#include <iostream>
using namespace std;

int main()
{
	int s, n, bil;
    cout << "=== PROGRAM BILANGAN PRIMA ===\n"
         << "Input angka mulai: ";
    cin >> s;
	cout << "Input angka maksimal: ";
	cin >> n;

	for (int i = s; i <= n; i++)
    {
		bil = 0;
		for (int j = 1; j <= i; j++)
        {
			if (i % j == 0)
            {
				bil = bil + 1;
			}
		}
		if (bil == 2)
		cout << i <<" ";
	}
}