package lesson2HW3;

import java.util.Random;

public class MainClassForHW3 {
    public static void main(String[] args) {

        Random random = new Random();

        double varDouble1 = 100.345, varDouble2 = 23.789;
        int var1 = 123, var2 = 13;

        Calculator3 calculator3 = new Calculator3();

        calculator3.divisonNumbers(varDouble1, varDouble2);

        calculator3.divisonNumbers(varDouble1, 0);

        calculator3.divisonNumbers(var1, var2);

        calculator3.divisonNumbers(var1, 0);

        int max = 50;
        int min = 10;
        int diff = max - min;
        int[] array = new int[random.nextInt(diff + 1)];

        int[] array2 = {12, 5, -3, 45, 0, 10};

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(diff + 1);
            System.out.println(array[i]);
        }

        WorkWithArrays workWithArrays = new WorkWithArrays();
        System.out.println("---------------Working with array 1-------------------");
        workWithArrays.analyzeArray(array, 5);
        System.out.println("---------------Working with array 2-------------------");

        workWithArrays.analyzeArray(array2, 45);
        System.out.println("---------------Working with array 1 having random numberFor Compare-------------------");
        workWithArrays.analyzeArray(array, random.nextInt(100));

    }
}
