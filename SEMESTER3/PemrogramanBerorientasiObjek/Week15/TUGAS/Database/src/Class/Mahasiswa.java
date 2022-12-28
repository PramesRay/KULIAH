/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author prame
 */
public class Mahasiswa {
    private String npm;
    private String nama;
    private String jenkel;
    private String prodi;
    private String alamat;
    
    public Mahasiswa() {
      this.npm = "";
      this.nama = "";
      this.jenkel = "";
      this.prodi = "";
      this.alamat = "";
    }
    public Mahasiswa(String npm, String nama, String jenkel, String prodi, String alamat) {
      this.npm = npm;
      this.nama = nama;
      this.jenkel = jenkel;
      this.prodi = prodi;
      this.alamat = alamat;
    }

    public void setNpm(String npm) {
      this.npm = npm;
    }
    public void setNama(String nama) {
      this.nama = nama;
    }
    public void setJenkel(String jenkel) {
      this.jenkel = jenkel;
    }
    public void setProdi(String prodi) {
      this.prodi = prodi;
    }
    public void setAlamat(String alamat) {
      this.alamat = alamat;
    }

    public String getNpm() {
      return npm;
    }
    public String getNama() {
      return nama;
    }
    public String getJenkel() {
      return jenkel;
    }
    public String getProdi() {
      return prodi;
    }
    public String getAlamat() {
      return alamat;
    }
    
    public String insertMahasiswa(){
        Koneksi kon = new Koneksi();
        String s =  "INSERT INTO mahasiswa VALUES ('"+this.npm+
                    "','"+nama+
                    "','"+jenkel+
                    "','"+prodi+
                    "')";
        kon.query(s);
        return(s);
    }
    
    public String updateMahasiswa(){ // boleh juga void
        Koneksi kon = new Koneksi();
        String s = "UPDATE mahasiswa SET nama='"+nama+"',"+ 
                                      "jenkel='"+jenkel+"',"+ 
                                       "prodi='"+prodi+"'"+
                                  " WHERE npm='"+npm+"'";
        kon.query(s);
        return(s);
    }
    
    public String deleteMahasiswa(){ //boleh juga void
        Koneksi kon = new Koneksi();
        String s = "DELETE FROM mahasiswa WHERE npm = '"+npm+"'";
        kon.query(s);
        return(s);
    }
}
