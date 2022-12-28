package javaPackage; 

public class Truck extends Kendaraan{
  Truck(){
      super();
      this.jenis="Truck";
  }

  @Override
  public int getBiayaParkir() {
      return getLamaJam() * 10000;
  }
}