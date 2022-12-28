import java.util.Scanner;
/*
* Nama      : Rifqi Muhadzib Ahdan
* NPM       : 140810210029
* Kelas     : A
* Tanggal   : 06 November 2022
* Deskripsi : Unchecked exception - ArrayIndexOutOfBoundsException
* ===Kondisi===
* Dithrow untuk menunjukkan bahwa array telah diakses dengan index yang ilegal. 
* Indexnya negatif atau lebih besar dari atau sama dengan ukuran array.
*/

class Test {
    static int size = 3;
    public static void main(String[] args) {
        int[] arrInt = new int[size];

        arrInt = inputArr();
        // plusOne();
    }

    static void plusOne() throws ArrayIndexOutOfBoundsException{
        // Ukuran array = 3
        int intArr[] = {10, 3, -10};
        try {
            // Empat index akan diakses sehingga melebihi ukuran array
            for (int i = 0; i < 4; i++) {
                System.out.println("Data ke-" + (i+1) + " : " + intArr[i]);
        }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException
                ("\nError: Machine mengakses index array melebihi ukuran array\n"
                + e.getMessage());
        }
    }

    static int[] inputArr() throws ArrayIndexOutOfBoundsException{
        Scanner scan = new Scanner(System.in);
        int intArr[] = new int[size];
        try {
            size++; // Increment size agar mengakses index melebihi ukuran array
            for (int i = 0; i < size; i++) {
                System.out.print("Input data ke -" + (i+1) + " : ");
                intArr[i] = scan.nextInt();
            }
            scan.close();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException
                ("\nError: Machine mengakses index array melebihi ukuran array\n"
                + e.getMessage());
        } finally {
            System.out.println("Input Data Selesai"); 
        }
        return intArr;
    }

    
}