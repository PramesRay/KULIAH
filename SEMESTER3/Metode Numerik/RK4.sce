// /**
// * ==================== KELOMPOK 6 ====================
// * +--------------+----------------------------+
// * | NPM          | NAMA LENGKAP               |
// * + ------------ + -------------------------- +
// * | 140810210009 | Ardes Zubka Putra          |
// * | 140810210051 | Satria Alief Putra Hidayat |
// * | 140810210059 | Prames Ray Lapian          |
// * +--------------+----------------------------+
// * Kelas     : A
// * Tanggal   : 17 Desember 2022
// * Tugas     : Example 2 - Metode Runge-Kutta Orde 4 (RK-4)
// **/

function y = yNext(yNow, k1, k2, k3, k4)
    y = yNow + (k1 + 2 * k2 + 2 * k3 + k4)/6
endfunction

function y = dy1(y1, y2, y3, k1, k2)
    y = (y1 * (-1 * k1)) + (k2 * y2 * y3);
endfunction

function y = dy2(y1, y2, y3, k3, k4, k5)
    y = (k3 * y1) + (k4 * y2 * y3) - (k5 * y2^2);
endfunction

function y = dy3(y2, k6)
    y = k6 * y2^2;
endfunction

xArr   = [0];
k1     = 0.04;
k2     = 0.01;
k3     = 400;
k4     = 100;
k5     = 3000;
k6     = 30;
y1Arr  = [1];
y2Arr  = [0];
y3Arr  = [0];
hArr   = [];
errArr = [];

function PDBmulai()
    //Header dan minta input
    printf('\n===== Output Program PDB Metode Runge-Kutta Orde 4 =====  ');
    printf('\n-------------------- Soal Example 2 --------------------\n');
    b  = input('Input nilai x yang akan mencari nilai y(x) : ');
    h  = input('Input nilai h                              : ');
    xI = 0;    
    r  = 1;
    errLok = 0;
    
    printf('n\th\ty1(x)\ty2(x)\ty3(x)\tk1(y1)\tk2(y1)\tk3(y1)\tk4(y1)\tk1(y2)\tk2(y2)\tk3(y2)\tk4(y2)\tk1(y3)\tk2(y3)\tk3(y3)\tk4(y3)\tError\n');
    while(xI < b)
        [h, errLok] = hNext(h, r, (xI + h));
        
        hArr(r)   = h;
        errArr(r) = errLok; 
        
        k1_1 = h * dy1(y1Arr(r), y2Arr(r), y3Arr(r), k1, k2);
        k1_2 = h * dy2(y1Arr(r), y2Arr(r), y3Arr(r), k3, k4, k5);
        k1_3 = h * dy3(y2Arr(r), k6);
    
        k2_1 = h * dy1(y1Arr(r) + k1_1/2, y2Arr(r), y3Arr(r), k1, k2);
        k2_2 = h * dy2(y1Arr(r), y2Arr(r) + k1_2/2, y3Arr(r), k3, k4, k5);
        k2_3 = h * dy3(y2Arr(r), k6);
    
        k3_1 = h * dy1(y1Arr(r) + k2_1/2, y2Arr(r), y3Arr(r), k1, k2);
        k3_2 = h * dy2(y1Arr(r), y2Arr(r) + k2_2/2, y3Arr(r), k3, k4, k5);
        k3_3 = h * dy3(y2Arr(r), k6);
    
        k4_1 = h * dy1(y1Arr(r) + k3_1, y2Arr(r), y3Arr(r), k1, k2);
        k4_2 = h * dy2(y1Arr(r), y2Arr(r) + k3_2, y3Arr(r), k3, k4, k5);
        k4_3 = h * dy3(y2Arr(r), k6);
        
        printf('%d\t%.4f\t%.4f\t%.4f\t%.4f\t%.4f\t%.4f\t%.4f\t%.4f\t%.4f\t%.4f\t%.4f\t%.4f\t%.4f\t%.4f\t%.4f\t%.4f\t%.6f\n', r-1, h, xI, y1Arr(r), y2Arr(r), y3Arr(r), k1_1, k2_1, k3_1, k4_1, k1_2, k2_2, k3_2, k4_2, k1_3, k2_3, k3_3, k4_3, errLok);
        
        xI       = xI + h;
        r        = r + 1;
        xArr(r)  = xI;
        y1Arr(r) = yNext(y1Arr(r-1), k1_1, k2_1, k3_1, k4_1);
        y2Arr(r) = yNext(y2Arr(r-1), k1_2, k2_2, k3_2, k4_2);
        y3Arr(r) = yNext(y3Arr(r-1), k1_3, k2_3, k3_3, k4_3);
    end 
    
    hArr(r)   = hArr(r-1);
    errArr(r) = errArr(r-1);
    
    printf("\nJadi, Nilai y1(%.2f) adalah : %.8f\n", xArr(r-1), y1Arr(r-1));
    printf("\nJadi, Nilai y2(%.2f) adalah : %.8f\n", xArr(r-1), y2Arr(r-1));
    printf("\nJadi, Nilai y3(%.2f) adalah : %.8f\n", xArr(r-1), y3Arr(r-1));
    
    plot2d(xArr, y1Arr, 4);
    plot2d(xArr, y2Arr, 5);
    plot2d(xArr, y3Arr, 6);
    plot2d(xArr, hArr,  3);
    plot2d(xArr, errArr, 9);
    plot2d(xArr, [y1Arr y2Arr y3Arr hArr errArr], [4 5 6 3 9], leg = "y1@y2@y3@h(step)@errLok");
