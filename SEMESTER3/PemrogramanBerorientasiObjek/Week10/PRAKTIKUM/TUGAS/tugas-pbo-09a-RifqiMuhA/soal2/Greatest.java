/*
* Nama      : Rifqi Muhadzib Ahdan
* NPM       : 140810210029
* Kelas     : A
* Tanggal   : 12 November 2022
* Deskripsi : Generic Class
* ===CLASS GENERIC===
* Adalah item(variabel) atau fungsi di kelas itu dapat digeneralisasi dengan suatu parameter (contoh T) 
* yang menandakan bahwa paramter tersebut dapat diganti dengan tipe apa pun sebagai parameter dengan tipe data T 
* seperti Integer, Character, String, Double atau Object lainnya.
*/
import java.util.List;
import java.util.LinkedList;

/*
 * @param
 *  V : Tipe data apapun yang menandakan nama list
 *  T : Tipa data apapun selama bisa dicompare
 * @function
 *  cekGreatest : Fungsi untuk cek element terbesar dari anggota list bilList
 */
class ListAngka<V, T extends Comparable<T>>{
    private V namaList;
    private List<T> bilList;

    public ListAngka(V namaList){
        this.namaList = namaList;
    }
    public V getNamaList() {
        return namaList;
    }
    public List<T> getBilList() {
        return bilList;
    }
    public void setNamaList(V namaList) {
        this.namaList = namaList;
    }
    public void setBilList(List<T> bilList) {
        this.bilList = bilList;
    }

    /*
     * @return
     *  T : Tipe data apapun yang merupakan elemen terbesar dari list
     */
    public T cekGreatest(){
        T terbesar = bilList.get(0);
        for (T element : bilList) {
            if(element.compareTo(terbesar) > 0) terbesar = element;
        }
        return terbesar;
    }
    
}

public class Greatest {
    public static void main(String[] args) {
        ListAngka<String, Integer> classList = new ListAngka<>("List Nilai");

        List<Integer> listInteger = new LinkedList<Integer>();
        listInteger.add(1);
        listInteger.add(4);
        listInteger.add(21);
        listInteger.add(100);
        listInteger.add(121);
        listInteger.add(14);
        listInteger.add(52);

        classList.setBilList(listInteger);
        System.out.println(classList.getNamaList());
        System.out.println("Isi list\t   : " + classList.getBilList());
        System.out.println("Elemen terbesar\t   : " + classList.cekGreatest());
    }
}
