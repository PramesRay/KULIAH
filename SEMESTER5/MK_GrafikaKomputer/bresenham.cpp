#include<iostream>
#include<math.h>
using namespace std;

int main()
{
    int dx, dy, p, end;
    float x1, x2, y1, y2, x, y;

    x1 = x2 = y1 = y2 = x = y = p = end = dx = dy = 0;

    cout << "[ BRESENHAM ALGORITHM ]" << endl << endl;
    cout << "Input (x1 y1) value : ";
    cin >> x1 >> y1;
    cout << "Input (x2 y2) value : ";
    cin >> x2 >> y2;

    dx = abs(x1 - x2);
    dy = abs(y1 - y2);
    p = 2 * dy - dx;

    if(x1 > x2)
    {
        x = x2;
        y = y2;
        end = x1;
    }
    else
    {
        x = x1;
        y = y1;
        end = x2;
    }

    cout << endl << "Coordinates :" << endl;
    cout << "(" << x << ", " << y << ")";
    while(x < end)
    {
        if (x1 > x2)
        {
            x = x - 1;
        }
        else
        {
            x = x + 1;
        }

        if(p < 0)
        {
            p = p + 2 * dy;
        }
        else
        {
            if (x1 > x2)
            {
                y = y - 1;
            }
            else
            {
                y = y + 1;
            }
            p = p + 2 * (dy - dx);
        }

        cout << endl << "(" << x << ", " << y << ")";
    }
    cout << endl;
}