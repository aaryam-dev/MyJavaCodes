import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<String, Integer>();

        // inserting key-value elements
        m.put("gfg", 10);
        m.put("hello", 20);
        m.put("hi", 30);

        // another way of insertion
        m.put("hola", 40);

        // printing unordered map

        // METHOD 1
        for (Map.Entry<String, Integer> x : m.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
        System.out.println();

        // METHOD 2
        for (Map.Entry<String, Integer> it : m.entrySet()) {
            System.out.println(it.getKey() + " " + it.getValue());
        }

        // find if a string (key) is present or not

        if (m.containsKey("hi")) {
            System.out.println("Found!");
        }

        System.out.println(m.size());

        m.remove("hi");

        System.out.println(m.size());
    }
}
