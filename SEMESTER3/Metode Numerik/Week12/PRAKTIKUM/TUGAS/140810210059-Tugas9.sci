/*
* Nama    : Prames Ray Lapian
* NPM     : 140810210059
* Kelas   : A
* Tanggal : 24 November 2022
* Program : Runge Kutta Orde 3
**/
clear;
clc;

function turunan = f(x,y)
    turunan = x+y
endfunction

printf("%s\n", "[INPUT]");
b = input   ("Input x yang akan dicari y(x)-nya : ");
h = input   ("Input nilai h                     : ");
x0 = input  ("Input nilai x0                    : ");
y0 = input  ("Input nilai y0                    : ");

// Jumlah iterasi
n = (b - x0)/h; 

printf("%s\n", "[OUTPUT]");

// Iterasi 0
x = x0;
y = y0;
k1 = h * f(x,y);
k2 = h * f((x+(h/2)), (y+(k1/2)));
k3 = h * f((x+h), (y-k1+(2*k2)));
printf("%3s%15s%15s%15s%15s%15s\n", "r", "x", "y", "k1", "k2", "k3");
printf("%3d%15.2f%15.6f%15.6f%15.6f%15.6f\n", 0, x, y, k1, k2, k3);

//Iterasi 1 sampai n
for i = 1:n
    y = y + (k1 + (4*k2) + k3)/6;
    x = x + h;
    k1 = h * f(x,y);
    k2 = h * f(x+(h/2), y+(k1/2));
    k3 = h * f(x+h, y-k1+(2*k2));
    printf("%3d%15.2f%15.6f%15.6f%15.6f%15.6f\n", i, x, y, k1, k2, k3);
end
