/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author Windows 10
 */
public class Mobil extends Kendaraan {
     public Mobil(){
        super();
        this.jenis = "Mobil";
    }

    @Override
    public int getBiayaParkir() {
        return getLamaJam() * 3000;
    }
    
}
