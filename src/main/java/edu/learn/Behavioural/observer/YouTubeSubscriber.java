package edu.learn.Behavioural.observer;

public class YouTubeSubscriber implements AdvancedSubscriber {
    
    public String username;

    public YouTubeSubscriber(String username) {
        this.username = username;
    }
    
    @Override
    public void update(String channelName, String videoName) {
        System.out.println(username + " don't miss out on new video of " + channelName + " called " + videoName);
    }

    public void comment(String comment) {
        
    }
}
