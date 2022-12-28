public class Mouse extends PeripheralComputer {
  //Variable
  protected String sensorType;

  //Constructor
  public Mouse() {
    this.sensorType = "unknown" ;
  }

  //Setter
  public void setSensorType(String sensorType) {
    this.sensorType = sensorType;
  }

  //Getter
  public String getSensorType() {
    return this.sensorType;
  }

  @Override
  public void printBasicInfo() {
    System.out.println("Mouse Brand\t\t: " + super.brand);
    System.out.println("Mouse Color\t\t: " + super.color);
    System.out.println("Mouse Function\t: " + super.function);
  }
}
