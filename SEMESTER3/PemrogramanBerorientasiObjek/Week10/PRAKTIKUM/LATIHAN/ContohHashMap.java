import java.util.Map;
import java.util.HashMap;

public class ContohHashMap {
    public static void main(String[] args) {
        String name[] = {
                new String("A"), new String("B"), new String("C"),
                new String("D"), new String("E"), new String("A"),
                new String("B"), new String("A"),
        };

        Map m = new HashMap();

        for (int i = 0; i < name.length; i++) {
            Integer freq = (Integer) m.get(name[i]);

            m.put(name[i], (freq == null ? Integer.valueOf(1) : Integer.valueOf(freq.intValue() + 1)));
        }

        System.out.println(m.size() + " string unik dideteksi");

        System.out.println(m);
    }
}