public class Animal {
  String name;

  public Animal(){
    this.name = " Bukan Sembarang Neko";
  }

  public void setName(String name){
    this.name = name;
  }
  
  public String getName(){
    return this.name;
  }

  //Inner Class
  class Action {
    public void move(){
      System.out.println("x"); 
    }
    public void speak(){
      System.out.println("x"); 
    }
  }
}
