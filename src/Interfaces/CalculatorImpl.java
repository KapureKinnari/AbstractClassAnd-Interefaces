package Interfaces;

public class CalculatorImpl implements Calculator{
    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void subtract(int a, int b) {
        System.out.println(a-b);
    }

    @Override
    public void divide(int a, int b) {
        System.out.println(a/b);
    }

    @Override
    public void multiply(int a, int b) {
        System.out.println(a*b);
    }

//    @Override //optional to be implemented or not
//    public void display() {
//        System.out.println("Called from class");
//    }

    //    @Override
//    public void squareRoot(double a) {
//        System.out.println(Math.sqrt(a));
//    }
}
