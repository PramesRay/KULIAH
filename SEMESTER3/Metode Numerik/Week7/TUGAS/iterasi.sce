function hasil = iterasi(x)
    tol= (10^-6) / 100;
    it = 2;
    temp = 10;
    while temp > tol
        if(modulo(it, 2) == 0) then
            temp = galat(it, x);
        end
        it = it+1;
    end
    hasil = it-1;
endfunction
