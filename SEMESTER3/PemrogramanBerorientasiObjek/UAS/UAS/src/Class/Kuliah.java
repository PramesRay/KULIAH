/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.sql.*;

/**
 *
 * @author prame
 */
public class Kuliah {
    private String kode;
    private String nama;
    private int sks;
    private int semester;

    public Kuliah() {
      this.kode = null;
      this.nama = null;
      this.sks = 0;
      this.semester = 0;
    }

    public String getKode() {
      return kode;
    }

    public void setKode(String kode) {
      this.kode = kode;
    }

    public String getNama() {
      return nama;
    }

    public void setNama(String nama) {
      this.nama = nama;
    }

    public int getSks() {
      return sks;
    }

    public void setSks(int sks) {
      this.sks = sks;
    }

    public int getSemester() {
      return semester;
    }

    public void setSemester(int semester) {
      this.semester = semester;
    }
    
    public void insertKuliah(){ 
        Koneksi kon = new Koneksi();
        String s = "INSERT INTO kuliah VALUES('"               + 
                                                this.kode      + "','" + 
                                                this.nama      + "', '"+ 
                                                this.sks       + "', '"+ 
                                                this.semester  + "')";
        kon.query(s); 
    }
    
    public void updateKuliah(){ 
        Koneksi kon = new Koneksi();
        String s = "UPDATE kuliah SET kode_kul = '" + this.kode     + 
                                  "', nama_kul = '" + this.nama     + 
                                       "', sks = '" + this.sks      + 
                                  "', semester = '" + this.semester + 
                             "' WHERE kode_kul = '" + this.kode     + "'";
        kon.query(s); 
    }
    
    public void deleteKuliah(){ 
        Koneksi kon = new Koneksi();
        String s = "DELETE FROM kuliah WHERE kode_kul = '"+ this.kode+ "'";
        kon.query(s);
    } 
    
    public ResultSet getKuliah(){ 
        ResultSet r = null; 
        Koneksi kon = new Koneksi();
        String s = "INSERT INTO kuliah VALUES('"               + 
                                                this.kode      + "','" + 
                                                this.nama      + "', '"+ 
                                                this.sks       + "', '"+ 
                                                this.semester  + "')";
        kon.query(s); 
        return r;
    }
}
