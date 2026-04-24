package edu.learn.Behavioural.iterator;

public class PatternList implements PatternCollection {
    private final String[] patterns;

    public PatternList(String[] patterns) {
        this.patterns = patterns.clone();
    }

    public String[] getPatterns() {
        return patterns;
    }

    @Override
    public PatternIterator createIterator() {
        return new PatternListIterator(this);
    }
}
