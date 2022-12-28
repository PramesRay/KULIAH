import java.util.Scanner;
/*
* Nama      : Rifqi Muhadzib Ahdan
* NPM       : 140810210029
* Kelas     : A
* Tanggal   : 06 November 2022
* Deskripsi : Unchecked exception - NumberFormatException
* ===Kondisi===
* NumberFormatException terjadi ketika upaya dilakukan untuk mengubah string dengan format yang tidak tepat menjadi nilai numerik. 
* Itu berarti, ketika tidak mungkin untuk mengonversi string dalam tipe numerik apa pun (float, int, dll), exception ini akan dithrow. 
* Exception ini termasuk exception Runtime.
*/
class Test {
    public static void main(String[] args) throws NumberFormatException{
        // Contoh assign value ke int
        int number;

        String[] input = {"  1", "12,3", "3"};
        int i = 0;

        while (true) {
            System.out.println("Percobaan assign value : " + input[i]);
            try {
                number = Integer.parseInt(input[i]);
                System.out.println("Input berhasil! Angkamu adalah : " + number);
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Error : Format angka koma tidak memenuhi");
                e.printStackTrace();
            }
            i++;
        }
    }
}