package by.abs.bean;

public class DivisionOps implements MathOperation {
    @Override
    public double compute(double a, double b) {
        return a / b;
    }
}