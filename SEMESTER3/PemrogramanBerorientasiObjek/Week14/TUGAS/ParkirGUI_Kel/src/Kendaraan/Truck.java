/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author Windows 10
 */
public class Truck extends Kendaraan {
     public Truck(){
        super();
        this.jenis="Truck";
    }

    @Override
    public int getBiayaParkir() {
        return getLamaJam() * 10000;
    }
    
}
