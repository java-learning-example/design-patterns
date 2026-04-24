package edu.learn.Behavioural.iterator;

public class PatternListIterator implements PatternIterator {
    private final PatternList list;
    private int index;

    public PatternListIterator(PatternList list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.getPatterns().length;
    }

    @Override
    public String next() {
        return list.getPatterns()[index++];
    }
}
