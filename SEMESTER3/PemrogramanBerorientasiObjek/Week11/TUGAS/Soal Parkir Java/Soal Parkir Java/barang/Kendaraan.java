package barang;

public class Kendaraan {
    protected String noKendaraan;
    protected Orang pemilik;
    // Constructor
    Kendaraan(){
        this.noKendaraan = "";
        pemilik = new Orang();
    }

    // setter
    public void setNoKendaraan(String noKendaraan) {
        this.noKendaraan = noKendaraan;
    }
    public void setPemilik(Orang pemilik) {
        this.pemilik = pemilik;
    }

    // getter
    public String getNoKendaraan() {
        return this.noKendaraan;
    }
    public Orang getPemilik() {
        return pemilik;
    }
    // fungsi
    /**
     * digunakan untuk mengambil jenis kendaraan. 
     * karena akan mengimplementasi polimorfisme, getClass() akan me-return kelas child yang dipakai.
     */
    public String getJenisKendaraan(){
        return this.getClass().toGenericString().substring(20); // class <kelas>
        // public class barang.blabla
    }

    public int biayaParkir(){
        return 0;
    }
}
