function hasil = taylor(n, x)
    hasil=0;
    for i=0:n
        if(modulo(i+1, 4) == 0) then
            hasil = hasil - (1.22^  i) / factorial(i);
        else if(modulo(i+1, 2) == 0) then
            hasil = hasil + (1.22^i) / factorial(i);
            end
        end
    end
endfunction
