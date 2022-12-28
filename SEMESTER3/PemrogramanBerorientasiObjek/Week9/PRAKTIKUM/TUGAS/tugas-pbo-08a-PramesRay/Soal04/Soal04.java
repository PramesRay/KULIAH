import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable; 
import java.io.NotSerializableException;
/*
 * =======================================================================================
 * Nama   : Prames Ray Lapian
 * NPM    : 140810210059
 * Kelas  : A
 * Tanggal: 7 November 2022
 * =======================================================================================
 * [PENJELASAN]
 * NotSerializableException merupaka suatu Exception yang mana ketika sebuah instance 
 * diperlukan untuk memiliki interface Serializable. Sehingga selama proses 
 * serialization (write object) dan De-serialization (read object). Exception ini 
 * terjadi karena 2 kasus :
 *    1. Saat mencoba me-serilize sebuah object, object belum mengimplement serialize
 *    2. Saat mencoba me-deserilize sebuah object, object belum mengimplement serialize
 * Dua hal tersebut terjadi saat writeObject() dan readObject() method dilakukan
 * =======================================================================================
 */

class Document /*implements Serializable*/ {
  private String text;

  public Document(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
  
}

public class Soal04 {
  public static void main(String[] args) throws Exception{
    Document doc = new Document("TES...123...TES...");

    // Creating stream and writing the object
    FileOutputStream fout = new FileOutputStream("File.txt");
    ObjectOutputStream out = new ObjectOutputStream(fout);

    out.writeObject(doc);
    out.flush();

    out.close();
    
    System.out.println("Object berhasil disimpan ke File.txt");
  }
}
