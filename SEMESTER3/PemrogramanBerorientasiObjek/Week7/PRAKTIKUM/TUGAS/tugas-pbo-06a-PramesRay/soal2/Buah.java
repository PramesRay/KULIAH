/*
* Nama      : Prames Ray Lapian
* NPM       : 140810210059
* Kelas     : A
* Tanggal   : 17 Oktober 2022
* Deskripsi : Class jawaban assignment-06 soal-02
*/

public enum Buah {
    MANGGA  (5000, "Rasanya asam dan manis, Teksturnya lembut, Warna kulitnya hijau dan atau kuning"),
    APEL    (7000, "Rasanya Mmnis, Teksturnya Crunchy ala buah, Warna kulitnya Merah atau hijau"),
    ANGGUR  (500, "Rasanya manis dan asam, Teksturnya lembut, Warna kulitnya ungu atau hijau"),
    JERUK   (4000, "Rasanya asam dan manis, Teksturnya dominan air namun berbulir, Warna kulitnya orange"),
    MELON   (20000, "Rasanya manis, Teksturnya lembut, Warna kulitnya hijau dan atau orange");

    private final long harga;
    private final String deskripsi;

    Buah(long harga, String deskripsi){
        this.harga = harga;
        this.deskripsi = deskripsi;
    }

    private long getHarga() {
        return this.harga;
    }
    
    private String getDeskripsi() {
        return this.deskripsi;
    }

    public static void main(String[] args) {
        for(Buah buah : Buah.values()) {
            System.out.println(buah);
            System.out.println("Harga\t\t: " + buah.getHarga() + " /pcs");
            System.out.println("Deskripsi\t: " + buah.getDeskripsi());
            System.out.println();
        }

    }
}