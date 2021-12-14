package lesson2HW3;

public class Calculator3 {

    public int divisonNumbers(int var1, int var2) {
        try {
            int tempResult = var1 / var2;
            System.out.println("Int numbers divison: " + var1 + " / " + var2 + " = " + tempResult);
            return tempResult;
        } catch (ArithmeticException e) {
            System.out.println("Divison by zero is not allowed");
            return var2;
        }catch (Exception e) {
            System.out.println("Unexpected error is occurred. Divison by zero is not allowed");
            return  var2;
        }finally {
            System.out.println("The Finally block which is run every time within this try catch structure");
        }
    }

    public double divisonNumbers(double var1, double var2) {
        double tempResult = var1 / var2;
        System.out.println("Double numbers divison: " + var1 + " / " + var2 + " = " + tempResult);
        return tempResult;
    }
}
