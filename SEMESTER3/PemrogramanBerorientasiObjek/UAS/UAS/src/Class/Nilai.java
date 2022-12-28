/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.sql.ResultSet;

/**
 *
 * @author prame
 */
public class Nilai {
    private String npm;
    private String kode;
    private int nilai;

    public Nilai() {
      this.npm = null;
      this.kode = null;
      this.nilai = 0;
    }

    public String getNpm() {
      return npm;
    }

    public void setNpm(String npm) {
      this.npm = npm;
    }

    public String getKode() {
      return kode;
    }

    public void setKode(String kode) {
      this.kode = kode;
    }

    public int getNilai() {
      return nilai;
    }

    public void setNilai(int nilai) {
      this.nilai = nilai;
    }
    
    public void insertNilai(){ 
        Koneksi kon = new Koneksi();
        String s = "INSERT INTO nilai_kuliah VALUES('"             + 
                                                this.npm    + "','" + 
                                                this.kode   + "', '"+ 
                                                this.nilai  + "')";
        kon.query(s); 
    }
    
    public void updateNilai(){ 
        Koneksi kon = new Koneksi();
        String s = "UPDATE nilai_kuliah SET kode_kul = '" + this.kode     + 
                                            "', npm = '" + this.npm      + 
                                          "', nilai = '" + this.nilai    + 
                                  "' WHERE kode_kul = '" + this.kode     +  
                                         "' AND npm = '" + this.npm      + "'";
        kon.query(s); 
    }
    
    public void deleteNilai(){ 
        Koneksi kon = new Koneksi();
        String s = "DELETE FROM nilai_kuliah WHERE kode_kul = '"+ this.kode+  
                                                 "' AND npm = '" + this.npm      + "'";
        kon.query(s);
    } 
    
    public ResultSet Nilai(){ 
        ResultSet r = null; 
        Koneksi kon = new Koneksi();
        String s = "INSERT INTO nilai_kuliah VALUES('"             + 
                                                this.npm    + "','" + 
                                                this.kode   + "', '"+ 
                                                this.nilai  + "')";
        kon.query(s); 
        return r;
    }
}
