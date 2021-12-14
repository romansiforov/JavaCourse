package lesson3;

import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        int[][] array = {{1, -5, 9}, {4, 8, -19}, {0, 76, 99}, {-11, 34}};

        System.out.println(array[1][0]);
        System.out.println("-----------------------------");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        Random random = new Random();

        int[][] array2 = new int[3][4];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = random.nextInt(100);
            }
        }
        printMatrix(array2);

    }

    private static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
