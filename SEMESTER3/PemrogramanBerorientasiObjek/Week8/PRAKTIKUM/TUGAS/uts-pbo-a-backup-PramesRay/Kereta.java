public class Kereta extends KendaraanUmum implements Operasi {
  // enkapsulasi
  private String name;

  public Kereta(String name) {
    super("Kereta");
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  // override super class
  @Override
  protected void statusPergerakan() {
    System.out.println("menuju Stasiun Senen");
  }

  @Override
  public void statusKeberangkatan() {
    System.out.print(type + " " + name + " akan berangkat ");
    statusPergerakan();
  }

  @Override
  public void statusTiba() {
    System.out.println(type + " " + name + " telah tiba di tujuan!");
  }

}