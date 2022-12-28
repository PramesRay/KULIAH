function bisection ()
  a-input ('masukkan nilai batas bawah .');
  b=input ('masukkan nilai batas atas = ');
  tol-input ('masukkan nilai-toleransi .');
  
  if (f(a) (b)>0)
    printf("\nfunsi-f (a) *f (b), tidak ada akar-pada->>->>- [%d.%d]',a,b);
  else e-abs (a-b);
    printf("\niterasi\ta\t\t\t\t\t\tf (a)\t\tf (b)\t\tf(c)');
  
  while (e>tol)
    c=(a+b)/2;
    fa=f(a);
    fb=1(b);
    fc-f(c);
    
    printf('\n\d\t\.6f\t\.6f\t\.6f\t\.6f\t\.6f\t%.6f',i,a,b,c, fa, fb, fc);
    
    if (fa*fc>0)
      a=c;
    else
      b=c;
    end

  end
  
  printf("\n\nJadi hampiran akarnya adalah .6f', c);
endfunction

function hasil=f(x);
  hasil = exp (x)+3*x;
  printf("\nfungsi Bisection Scilab');
endfunction