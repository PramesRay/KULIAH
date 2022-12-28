import java.util.LinkedList;

public class ContohLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        list.add(Integer.valueOf(3));
        list.add(Integer.valueOf(1));
        System.out.println(list + ", size = " + list.size());

        list.addFirst(Integer.valueOf(0));
        list.addLast(Integer.valueOf(4));
        System.out.println(list + ", size = " + list.size());
        System.out.println(list.getFirst() + ", " + list.getLast());
        System.out.println(list.get(2) + ", " + list.get(3));

        list.removeFirst();
        list.removeLast();
        System.out.println(list + ", size = " + list.size());

        list.remove(Integer.valueOf(1));
        System.out.println(list + ", size = " + list.size());

        String s = new String("Jatinangor");
        list.add(s);
        System.out.println(list + ", size = " + list.size());
        System.out.println("Index item Jatinangor dalam list -> " + list.indexOf(s));

        list.remove(2);
        System.out.println(list + ", size = " + list.size());

        list.set(1, "one");
        System.out.println(list + ", size = " + list.size());

        LinkedList clone = (LinkedList) list.clone();
        clone.add(0, new String("Clone"));
        list.add(0, new String("Original"));
        System.out.println(list + ", size = " + list.size());
        System.out.println(clone + ", size = " + clone.size());
    }
}