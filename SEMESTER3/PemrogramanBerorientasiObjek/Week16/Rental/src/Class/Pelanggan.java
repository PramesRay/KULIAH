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
public class Pelanggan {
    private String id; 
    private String nama; 
    private String alamat; 
    private String cp; 
    private String status;
    
    public Pelanggan(){
    }
    
    public void setId(String id){
        this.id = id; 
    } 
    
    public void setNama(String nama){ 
        this.nama = nama; 
    } 
    
    public void setAlamat(String alamat){ 
        this.alamat = alamat; 
    } 
    
    public void setCp(String cp){
        this.cp = cp; 
    } 
    
    public void setStatus(String status){ 
        this.status = status; 
    }
    
    public String getId(){ 
        return id; 
    } 
    
    public String getNama(){ 
        return nama; 
    }
    
    public String getAlamat(){ 
        return alamat; 
    }
    
    public String getCp(){ 
        return cp; 
    }
    
    public String getStatus(){ 
        return status; 
    } 
    
    public void insertPelanggan(){ 
        Koneksi kon = new Koneksi(); 
        String s = "insert into pelanggan values ('" + 
                    this.id + 
                    "', '" + 
                    this.nama +
                    "', '" + 
                    this.cp + 
                    "', '" + 
                    this.alamat + 
                    "')"; 
        kon.query(s);
    } 
    
    public void updatePelanggan(){ 
        Koneksi kon = new Koneksi(); 
        String s = "update pelanggan set id_pelanggan = '"
                    + this.id +
                    "', nama = '" + 
                    this.nama +
                    "', cp = '" +
                    this.cp + 
                    "', alamat = '" +
                    this.alamat +
                    "' where id_pelanggan = '" +
                    this.id +
                    "'";
        kon.query(s); 
    }
    
    public void deletePelanggan(){ 
        Koneksi kon = new Koneksi();
        String s = "delete from pelanggan where id_pelanggan = '" +
                    this.id+"'";
        kon.query(s);
    }
    
    public ResultSet getPelanggan(){
        ResultSet r = null;
        Koneksi kon = new Koneksi();
        String s = "insert into pelanggan values ('" +
                    this.id +
                    "', '" +
                    this.nama +
                    "', '" +
                    this.cp +
                    "', '" +
                    this.alamat +
                    "')";
        kon.query(s);
        return r;
    }

}
