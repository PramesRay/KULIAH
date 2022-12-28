/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.sql.ResultSet;

/**
 *
 * @author Windows 10
 */
public class Peminjaman {
    private String peminjaman; 
    private String pelanggan; 
    private String mobil; 
    private String petugas; 
    private String pegawai;
    private String ptanggal; private String pbulan; private String ptahun; 
    private String kembali; 
    private String lama; 
    private String biaya;
    private String telat;
    private String denda;
    
    public Peminjaman(){ }
    
    public String getPem(){ 
        return peminjaman; 
    }
    public String getPel(){ 
        return pelanggan; 
    }
    public String getMobil(){ 
        return mobil; 
    }
    public String getPetugas(){ 
        return petugas; 
    }
    public String getPtanggal(){ 
        return ptanggal; 
    }
    public String getPbulan(){ 
        return pbulan; 
    }
    public String getPtahun(){ 
        return ptahun; 
    }
    public String getLama(){ 
        return lama; 
    }
    public String getKembali(){ 
        return kembali; 
    }
    public String getPegawai(){ 
        return pegawai; 
    }
    public String getBiaya(){ 
        return biaya; 
    }
    public String getTelat(){ 
        return telat; 
    }
    public String getDenda(){ 
        return denda; 
    }
    
    public void setPem(String peminjaman){
        this.peminjaman = peminjaman;
    }
    public void setPel(String pelanggan){ 
        this.pelanggan = pelanggan; 
    }
    public void setMobil(String mobil){ 
        this.mobil = mobil; 
    } 
    public void setPetugas(String petugas){ 
        this.petugas = petugas; 
    } 
    public void setPtanggal(String ptanggal){ 
        this.ptanggal = ptanggal; 
    } 
    public void setPbulan(String pbulan){
        this.pbulan = pbulan; 
    } 
    public void setPtahun(String ptahun){ 
        this.ptahun = ptahun; 
    }
    public void setLama(String lama){ 
        this.lama = lama; 
    }
    public void setKembali(String Kembali){ 
        this.kembali = Kembali; 
    } 
    public void setPegawai(String pegawai){ 
        this.pegawai = pegawai; 
    } 
    public void setBiaya(String biaya){ 
        this.biaya = biaya; 
    } 
    public void setTelat(String telat){ 
        this.telat = telat;
    } 
    public void setDenda(String denda){ 
        this.denda = denda; 
    } 
    
    public void insertPeminjaman(){ 
        Koneksi kon = new Koneksi(); 
        String s = "INSERT INTO peminjaman VALUES ('"               +  
                                                    this.peminjaman + "', '"        + 
                                                    this.pelanggan  + "', '"        + 
                                                    this.mobil      + "', '"        +
                                                    this.petugas    + "', '"        + 
                                                    this.ptahun     + "-" + this.pbulan + "-" + this.ptanggal   + "', '" +
                                                    this.kembali    + "', '"        +
                                                    this.lama       + "', '0', '"   + 
                                                    this.biaya      + "', '0')"     ; 
        kon.query(s);
    }
    public void updatePeminjaman(){
        Koneksi kon = new Koneksi();
        String s = "UPDATE peminjaman SET telat = '" + this.telat      + 
                                      "', denda = '" + this.denda      + 
                         "' WHERE id_peminjaman = '" + this.peminjaman + "'";
        kon.query(s);
    }
    
    public void deletePeminjaman(){
        Koneksi kon = new Koneksi();
        String s = "DELETE FROM peminjaman WHERE id_peminjaman ='" + this.peminjaman + "'";
        kon.query(s);
    }
    
    public ResultSet getPeminjaman(){
        ResultSet r = null;
        Koneksi kon = new Koneksi();
        String s = "INSERT INTO peminjaman VALUES ('"               +  
                                                    this.peminjaman + "','"         + 
                                                    this.pelanggan  + "', '"        + 
                                                    this.mobil      + "', '"        + 
                                                    this.petugas    + "', '"        +  
                                                    this.ptahun     + "-" + this.pbulan + "-" + this.ptanggal   + "', '" +
                                                    this.kembali    + "', '"        +  
                                                    this.lama       + "', '0', '"   + 
                                                    this.biaya      + "', '0')"     ;
        kon.query(s); 
        return r;
    }
    
}
