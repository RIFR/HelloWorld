import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {

        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");

        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);

        m1.put("Daisy", "15");
        System.out.print("\n Daisy ->" + m1.get("Daisy"));

        //----------------------------------------------------

        List a1 = new ArrayList();
        a1.add("Zara");
        a1.add("Mahnaz");
        a1.add("Ayan");
        System.out.println(" ArrayList Elements");
        System.out.print("\t" + a1);

        //----------------------------------------------------

        List l1 = new LinkedList();
        l1.add("Zara");
        l1.add("Mahnaz");
        l1.add("Ayan");
        System.out.println();
        System.out.println(" LinkedList Elements");
        System.out.print("\t" + l1);

        //----------------------------------------------------

        System.out.println();
        //StringBuilder sbuf = new StringBuilder();
        //Formatter fmt = new Formatter(sbuf);
        //fmt.format("PI = %f, No %d %d %t %n", Math.PI, 1000, 800, calendar.new);
        //System.out.print(sbuf.toString());

    }
}
