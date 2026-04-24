package edu.learn.Creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Resume template = new Resume("Template", new String[]{"Java", "SQL"});

        Resume alice = template.clone();
        alice.updateName("Alice");

        Resume bob = template.clone();
        bob.updateName("Bob");
        bob.updateSkill(1, "AWS");

        System.out.println(alice);
        System.out.println(bob);
    }
}
