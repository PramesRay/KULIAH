import java.util.HashSet;
public class ContohHashSet {
  public static void main(String[] args) {
    HashSet hs = new HashSet();
    
    System.out.println(hs.add("one"));
    System.out.println(hs.add("two"));
    System.out.println(hs.add("three"));
    System.out.println(hs.add("four"));
    System.out.println(hs.add("five"));
    
    System.out.println(hs);
    Boolean b = hs.add("one");
    System.out.println("Duplicate item allowed = " + b);
    System.out.println(hs);
  }
}