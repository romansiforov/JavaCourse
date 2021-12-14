package lesson1HW2;

public class Calculator {
    public int subtractionNumbers(int var1, int var2) {
        int tempResult = var1 - var2;
        System.out.println("Int numbers subtraction: "+var1+" - "+var2+" = "+tempResult);
        return  tempResult;
    }

    public double subtractionNumbers(double var1, double var2) {
        double tempResult = var1 - var2;
        System.out.println("Double numbers subtraction: "+var1+" - "+var2+" = "+tempResult);
        return  tempResult;
    }
}
