package lesson4HW5;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        WorkingWithLists workingWithLists = new WorkingWithLists();
        List<Integer> list = new ArrayList<>();
        list = workingWithLists.fillList(list, 10);
        System.out.println(list);

        Integer maxElementList = workingWithLists.findMaxElement(list);

        workingWithLists.reverse(list);
    }
}
