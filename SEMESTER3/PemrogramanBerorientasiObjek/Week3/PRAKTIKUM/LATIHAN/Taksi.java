public class Taksi extends Mobil{
  protected int tarifAwal;
  protected int tarifPerKM;

  public void setTarifAwal(int tarifAwal) {
    this.tarifAwal = tarifAwal;
  }
  
  public int getTarifAwal() {
    return this.tarifAwal;
  }

  public void setTarifPerKM(int tarifPerKM) {
    this.tarifPerKM = tarifPerKM;
  }
  
  public int getTarifPerKM() {
    return this.tarifPerKM;
  }
}
