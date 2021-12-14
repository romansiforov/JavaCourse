package lesson3HW4;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("----------------HW4Part1---Working with arrays---------------------");
        WorkWithArray workWithArray = new WorkWithArray();
        int[][] array;

        array = workWithArray.arrayFilling(-5, -5, 1);

        array = workWithArray.fillingOfLeftDiagonal(array, 0);

        array = workWithArray.arrayFilling(5,5,1);
        array = workWithArray.fillingOfRightDiagonal(array,0);

        array = workWithArray.arrayFilling(5,5,1);
        array = workWithArray.fillingBothDiagonals(array,0);
        System.out.println("----------------HW4Part2------Working with Strings------------------");

        String baseString ="   Test_String ";

        String firstTaskString = baseString.trim();
        System.out.println("'"+firstTaskString+"'");

        //First way of how to get just Test value
        String secondTaskString = baseString.trim().substring(0,4);
        System.out.println("'"+secondTaskString+"'");

        //Second way of how to get just Test value
        String[] secondTaskStringAlt = baseString.trim().split("_");
        System.out.println("'"+secondTaskStringAlt[0]+"'");


        String thirdTaskString = baseString.trim();
        if(thirdTaskString.toLowerCase().startsWith("t")){
            System.out.println("The first symbol is T");
        }

        String forthTaskString = baseString.trim().replaceFirst("s","y");
        System.out.println("'"+forthTaskString+"'");

    }
}
