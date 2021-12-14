package Lesson1;

public class MainClass {
    public static void main(String[] ars){
        System.out.println("Hello World");
        int var;
        var=5;
        int var2=10;
        int result= var+var2;
        String str1="Test ", str2="Auto";

        System.out.println(result);
        System.out.println("Result = "+(result+var+var2));

        Calc.sum(var,var2);

        Calc calc = new Calc();
        calc.mult(var,var2);
        calc.mult(var,10);

        int result1 = calc.mult(var,100);
        System.out.println("Extra way = "+ result1);

        calc.sum("Lesson ", "One");
        calc.sum(str1, str2);
        calc.sum(calc.sum(str1, str2), "One");

    }
}

