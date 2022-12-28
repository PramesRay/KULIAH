/*
* Nama      : Rifqi Muhadzib Ahdan
* NPM       : 140810210029
* Kelas     : A
* Tanggal   : 07 November 2022
* Deskripsi : Custom exception - ClassCastException::ParentToChildException
* ===Deskripsi===
* Exception yang dithrow karena casting dari parent ke child tidak berhasil
* Yang dikarenakan oleh penggunaan algoritma polimorfisme yang salah
*/

class MakhlukHidup{
    private String nama;
    private int umur;
    private char jk;
    
    public MakhlukHidup(String nama, int umur, char jk) {
        this.nama = nama;
        this.umur = umur;
        this.jk = jk;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public void setJk(char jk) {
        this.jk = jk;
    }

    public String getNama() {
        return nama;
    }
    public int getUmur() {
        return umur;
    }
    public char getJk() {
        return jk;
    }

    public void print(){
        System.out.println("Nama\t: " + this.nama);
        System.out.println("Umur\t: " + this.umur);
        System.out.println("Jk\t: " + this.jk);
    }
}

class Hewan extends MakhlukHidup{
    private String jenis, suara;
    
    public Hewan(String nama, int umur, char jk, String jenis, String suara) {
        super(nama, umur, jk);
        this.jenis = jenis;
        this.suara = suara;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public void setSuara(String suara) {
        this.suara = suara;
    }

    public String getJenis() {
        return jenis;
    }
    public String getSuara() {
        return suara;
    }

    public void print() {
        super.print();
        System.out.println("Jenis\t: " + this.jenis);
        System.out.println("Suara\t: " + this.suara);
    }
}

public class TestException {
    public static void main(String[] args) throws ParentToChildException{
        try {
            MakhlukHidup rifqi = new MakhlukHidup("Rifqi", 19, 'L');
            System.out.println("===Makhluk Hidup 1===");
            rifqi.print();
            
            Hewan singa = new Hewan("Dilan", 3, 'L', "singa", "Rawr");
            System.out.println("===Makhluk Hidup 2===");
            singa.print();
            
            MakhlukHidup abraham = new Hewan("Milea", 2, 'P', "kambing", "mbekk");
            Hewan newMilea = (Hewan)abraham;
            System.out.println("===Makhluk Hidup 3===");
            newMilea.print();

            // Algoritma polimorfisme salah di sini
            MakhlukHidup dengklek = new MakhlukHidup("Dengklek", 100, 'P');
            Hewan newDengklek = (Hewan)dengklek;
            System.out.println("===Makhluk Hidup 4===");
            newDengklek.print();
        } catch (Exception e) {
            throw new ParentToChildException("Error => Algoritma casting parent ke child salah! Gunakan metode polimorfisme dengan benar untuk casting parent ke child!");
        } finally {
            System.out.println("===Proses Selesai===");
        }
    }
}