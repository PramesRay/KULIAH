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
public class Mobil {
    private String id; 
    private String jenis; 
    private String sewa; 
    private String stok; 
    
    public Mobil(){
        this.id    = null;
        this.jenis = null;
        this.sewa  = null;
        this.stok  = null;
    }
    
    public String getId(){ 
        return id; 
    }
    public String getJenis(){ 
        return jenis; 
    }
    public String getSewa(){ 
        return sewa; 
    }
    public String getStok(){ 
        return stok; 
    }
    
    public void setId(String id){ 
        this.id    = id; 
    }
    public void setJenis(String jenis){ 
        this.jenis = jenis; 
    }
    public void setSewa(String sewa){ 
        this.sewa  = sewa; 
    }
    public void setStok(String stok){ 
        this.stok  = stok; 
    }
    
    public void insertMobil(){ 
        Koneksi kon = new Koneksi();
        String s = "INSERT INTO mobil VALUES('"          + 
                                             this.id     + "','" + 
                                             this.jenis  + "', '"+ 
                                             this.sewa   + "', '"+ 
                                             this.stok   + "')";
        kon.query(s); 
    }
    
    public void updateMobil(){ 
        Koneksi kon = new Koneksi();
        String s = "UPDATE mobil SET id_mobil = '" + this.id + 
                                    "', jenis = '" + this.jenis  + 
                                     "', sewa = '" + this.sewa   + 
                                     "', stok = '" + this.stok   + 
                            "' where id_mobil = '" + this.id     + "'";
        kon.query(s); 
    }
    
    public void deleteMobil(){ 
        Koneksi kon = new Koneksi();
        String s = "DELETE FROM mobil WEHER id_mobil = '"+ this.id+ "'";
        kon.query(s);
    } 
    
    public ResultSet getMobil(){ 
        ResultSet r = null; 
        Koneksi kon = new Koneksi();
        String s = "INSERT INTO mobil VALUES('"          + 
                                             this.id     + "','" + 
                                             this.jenis  + "', '"+ 
                                             this.sewa   + "', '"+ 
                                             this.stok   + "')";
        kon.query(s); 
        return r;
    }
}
