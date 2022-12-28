package KendaraanPackage;


import KendaraanPackage.Kendaraan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 140810210029 - Rifqi Muhadzib Ahdna
 */
public class Truk extends Kendaraan{
    private int volumeMuatan;

    // Constructors
    public Truk() {
        super();
        this.volumeMuatan = 0;
    }
    public Truk(int volumeMuatan) {
        super();
        this.volumeMuatan = volumeMuatan;
    }
    public Truk(String jenis, String platKend, String namaBrand, String bpkb, String stnk) {
        super(jenis, platKend, namaBrand, bpkb, stnk);
        this.volumeMuatan = 0;
    }
    public Truk(String jenis, String platKend, String namaBrand, String bpkb, String stnk, int volumeMuatan) {
        super(jenis, platKend, namaBrand, bpkb, stnk);
        this.volumeMuatan = volumeMuatan;
    }

    // Setters
    public void setVolumeMuatan(int volumeMuatan) {
        this.volumeMuatan = volumeMuatan;
    }
    
    // Getters
    public int getVolumeMuatan() {
        return volumeMuatan;
    }    
}

