package edu.learn.Creational.builder;

public class Burger {
    private final String bun;
    private final String patty;
    private final boolean cheese;
    private final boolean lettuce;

    private Burger(Builder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
    }

    public static class Builder {
        private String bun = "regular";
        private String patty = "veggie";
        private boolean cheese;
        private boolean lettuce;

        public Builder bun(String bun) { this.bun = bun; return this; }
        public Builder patty(String patty) { this.patty = patty; return this; }
        public Builder cheese(boolean cheese) { this.cheese = cheese; return this; }
        public Builder lettuce(boolean lettuce) { this.lettuce = lettuce; return this; }

        public Burger build() {
            return new Burger(this);
        }
    }

    @Override
    public String toString() {
        return "Burger{bun='" + bun + "', patty='" + patty + "', cheese=" + cheese + ", lettuce=" + lettuce + "}";
    }
}
