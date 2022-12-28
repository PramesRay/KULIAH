import java.io.Serializable;

public class Mhs implements Serializable {
	/* 
	*	Sebelum di-serialize ke mhs.txt, serialVersionUID nya adalah 1 (dalam Long)
	* 	Setelah di-deserialize, serialVersionUID nya diganti ke 2 (dalam Long) 
	*	Sehingga exception invalidClassException akan keluar karena serilVersionID nya tidak match
	**/
	private static final long serialVersionUID = 2L;
	private int id;
	private String nama;

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
}