public class Test{
  public static void main(String[] args) {
    Animal kucing = new Animal();
    
    Animal.Action aksi = kucing.new Action(){
      @Override
      public void move(){
        System.out.println("Move\t: Mager euy..."); 
      }
      
      @Override
      public void speak(){
        System.out.println("Speak\t: MIAW AUGGG..."); 
      }
    };

  System.out.println("Nama\t:" + kucing.getName());
  aksi.move();
  aksi.speak();
  }
}
