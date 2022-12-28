public class PeripheralComputer {
  //Variable
  protected String brand, color, function;
  
  //Constructor
  public PeripheralComputer() {
    this.brand = "unknown" ;
    this.color = "unknown" ;
    this.function = "unknown" ;
  }
  
  //Setter
  public void setBrand(String brand) {
    this.brand = brand;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public void setFunction(String function) {
    this.function = function;
  }

  //Getter
  public String getBrand() {
    return this.brand;
  }
  public String getColor() {
    return this.color;
  }
  public String getFunction() {
    return this.function;
  }

  //Print
  public void printBasicInfo() {
    System.out.println("Brand     : " + this.brand);
    System.out.println("Color     : " + this.color);
    System.out.println("Function  : " + this.function);
  }

}