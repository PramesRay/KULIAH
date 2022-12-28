 function konversi(mutu) {
       switch(mutu){
        case "A":
            return 4;
            break;
        case "B":
            return 3;
            break;
        case "C":
            return 2;
            break;
        case "D":
            return 1;
            break;
        default:
            return 0;    
        }
     }    
          
     function hitung_sks(a,b,c,d,e)
        {
         return (a+b+c+d+e); 
        }
  
     function hitung_IP()
     {
         var n1=2* konversi(document.kks.nil1.value);
         var n2=2* konversi(document.kks.nil2.value);
         var n3=3* konversi(document.kks.nil3.value);
         var n4=3* konversi(document.kks.nil4.value);
         var n5=3* konversi(document.kks.nil5.value);
         var ip= (n1+n1+n3+n4+n5)/hitung_sks(2,2,3,3,3); 
         return ip.toFixed(2);
  
    }      
     function tampil()
          {
              document.kks.jml_kul.value=5;
              document.kks.jml_sks.value=hitung_sks(2,2,3,3,3);          
              document.kks.ip.value=hitung_IP();
          }