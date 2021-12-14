package Lesson2;

public class MainClass {
    public static void main(String[] args) {
        Calc2 calc2 = new Calc2();
        int var1 = 10, var2 = 20;
        String str = "10";

        calc2.sumDouble(var1, var2);
        calc2.sumDouble(var1, "122Test");

        calc2.sumDouble("10Test10", var1);

        calc2.sumDouble(str, var1);

        int[] array = {10, 20, 30, 0, 3, 7};

        int[] array2 = new int[3];

        System.out.println("Array  : " + array.length);
        System.out.println("Array third item : " + array[3]);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                System.out.println("Item is more than 5 : " + array[i]);
            }
            else{
                System.out.println("The item "+array[i]+" is less than 5");
            }
        }

        System.out.println("---- The end-----");
    }
}
