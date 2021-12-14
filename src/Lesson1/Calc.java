package Lesson1;

public class Calc {
    public static void sum(int num1, int num2){
        int tempResult = num1+ num2;
        System.out.println("Result from method sum() = "+tempResult);
    }

    public String sum(String str1, String str2){
        String temResult = str1+str2;
        System.out.println("Sum strings = "+temResult);
        return temResult;
    }

    public int mult(int num1, int num2){
        int tempResult;
        tempResult=num1*num2;
        System.out.println("Result from method mult() = "+tempResult);
        return tempResult;
    }
}
