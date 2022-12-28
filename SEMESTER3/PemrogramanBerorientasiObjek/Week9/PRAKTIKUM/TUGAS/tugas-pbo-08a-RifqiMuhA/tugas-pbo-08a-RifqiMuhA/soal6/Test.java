/*
* Nama      : Rifqi Muhadzib Ahdan
* NPM       : 140810210029
* Kelas     : A
* Tanggal   : 06 November 2022
* Deskripsi : Unchecked exception - NullPointerException
* === Definisi===
* NullPointerException adalah runtime exception di Java yang terjadi 
* ketika variabel diakses yang tidak menunjuk ke objek apa pun dan merefers ke null. 
* ===Kondisi===
* Karena NullPointerException adalah runtime exception, tidak perlu ditangkap 
*   dan ditangani secara eksplisit dalam kode aplikasi.
*/

class Test {
    public static void main(String[] args) throws NullPointerException{
        String a = "First";
        String b = "Second";
        String c = null;

        try {
            System.out.println("===Panjang String===");
            System.out.println("a\t: " + a.length());
            System.out.println("b\t: " + b.length());
            System.out.println("c\t: " + c.length());
        } catch (NullPointerException e) {
            throw new NullPointerException
                ("\nError : Terjadi pengaksesan null pointer\n"
                + e.getMessage());
        }
    }
}