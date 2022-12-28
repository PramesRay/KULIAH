public class Mobil extends Kendaraan {
  
  protected String bahanBakar;
  protected int kapasitasMesin;

  public void setBahanBakar(String bahanBakar) {
    this.bahanBakar = bahanBakar;
  }

  public void setKapasitasMesin(int kapasitasMesin) {
    this.kapasitasMesin = kapasitasMesin;
  }

  public String getBahanBakar() {
    return this.bahanBakar;
  }
  
  public String getkapasitasMesin() {
    return this.kapasitasMesin;
  }
}
