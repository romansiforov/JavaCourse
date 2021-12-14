package lesson2HW3;

public class WorkWithArrays {

    public void analyzeArray(int[] array, int varForComparing) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > varForComparing) {
                System.out.println(array[i] + " Value is more than " + varForComparing);
            } else if (array[i] == varForComparing) {
                System.out.println(array[i] + " Value is equal  " + varForComparing+" Equal number detected");
            }else{
                System.out.println(array[i] +" Value is less than " + varForComparing);
            }
        }
    }
}
