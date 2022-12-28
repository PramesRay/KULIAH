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
public class Pegawai {
    private String id;
    private String nama;
    private String alamat;
    private String cp;
    private String username;
    private String password;
    private String kode;
    
    public Pegawai(){
        this.id       = null;
        this.nama     = null;
        this.alamat   = null;
        this.cp       = null;
        this.username = null;
        this.password = null;
        this.kode     = null;
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
    public String getUsername(){ 
        return username; 
    }
    public String getPassword(){ 
        return password; 
    }
    public String getKode(){ 
        return kode; 
    }
    
    public void setId(String id){
        this.id       = id; 
    }
    public void setNama(String nama){ 
        this.nama     = nama; 
    }
    public void setAlamat(String alamat){ 
        this.alamat   = alamat; 
    }
    public void setCp(String cp){ 
        this.cp       = cp; 
    }
    public void setUsername(String username){ 
        this.username = username; 
    } 
    public void setPassword(String password){ 
        this.password = password; 
    }
    public void setKode(String kode){ 
        this.kode     = kode; 
    }
    
    public void insertPegawai(){ 
        Koneksi kon = new Koneksi();
        String s = "INSERT INTO pegawai VALUES ('"            + 
                                                this.id       + "', '"    + 
                                                this.nama     + "', '"    +
                                                this.alamat   + "', '"    + 
                                                this.cp       + "', '"    + 
                                                this.username + "', '"    + 
                                                this.password + "', '0')" ;
        kon.query(s);
    }
    
    public void updatePegawai(){
        Koneksi kon = new Koneksi();
        String s = "UPDATE pegawai SET id_pegawai = '" + this.id         + 
                                          "', nama = '" + this.nama      + 
                                            "', cp = '" + this.cp        + 
                                        "', alamat = '" + this.alamat    + 
                                      "', username = '" + this.username  + 
                                      "', password = '" + this.password  + 
                                          "', kode = '" + this.kode      + 
                               "' WHERE id_pegawai = '" + this.id        + "'";
        kon.query(s);
    }
    
    public void deletePegawai(){
        Koneksi kon = new Koneksi();
        String s = "DELETE FROM pegawai WHERE id_pegawai = '" + this.id + "'";
        kon.query(s);
    }
    
    public ResultSet getPegawai(){
        ResultSet r = null;
        Koneksi kon = new Koneksi();
        String s = "INSERT INTO pegawai VALUES ('"            + 
                                                this.id       + "', '"   + 
                                                this.nama     + "', '"   + 
                                                this.cp       + "', '"   + 
                                                this.alamat   + "', '"   + 
                                                this.username + "', '"   + 
                                                this.password + "', '0')";
        kon.query(s);
        return r;
    }
}
