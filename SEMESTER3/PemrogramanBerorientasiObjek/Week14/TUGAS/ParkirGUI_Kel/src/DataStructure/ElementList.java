/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructure;

/**
 *
 * @author Windows 10
 */
import Kendaraan.Kendaraan;
public class ElementList {
     private Kendaraan data;
    public ElementList next;

    public ElementList(){
        this.data = null;
        this.next = null;
    }

    public ElementList(Kendaraan data){
        this.data = data;
        this.next = null;
    }

    public void setData(Kendaraan data){
        this.data = data;
    }

    public Kendaraan getData(){
        return this.data;
    }
    
}
