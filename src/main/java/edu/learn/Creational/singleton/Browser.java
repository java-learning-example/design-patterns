package edu.learn.Creational.singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Class-based Singleton with double-checked locking.
public class Browser {
    private static volatile Browser instance;

    private final List<String> openTabs = new ArrayList<>();
    private String homePage = "https://www.example.com";

    private Browser() {
    }

    public static Browser getInstance() {
        if (instance == null) {
            synchronized (Browser.class) {
                if (instance == null) {
                    instance = new Browser();
                }
            }
        }
        return instance;
    }

    public synchronized void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public synchronized String getHomePage() {
        return homePage;
    }

    public synchronized void openTab(String url) {
        openTabs.add(url);
        System.out.println(Thread.currentThread().getName() + " opened tab: " + url);
    }

    public synchronized void closeTab(String url) {
        openTabs.remove(url);
        System.out.println(Thread.currentThread().getName() + " closed tab: " + url);
    }

    public synchronized List<String> getOpenTabsSnapshot() {
        return Collections.unmodifiableList(new ArrayList<>(openTabs));
    }

    public synchronized int getTabCount() {
        return openTabs.size();
    }
}
