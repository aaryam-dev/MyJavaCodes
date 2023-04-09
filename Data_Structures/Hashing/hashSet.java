import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // inserting elements into the HashSet
        set.add(10);
        set.add(20);
        set.add(30);

        // printing the elements in the HashSet
        for (int x : set) {
            System.out.print(x + " ");
        }
        System.out.println();

        // size of the HashSet or number of distinct elements
        System.out.println(set.size());

        // another way of printing the elements, using iterator it
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
