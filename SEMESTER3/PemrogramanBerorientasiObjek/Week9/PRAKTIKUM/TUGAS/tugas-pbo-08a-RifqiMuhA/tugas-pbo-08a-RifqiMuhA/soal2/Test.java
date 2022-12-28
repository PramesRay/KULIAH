import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable; // Buka komen implements serializable
import java.io.NotSerializableException;

/*
* Nama      : Rifqi Muhadzib Ahdan
* NPM       : 140810210029
* Kelas     : A
* Tanggal   : 06 November 2022
* Deskripsi : Checked exception - NotSerializableException
* ===Serialize===
* Serialisasi adalah mekanisme untuk mengubah keadaan suatu objek menjadi aliran byte. 
* Deserialisasi adalah proses sebaliknya di mana aliran byte digunakan untuk membuat ulang objek Java yang sebenarnya dalam memori. 
* Mekanisme ini digunakan untuk mempertahankan objek yang biasanya karena object dengan isi yang sama akan di re-create
* ===NotSerializableException===
* Dithrow ketika sebuah instance diperlukan untuk memiliki interface Serializable. 
* Sehingga selama proses serialization (write object) dan De-serialization (read object) "NotSerializableException" terjadi karena 2 kasus :
* 1. Saat mencoba me-serilize sebuah object, object belum mengimplement serialize
* 2. Saat mencoba me-deserilize sebuah object, object belum mengimplement serialize
* Dua hal tersebut terjadi saat writeObject() dan readObject() method dilakukan
*/

class Hewan implements Serializable {
    private int kepala;

    public Hewan(int kepala) {
        this.kepala = kepala;
    }

    public void setKepala(int kepala) {
        this.kepala = kepala;
    }

    public int getKepala(){
        return this.kepala;
    }
}

class Test {
    public static void main(String[] args) throws Exception{
        try {
            Hewan s1 = new Hewan(007);
 
            // Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("TestFile.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
 
            out.writeObject(s1);
            out.flush();
 
            out.close();
            
            System.out.println("Object berhasil distore ke txt");
        } catch (NotSerializableException e) {
            System.out.println("Object tidak berhasil distore ke txt >> Terjadi Error");
            System.out.println(e.getClass() + " : " + e.getMessage());
        }
    }
}