package edu.learn.Behavioural.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        PatternCollection collection = new PatternList(new String[]{"Singleton", "Factory", "Observer"});

        // Iterator hides the collection's traversal details.
        PatternIterator iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println("Pattern: " + iterator.next());
        }
    }
}
