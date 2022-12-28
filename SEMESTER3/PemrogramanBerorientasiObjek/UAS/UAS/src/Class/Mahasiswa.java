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
public class Mahasiswa {
    private String npm;
    private String nama;
    private String jk;
    private String tgl; private String bln; private String thn;
    private String telp;
    private String alamat;

    public Mahasiswa() {
      this.npm = null;
      this.nama = null;
      this.jk = null;
      this.tgl = null;
      this.bln = null;
      this.thn = null;
      this.telp = null;
      this.alamat = null;
    }

    public void setNpm(String npm){
      this.npm = npm;
    }
    public void setNama(String nama){
      this.nama = nama;
    }
    public void setJk(String jk){
      this.jk = jk;
    }
    public void setTgl(String tgl){
      this.tgl = tgl;
    }
    public void setBln(String bln){
      this.bln = bln;
    }
    public void setThn(String thn){
      this.thn = thn;
    }
    public void setTelp(String telp){
      this.telp = telp;
    }
    public void setAlamat(String alamat){
      this.alamat = alamat;
    }

    public String getNpm(String npm){
      return this.npm;
    }
    public String getNama(String nama){
      return this.nama;
    }
    public String getJk(String jk){
      return this.jk;
    }
    public String getTgl(String tgl){
      return this.tgl;
    }
    public String getBln(){
      return this.bln;
    }
    public String getThn(){
      return this.thn;
    }
    public String getTelp(String telp){
      return this.telp;
    }
    public String getAlamat(String alamat){
      return this.alamat;
    }
    
    public void insertMahasiswa(){ 
        Koneksi kon = new Koneksi();
        String s = "INSERT INTO mahasiswa VALUES ('"        + 
                                                    this.npm    + "', '"   + 
                                                    this.nama   + "', '"   + 
                                                    this.jk     + "', '"   + 
                                                    this.thn    + "-" + this.bln + "-" + this.tgl   + "', '" +
                                                    this.telp   + "', '"   + 
                                                    this.alamat + "')";
        kon.query(s);
    }
    
    public void updateMahasiswa(){
        Koneksi kon = new Koneksi();
        String s = "UPDATE mahasiswa SET npm  = '" + this.npm       + 
                                 "', nama_mhs = '" + this.nama      + 
                            "', jenis_kelamin = '" + this.jk        + 
                                "', tgl_lahir = '" + this.thn       + "-" + this.bln + "-" + this.tgl   +
                                  "', no_telp = '" + this.telp      + 
                                   "', alamat = '" + this.alamat    +
                                 "' WHERE npm = '" + this.npm       + "'";
        kon.query(s);
    }
    
    public void deleteMahasiswa(){
        Koneksi kon = new Koneksi();
        String s = "DELETE FROM mahasiswa WHERE npm = '" + this.npm + "'";
        kon.query(s);
    }
    
    public ResultSet getMahasiswa(){
        ResultSet r = null;
        Koneksi kon = new Koneksi();
        String s = "INSERT INTO mahasiswa VALUES ('"            + 
                                                    this.npm    + "', '"   + 
                                                    this.nama   + "', '"   + 
                                                    this.jk     + "', '"   + 
                                                    this.thn    + "-" + this.bln + "-" + this.tgl   + "', '" + 
                                                    this.telp   + "', '"   + 
                                                    this.alamat + ")";
        kon.query(s);
        return r;
    }
}
