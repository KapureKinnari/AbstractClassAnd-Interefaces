package Interfaces;

public class Entry {
    public static void main(String[] args) {
//        CalculatorImpl calculator  = new CalculatorImpl();
//        calculator.add(10,20);
//        calculator.multiply(20,3);
        Calculator calculator = new CalculatorImpl();
        calculator.add(10,20);
        calculator.display();
        Calculator.someFunction();//this is the static method which will be called using classname
        //here only it can access the calculatorinterface  elements not of Scientific cal. because
        // it is not present in the calculator interface so for that the below we need to do for accessing scientific calc. methods.

//        ScientificCalculator scientificCalculator = new CalculatorImpl();
//        scientificCalculator.squareRoot(5);
//
//        //for accesing both the interfaces we will be doing this as done below
//        AdvancedCalculator advancedCalculator =  new CalculatorImpl();
//        advancedCalculator.add(20,20);
//        advancedCalculator.squareRoot(10);

    }
}
