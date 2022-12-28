/*
* Nama      : Prames Ray Lapian
* NPM       : 59
* Kelas     : A
* Tanggal   : 12 September 2022
* Deskripsi : Class jawaban exercise-01 soal-02
*/

public class Manusia {
  //variable
  private String nama;
  private String npm;
  
  //constructor
  public Manusia() {
    this.nama = "Manusia";
    this.npm = "140810210000";
  }

  //setter
  public void setnama(String nama) {
    this.nama = nama;
  }
  public void setnpm(String npm) {
    this.npm = npm;
  }

  //getter
  public String getnama(){
    return this.nama;
  }
  public String getnpm(){
    return this.npm;
  }
}