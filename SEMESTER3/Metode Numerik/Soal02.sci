// NAMA: Calvin Calfi Montolalu
// NPM: 140810200053

function Soal02()
    clc
    x = 2.2
    h = 0.3
    f0 = 3.78
    fa = 3.22
    fb = 2.65

    printf('\nSoal-02 turunan kedua dari f(2.2)\n')
    printf('\nx0    : %5f',x)
    printf('\nh     : %5f',h)
    printf('\nf0    : %5f',f0)
    printf('\nf(-1) : %5f',fa)
    printf('\nf(-2) : %5f',fb)
    
    printf('\n\nHampiran Beda Mundur\n')
    beda_mundur = (fb-(2*fa)+f0)/(h*h)
    printf('Beda Mundur = %5f',beda_mundur)
    
    printf('\n\nAlasan : Karena nilai x berada diakhir\n')
endfunction
