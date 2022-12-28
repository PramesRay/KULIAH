/*
* Nama      : Rifqi Muhadzib Ahdan
* NPM       : 140810210029
* Kelas     : A
* Tanggal   : 11 November 2022
* Deskripsi : Rotasi array ke kiri sebanyak n kali rotasi
*/
import java.util.Scanner;

public class LeftRotation{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Larik arr = new Larik();

        // Input baris 1
        arr.setJumlah(Integer.parseInt(in.next())); 
        arr.setNumRotate(Integer.parseInt(in.next()));
        
        // Inpur baris 2
        for (int i = 0; i < arr.getJumlah(); i++) {
            arr.getLarik()[i] = Integer.parseInt(in.next());
        }

        int[] hasilRotate = arr.rotLeft();
        for (int i = 0; i < hasilRotate.length; i++) {
            System.out.print(hasilRotate[i] + " ");
        }
    }

    static int inputInt(String msg){
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextInt();
    }
    

}

class Larik{
    private int[] larik;
    private int jumlah, numRotate;

    public Larik() {
        this.jumlah = 0;
        this.numRotate = 0;
    }
    public Larik(int[] larik, int jumlah, int numRotate) {
        this.larik = larik;
        this.jumlah = jumlah;
        this.numRotate = numRotate;
    }

    public void setLarik(int[] larik) {
        this.larik = larik;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
        this.larik = new int[jumlah];
    }
    public void setNumRotate(int numRotate) {
        this.numRotate = numRotate;
    }
    
    public int[] getLarik() {
        return larik;
    }
    public int getJumlah() {
        return jumlah;
    }
    public int getNumRotate() {
        return numRotate;
    }
    
    /*
     * @return
     *  int[] = array hasil rotasi
     */
    public int[] rotLeft() {
        // Memangkas jumlah rotasi menjadi jumlah yang equal agar jumlah loop tidak terlalu banyak
        this.numRotate %= this.jumlah;

        for (int i = 0; i < this.numRotate; i++) {
            int temp = this.larik[0];
            for (int j = 0; j < this.jumlah-1; j++) {
                this.larik[j] = this.larik[j+1];
            }
            this.larik[this.jumlah-1] = temp;
        }
        return this.larik;
    }
}