package edu.learn.Behavioural.interpreter;

interface Expression {
    int interpret();
}

class NumberExpression implements Expression {
    private final int value;

    public NumberExpression(int value) { this.value = value; }

    public int interpret() { return value; }
}

class AddExpression implements Expression {
    private final Expression left;
    private final Expression right;

    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public int interpret() {
        return left.interpret() + right.interpret();
    }
}

public class InterpreterDemo {
    public static void main(String[] args) {
        Expression expression = new AddExpression(new NumberExpression(10), new NumberExpression(5));
        System.out.println("Result: " + expression.interpret());
    }
}
