import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.text.DateFormatSymbols;

public class ContohIterator {
    Collection safeMonths;

    public Collection filter(Collection c) {
        Collection filteredCollection = new ArrayList();
        for (Iterator i = c.iterator(); i.hasNext();) {
            String s = (String) i.next();
            if (condition(s)) {
                filteredCollection.add(s);
            }
        }
        return filteredCollection;
    }

    public boolean condition(String s) {
        if (s.contains("r")) return true;
        return false;
    }

    public static void main(String[] args) {
      ContohIterator ci = new ContohIterator();

      DateFormatSymbols dfs = new DateFormatSymbols();
      String[] monthArray = dfs.getMonths();

      Collection months = Arrays.asList(monthArray);

      ci.safeMonths = ci.filter(months);

      System.out.println("The following months are safe for oysters : ");
      System.out.println(ci.safeMonths);
  }
}