endfunction

// h = step pada iterasi
// r = index untuk akses elemen x dan r
// xTarget = tujuan akhir x

// return h = next h yang dipake
function [hLanjut, errLok] = hNext(h, r, xTarget) 
    // h yang biasa   
    xI = xArr(r);     
    y1 = y1Arr(r);    
    y2 = y2Arr(r);
    y3 = y3Arr(r);

    k1_1 = h * dy1(y1, y2, y3, k1, k2);
    k1_2 = h * dy2(y1, y2, y3, k3, k4, k5);
    k1_3 = h * dy3(y2, k6);

    k2_1 = h * dy1(y1 + k1_1/2, y2, y3, k1, k2);
    k2_2 = h * dy2(y1, y2 + k1_2/2, y3, k3, k4, k5);
    k2_3 = h * dy3(y2, k6);

    k3_1 = h * dy1(y1 + k2_1/2, y2, y3, k1, k2);
    k3_2 = h * dy2(y1, y2 + k2_2/2, y3, k3, k4, k5);
    k3_3 = h * dy3(y2, k6);

    k4_1 = h * dy1(y1 + k3_1, y2, y3, k1, k2);
    k4_2 = h * dy2(y1, y2 + k3_2, y3, k3, k4, k5);
    k4_3 = h * dy3(y2, k6);

    y1_1 = yNext(y1, k1_1, k2_1, k3_1, k4_1);
    y2_1 = yNext(y2, k1_2, k2_2, k3_2, k4_2);
    y3_1 = yNext(y3, k1_3, k2_3, k3_3, k4_3);
    
    // h yang dibagi dua
    xI   = xArr(r);
    y1_2 = y1Arr(r);
    y2_2 = y2Arr(r);
    y3_2 = y3Arr(r);
    h    = h/2;

    while (xI < xTarget) 
        k1_1 = h * dy1(y1, y2, y3, k1, k2);
        k1_2 = h * dy2(y1, y2, y3, k3, k4, k5);
        k1_3 = h * dy3(y2, k6);
    
        k2_1 = h * dy1(y1 + k1_1/2, y2, y3, k1, k2);
        k2_2 = h * dy2(y1, y2 + k1_2/2, y3, k3, k4, k5);
        k2_3 = h * dy3(y2, k6);
    
        k3_1 = h * dy1(y1 + k2_1/2, y2, y3, k1, k2);
        k3_2 = h * dy2(y1, y2 + k2_2/2, y3, k3, k4, k5);
        k3_3 = h * dy3(y2, k6);
    
        k4_1 = h * dy1(y1 + k3_1, y2, y3, k1, k2);
        k4_2 = h * dy2(y1, y2 + k3_2, y3, k3, k4, k5);
        k4_3 = h * dy3(y2, k6);

        y1 = yNext(y1, k1_1, k2_1, k3_1, k4_1);
        y2 = yNext(y2, k1_2, k2_2, k3_2, k4_2);
        y3 = yNext(y3, k1_3, k2_3, k3_3, k4_3);

        xI = xI + h;
    end

    e1 = abs(y1_1 - y1_2);
    e2 = abs(y2_1 - y2_2);
    e3 = abs(y3_1 - y3_2);
    eFinal = 0;

    if e1 > e2 then
        if e1 > e3 then
            eFinal = e1;
        else
            eFinal = e3;
        end
    else 
        if e2 > e3 then
            eFinal = e2;
        else
            eFinal = e3;
        end
    end

    if eFinal > 0.01 then
        [hLanjut,errLok] = hNext(h, r, (xTarget-h));
    elseif eFinal < 0.0001 then
        [hLanjut,errLok] = hNext(h*4, r, (xTarget+(h*2)));
    else
        hLanjut = h*2;
        errLok = eFinal;
    end
endfunction
