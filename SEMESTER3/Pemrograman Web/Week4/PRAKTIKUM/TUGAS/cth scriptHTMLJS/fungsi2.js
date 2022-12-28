function convertToRupiah(angka)
{
	var rupiah = '';		
	var angkarev = angka.toString().split('').reverse().join('');
	for(var i = 0; i < angkarev.length; i++) if(i%3 == 0) rupiah += angkarev.substr(i,3)+'.';
	return 'Rp. '+rupiah.split('',rupiah.length-1).reverse().join('');
}

function jml_total()
     {
         var tot1=document.barang.jml1.value*document.barang.hrg1.value;
         var tot2=document.barang.jml2.value*document.barang.hrg2.value;
         var tot3=document.barang.jml3.value*document.barang.hrg3.value;
         var tot4=document.barang.jml4.value*document.barang.hrg4.value;
         var tot5=document.barang.jml5.value*document.barang.hrg5.value;
         return (tot1+tot2+tot3+tot4+tot4+tot5);    
      }
  
function hrg_diskon()
{
    var total=jml_total()
    if(total>=300000)
        {
         total=total*0.05;    
        }
    else
        {
         total=0;    
        }
     return total;
}
    
function total_bayar()
{
    return (jml_total()-hrg_diskon());
    
}


function tampil()
          {
              document.getElementById("tot1").innerHTML=convertToRupiah(document.barang.jml1.value*document.barang.hrg1.value);
              document.getElementById("tot2").innerHTML=convertToRupiah(document.barang.jml2.value*document.barang.hrg2.value);
              document.getElementById("tot3").innerHTML=convertToRupiah(document.barang.jml3.value*document.barang.hrg3.value);
              document.getElementById("tot4").innerHTML=convertToRupiah(document.barang.jml4.value*document.barang.hrg4.value);
              document.getElementById("tot5").innerHTML=convertToRupiah(document.barang.jml5.value*document.barang.hrg5.value);
              document.getElementById("hrg_diskon").innerHTML= convertToRupiah(hrg_diskon());
              document.getElementById("tot_hrg").innerHTML=convertToRupiah(jml_total());          
              document.getElementById("bayar").innerHTML=convertToRupiah(jml_total()-hrg_diskon());
          }