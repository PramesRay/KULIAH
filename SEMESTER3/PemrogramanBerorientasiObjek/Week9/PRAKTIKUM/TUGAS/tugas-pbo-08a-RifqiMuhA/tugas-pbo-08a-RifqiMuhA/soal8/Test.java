/*
* Nama      : Rifqi Muhadzib Ahdan
* NPM       : 140810210029
* Kelas     : A
* Tanggal   : 06 November 2022
* Deskripsi : Unchecked exception - NegativeArraySizeException
* ===Condition===
* Dithrow ketika aplikasi mencoba membuat array dengan ukuran negatif
*/

class Test {
    public static void main(String[] args) throws NegativeArraySizeException{
        try {
            System.out.println("===PROSES INSTANSIASI ARRAY===");
            int[] arrInt1 = new int[2];
            System.out.println("Array 1 berhasil di instansiasi");
            int[] arrInt2 = new int[-1];
            System.out.println("Array 2 berhasil di instansiasi");
        } catch (NegativeArraySizeException e) {
            System.out.println("Error : index array mencoba membuat ukuran array negatif");
            e.printStackTrace();
        }
    }
}