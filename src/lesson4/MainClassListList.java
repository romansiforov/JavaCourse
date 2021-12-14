package lesson4;

import java.util.ArrayList;

public class MainClassListList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> ourListList = new ArrayList<>();
        ourListList.add(new ArrayList<>());
        System.out.println(ourListList);
        ourListList.get(0).add("Test");
        System.out.println(ourListList);
        ourListList.get(0).add("Test1");
        System.out.println(ourListList);

        ourListList.add(new ArrayList<>());
        ourListList.get(1).add("Test2");
        ourListList.get(1).add("Test3");
        System.out.println(ourListList);



    }
}
