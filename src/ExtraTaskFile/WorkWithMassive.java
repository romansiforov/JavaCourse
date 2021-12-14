package ExtraTaskFile;

import java.util.Random;

public class WorkWithMassive {
    public int[] fillArrayWithRandomValues(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }
        return array;
    }


}
