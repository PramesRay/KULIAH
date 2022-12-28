package Strukdat;
import barang.Parkir;

public class Node {
    private Parkir info;
    Node next;
    public Node(){
        info = new Parkir();
        next = null;
    }
    public Node(Parkir info){
        this.info = info;
        next = null;
    }
    public void setInfo(Parkir info) {
        this.info = info;
    }
    public Parkir getInfo() {
        return info;
    }
}
