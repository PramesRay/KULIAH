public class Manusia {
  private String nama;
  private int umur;

  public Manusia(String nama, int umur){
      this.nama = nama;
      this.umur = umur;
  }

  public void setNama(String nama){
      this.nama = nama;
  }

  public void setUmur(int umur){
      this.umur = umur;
  }

  public String getNama(){
      return this.nama;
  }

  public int getUmur(){
      return this.umur;
  }
}

