package edu.learn.Creational.prototype;

public class Resume implements Cloneable {
    private String name;
    private String[] skills;

    public Resume(String name, String[] skills) {
        this.name = name;
        this.skills = skills.clone();
    }

    public void updateName(String name) {
        this.name = name;
    }

    public void updateSkill(int index, String skill) {
        this.skills[index] = skill;
    }

    @Override
    public Resume clone() {
        try {
            Resume copy = (Resume) super.clone();
            // Deep-copy mutable array so clones are independent.
            copy.skills = this.skills.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public String toString() {
        return "Resume{name='" + name + "', skills=[" + skills[0] + ", " + skills[1] + "]}";
    }
}
