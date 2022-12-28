package javaPackage;

public class Motor extends Kendaraan{
  public Motor(){
      super();
      this.jenis="Motor";
  }

  @Override
  public int getBiayaParkir() {
      return getLamaJam() * 2000;
  }
}