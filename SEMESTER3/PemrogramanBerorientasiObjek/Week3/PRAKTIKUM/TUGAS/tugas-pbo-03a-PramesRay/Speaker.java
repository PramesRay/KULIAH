public class Speaker extends PeripheralComputer {
  //Variable
  protected float decibel;

  //Constructor
  public Speaker() {
    this.decibel = 0;
  }

  //Setter
  public void setDecibel(float decibel) {
    this.decibel = decibel;
  }

  //Getter
  public float getDecibel() {
    return this.decibel;
  }

  @Override
  public void printBasicInfo() {
    System.out.println("Speaker Brand\t\t\t: " + super.brand);
    System.out.println("Speaker Color\t\t\t: " + super.color);
    System.out.println("Speaker Function\t\t: " + super.function);
  }
}
