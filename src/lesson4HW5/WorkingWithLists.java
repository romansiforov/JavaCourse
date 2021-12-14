package lesson4HW5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorkingWithLists {
    public List<Integer> fillList(List<Integer> arrayList, int size) {
        for (int i = 0; i < size; i++) {
            arrayList.add(new Random().nextInt(100));
        }
        return arrayList;
    }

    public int findMaxElement(List<Integer> arrayList) {
        int temMax = arrayList.get(0);
        for (int i=1; i<arrayList.size();i++) {
            if (temMax <= arrayList.get(i)) {
                temMax = arrayList.get(i);
            }
        }
        System.out.println("The max value is " + temMax);
        return temMax;
    }

    public List<Integer> reverse(List<Integer> arrayList) {
        List<Integer> tmpList = new ArrayList<>();
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            tmpList.add(arrayList.get(i));
        }
        arrayList = tmpList;
        System.out.println("Reverse is done " + arrayList);
        return arrayList;
    }
}
