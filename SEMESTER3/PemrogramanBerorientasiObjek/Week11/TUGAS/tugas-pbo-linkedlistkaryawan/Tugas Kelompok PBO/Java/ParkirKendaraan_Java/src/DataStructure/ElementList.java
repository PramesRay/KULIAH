/*
* Nama          : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
* NPM           : 140810210015 , 140810200042 , 140810210059 , 140810210039
* Kelas         : A
* Tanggal       : 16 November 2022
* Nama Program  : ElementList.java
* Deskripsi     : Soal parkir - class element list
*/
package DataStructure;
import Kendaraan.Kendaraan;

public class ElementList {
    private Kendaraan data;
    ElementList next;

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

