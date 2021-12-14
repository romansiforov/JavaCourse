package lesson1HW2;

public class MainClassForHW {
    public static void main(String[] args) {

        int var1 = 10, var2 = 8;
        double varDouble1 = 167.99, varDouble2 = 133.56;

        Calculator calculator = new Calculator();

        calculator.subtractionNumbers(var1, var2);

        calculator.subtractionNumbers(var2, var1);

        calculator.subtractionNumbers(122, 65);

        calculator.subtractionNumbers(varDouble1, varDouble2);

        calculator.subtractionNumbers(varDouble2, varDouble1);

        calculator.subtractionNumbers(99.4569, 123.55555776);
    }
}
