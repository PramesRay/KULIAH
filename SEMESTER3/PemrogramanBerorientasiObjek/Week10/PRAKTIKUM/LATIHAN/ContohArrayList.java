import java.util.ArrayList;
import java.util.ListIterator;

public class ContohArrayList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(2);
        System.out.println(al + ", size = " + al.size());

        al.add("P");
        al.add("B");
        al.add("O");
        al.add(new String("Java"));
        al.add(3, Integer.valueOf(2022));
        System.out.println(al + ", size = " + al.size());

        al.remove("Java");
        System.out.println(al + ", size = " + al.size());

        Boolean b = al.contains("Java");
        System.out.println("List memiliki item Java = " + b);
        b = al.contains("N");
        System.out.println("List memiliki item N = " + b);
        b = al.contains(Integer.valueOf(2022));
        System.out.println("List memiliki item 2022 = " + b);

        ListIterator li = al.listIterator();
        while (li.hasNext()) {
            System.out.println("listIterator -> " + li.next());
        }

        Object a[] = al.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println("array -> " + a[i]);
        }
    }
}