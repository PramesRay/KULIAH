/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author Windows 10
 */
public class Motor extends Kendaraan {
     public Motor(){
        super();
        this.jenis="Motor";
    }

    @Override
    public int getBiayaParkir() {
        return getLamaJam() * 2000;
    }    
    
}
