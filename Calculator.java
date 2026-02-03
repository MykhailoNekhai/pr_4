package ua.uni;

public class Calculator {

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("b is 0");
        }
        return a / b;
    }
}

