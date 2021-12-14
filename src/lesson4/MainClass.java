package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<String> ourList = new ArrayList();
        System.out.println(ourList);
        ourList.add("Test");
        System.out.println(ourList);
        ourList.add("Test2");
        ourList.add("Test3");
        System.out.println(ourList);
        System.out.println(ourList.size());
        System.out.println(ourList.get(1));
        System.out.println("------------------------------------------");
        String var = "war";
        ourList.add(var);
        System.out.println(ourList);
        ourList.add("");
        ourList.add("Test5");
        System.out.println(ourList);
        System.out.println(ourList.get(5));
        ourList.remove(1);
        System.out.println(ourList);
        ourList.add(0,"NEW TEST");
        ourList.set(0,"EDITED");
        System.out.println(ourList);
        for (int i = 0; i < ourList.size();i++){
            System.out.println(i+"-"+ourList.get(i));
        }
        System.out.println("-----------------------------------------");

        for (String element:ourList) {
            System.out.println("-"+element);
        }
        System.out.println("-----------------------------------------");

        List<Integer> arrayListInteger = new ArrayList<>();
        arrayListInteger.add(22);
        arrayListInteger.add(33);
        arrayListInteger.add(66);
        arrayListInteger.add(44);

        System.out.println(arrayListInteger);
        System.out.println(Collections.max(arrayListInteger));
        Collections.reverse(arrayListInteger);
        System.out.println(arrayListInteger);

        Collections.sort(arrayListInteger);
        System.out.println(arrayListInteger);
        System.out.println("-----------------------------------------");


        System.out.println("---------------THE END--------------------");


    }
}
