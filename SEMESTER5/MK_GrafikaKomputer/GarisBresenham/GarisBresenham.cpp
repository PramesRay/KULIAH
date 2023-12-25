#include<iostream>
#include<math.h>
using namespace std;

int main()
{
  int dx, dy, p, end;
  float x1, x2, y1, y2, x, y;

  x1 = x2 = y1 = y2 = x = y = p = end = dx = dy = 0;

  cout << "BRESENHAM" << endl << endl;

  cout << "x1 : ";
  cin >> x1;
  cout << "y1 : ";
  cin >> y1;
  cout << "x2 : ";
  cin >> x2;
  cout << "y2 : ";
  cin >> y2;
  

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
    x = x + 1;

    if(p < 0)
    {
      p = p + 2 * dy;
    }
    else
    {
      y = y + 1;
      p = p + 2 * (dy - dx);
    }

    cout << endl << "(" << x << ", " << y << ")";
  }
  cout << endl << endl << "There u go!" << endl << endl;

  system("pause");
}