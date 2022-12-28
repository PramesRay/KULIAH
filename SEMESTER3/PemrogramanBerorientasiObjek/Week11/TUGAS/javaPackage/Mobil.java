package javaPackage;

public class Mobil extends Kendaraan{
  Mobil(){
      super();
      this.jenis = "Mobil";
  }

  @Override
  public int getBiayaParkir() {
      return getLamaJam() * 3000;
  }
}