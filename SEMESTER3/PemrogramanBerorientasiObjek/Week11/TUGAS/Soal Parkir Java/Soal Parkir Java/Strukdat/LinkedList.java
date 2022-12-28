package Strukdat;

public class LinkedList {
    private Node first;

    public LinkedList(){
        first = null;
    }
    // redundant
    // public void createList(){
    //     first = null;
    // }

    public Node createElm(){
        Node newNode = new Node();
        System.out.println("Silahkan masukan informasi parkir : ");
        newNode.getInfo().isiParkir();
        return newNode;
    }
    
    // Insert method
    
    public void insertFirst(Node newNode){
        if(first != null){
            newNode.next = first;
        }
        first = newNode;
        
    }
    public void insertLast(Node newNode){
        if (first == null){
            first = newNode;
        } else{
            Node pBantu = first;
            while (pBantu.next != null){
                pBantu = pBantu.next;
            }
            pBantu.next = newNode;
        }
    }
    
    // Delete Method
    public Node deleteFirst(){
        Node delete;
        if (first == null){
            delete = null;
        } else if(first.next == null){
            delete = first;
            first = null;
        } else {
            delete = first;
            first = first.next;
        }
        return delete;
    }

    // Traversal Method
    public void traversal(){
        if (first == null){
            System.out.println("Tidak ada data dalam list!");
        } else{
            int totalBiaya = 0, i = 1;
            Node bantu = first;
            System.out.println("===================================================================================================");
            System.out.println(String.format("%-3s |%-10s |%-12s |%-10s |%-10s |%-10s |%-12s |%-10s |%-12s", 
            "NO", "PEMILIK", "No Kendaraan", "Jenis", "Jam Masuk", "Jam Pulang", "Lama Parkir", "Lama Jam", "Biaya"));
            do {
                System.out.println(bantu.getInfo().toString(i++));
                totalBiaya += bantu.getInfo().totalParkir();
                bantu = bantu.next;
            } while (bantu != null);

            System.out.println("===================================================================================================");
            System.out.println("Total Biaya Adalah : Rp" + totalBiaya);
        }
    }
}
