/*
* Nama    : Rifqi Muhadzib Ahdan
* NPM     : 140810210029
* Kelas   : A
* Program : SPL dengan dekomposisi LU
**/

A = input("Input matriks A (matriks koefisien): ");
B = input("Input matriks B (matriks konstanta): ");

// Asign n dgn panjang matriks/array konstanta 
n = length(B);

// Inisiasi matriks L dan U dengan 0
L = zeros(n, n);
U = zeros(n, n);

//-----Proses A = LU
// Assign diagonal utama matriks U dengan 1
for i = 1:n
    U(i, i) = 1;
end
// Assign semua elemen di kolom 1 mat L dengan elemen di kolom 1 mat A
L(:, 1) = A(:, 1);
// Assign baris 1 mat U
U(1, :) = A(1, :) / L(1, 1);

for i = 2:n
    // Assign kolom 2 dan seterusnya dari mat L
    for j = i:n // j = baris; i = kolom
        L(j, i) = A(j, i) - (L(j, 1:i-1)*U(1:i-1 ,i));
    end
    // Assign baris 2 dan seterusnya dari mat U
    for k = i+1:n // k = kolom (Dari kolom 3 karena kolom 2 baris 2 sudah diassign dengan 1); i = baris
        U(i, k) = (A(i, k)-L(i, 1:i-1)*U(1:i-1,k))/L(i, i);
    end
end

//-----Proses LY = B --> Y = B/L
Y = zeros(n, 1);
Y(1) = B(1)/L(1,1);
for i = 2:n
    Y(i) = (B(i)-(L(i,1:i-1)*Y(1:i-1))) / L(i,i); 
end 

//-----Proses UX = Y --> X = Y/U
X = zeros(n, 1);
X(n) = Y(n)/U(n, n);
for i = n-1:-1:1
    X(i) = (Y(i) - (U(i,i+1:n)*X(i+1:n))) / U(i,i);
end
