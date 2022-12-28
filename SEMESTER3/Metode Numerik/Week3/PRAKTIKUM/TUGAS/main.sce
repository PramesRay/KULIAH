function hasil=f(x)
  hasil = x^2 - 7*x + 5;
endfunction
function hasil=turunF(x)
  hasil = 2*x - 7;
endfunction
function hasil=xNext(x)
  hasil = x - (f(x)/turunF(x));
endfunction
 
function mainProses()
  a = input('Masukan tebakan pertama : ');
  e = input('Masukan galat : ');
  i = 0;
  
  printf('\niterasi\txi\t\t\tf(xi)\t\t\tturunan f(xi)\t\txi+1')
  
  while(f(a) >= e)
    printf('\n%d\t%.4e\t\t%.4e\t\t%.4e\t\t%.4e', i, a, f(a), turunF(a), xNext(a));
    a = xNext(a);
    i = i+1;
  end
  
  printf('\n%d\t%.4e\t\t%.4e\t\t%.4e\t\t%.4e', i, a, f(a), turunF(a), xNext(a));
  printf('\nJadi, hampiran akarnya adalah %8f', a);
endfunction
