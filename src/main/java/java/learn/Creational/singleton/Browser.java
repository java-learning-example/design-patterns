package java.learn.Creational.singleton;

// Singleton

public class Browser {
    private static Browser browser;

    private Browser(){}

    public synchronized static Browser getInstance()
    {
        if(browser == null)
        {
            synchronized(Browser.class)
            {
                if(browser == null) browser = new Browser();
            }
        }
    
        return browser;
    }

    public void display()
    {
        System.out.println("In singleton...");
    }
}
