package edu.learn.Creational.singleton;

public class BrowserDemo {
    public static void main(String[] args) throws InterruptedException {
        Browser browser1 = Browser.getInstance();
        Browser browser2 = Browser.getInstance();

        System.out.println("Same instance: " + (browser1 == browser2));

        browser1.setHomePage("https://openai.com");
        System.out.println("Home page from browser2: " + browser2.getHomePage());

        Thread tabWorker1 = new Thread(() -> {
            Browser.getInstance().openTab("https://docs.oracle.com");
            Browser.getInstance().openTab("https://github.com");
        }, "Worker-1");

        Thread tabWorker2 = new Thread(() -> {
            Browser.getInstance().openTab("https://stackoverflow.com");
            Browser.getInstance().openTab("https://mvnrepository.com");
        }, "Worker-2");

        tabWorker1.start();
        tabWorker2.start();

        tabWorker1.join();
        tabWorker2.join();

        System.out.println("Total open tabs: " + browser1.getTabCount());
        System.out.println("Open tabs snapshot: " + browser2.getOpenTabsSnapshot());

        browser1.closeTab("https://github.com");
        System.out.println("After close, tab count: " + browser2.getTabCount());
    }
}
