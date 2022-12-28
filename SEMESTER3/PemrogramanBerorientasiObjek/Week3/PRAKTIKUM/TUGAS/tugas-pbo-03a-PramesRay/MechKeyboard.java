public class MechKeyboard extends PeripheralComputer {
  //Variable
  protected String switchType;

  //Constructor
  public MechKeyboard() {
    this.switchType = "unknown" ;
  }

  
  //Setter
  public void setSwitchType(String switchType) {
    this.switchType = switchType;
  }
  
  //Getter
  public String getSwitchType() {
    return this.switchType;
  }
  
  @Override
  public void printBasicInfo() {
    System.out.println("Keyboard Brand\t\t: " + super.brand);
    System.out.println("Keyboard Color\t\t: " + super.color);
    System.out.println("Keyboard Function\t: " + super.function);
  }
}
