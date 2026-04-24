package edu.learn.Behavioural.interpreter;

public class InterpreterDemo {
    public static void main(String[] args) {
        Expression expression = new AddExpression(new NumberExpression(10), new NumberExpression(5));
        System.out.println("Result: " + expression.interpret());
    }
}
