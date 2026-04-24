package edu.learn.Structural.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        HomeTheaterFacade theater = new HomeTheaterFacade();
        theater.watchMovie("documentary.mp4");
    }
}
