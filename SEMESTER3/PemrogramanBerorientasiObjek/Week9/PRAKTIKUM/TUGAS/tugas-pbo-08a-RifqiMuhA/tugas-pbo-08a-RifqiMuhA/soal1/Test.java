/*
* Nama      : Rifqi Muhadzib Ahdan
* NPM       : 140810210029
* Kelas     : A
* Tanggal   : 1 November 2022
* Deskripsi : Checked exception - InvalidClassException
* InvalidClassException akan di"throw" saat terjadi salah satu dari 4 kondisi di bawah :
* > Versi serial kelas tidak cocok dengan deskriptor kelas yang dibaca dari stream
* > Kelas berisi tipe data yang tidak diketahui
* > Kelas tidak memiliki konstruktor no-arg yang dapat diakses
* > ObjectStreamClass dari konstanta enum tidak mewakili (untuk ENUM type) 
**/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {

		String fileName = "mhs.txt";
	    // serializeObject(fileName);
		deserializeObject(fileName);
		
	}

    private static void serializeObject(String fileName) {
        Mhs mhs1 = new Mhs();
        mhs1.setId(1001);
        mhs1.setNama("Rifqi Muh");
        try {
            FileOutputStream fileOutput = new FileOutputStream(fileName);
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
            objectOutput.writeObject(mhs1);
            objectOutput.close();
            fileOutput.close();
            System.out.println("Object mhs1 sudah diserialize di file mhs.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	private static void deserializeObject(String fileName) {
		try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			Mhs mhs1 = (Mhs) objectIn.readObject();
			System.out.println("Object mhs telah dideserialize");
			System.out.println("ID\t:" + mhs1.getId());
            System.out.println("Nama\t:" + mhs1.getNama());
		} catch (Exception e) {
            System.out.println("Error : serialVersionUID tidak match!");
			System.out.println(e.getClass() + " : " + e.getMessage());
		}
	}

}
