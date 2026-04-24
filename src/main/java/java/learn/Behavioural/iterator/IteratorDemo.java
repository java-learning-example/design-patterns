package java.learn.Behavioural.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> topics = Arrays.asList("Singleton", "Factory", "Observer");

        // Iterator hides the collection's internal traversal details.
        Iterator<String> it = topics.iterator();
        while (it.hasNext()) {
            System.out.println("Pattern: " + it.next());
        }
    }
}
