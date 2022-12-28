function hasil = galat(n, x)
    hasil = abs((taylor(n+1, x) - taylor(n,x)) / taylor(n+1,x)) * 100;
endfunction
