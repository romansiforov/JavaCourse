package lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        Map<String, String> ourMap = new HashMap<>();
        ourMap.put("Login", "Test");
        System.out.println(ourMap);
        ourMap.put("Password", "12345");
        System.out.println(ourMap);
        System.out.println(ourMap.get("Login"));
        ourMap.remove("Login");
        System.out.println(ourMap);
        ourMap.put(null, "12345");
        System.out.println(ourMap);

        System.out.println("------------------------------------------");

        //login | password |
        //test1 | 1234     |
        //test2 | 234      |

        ArrayList<HashMap<String, String>> table = new ArrayList<>();

        HashMap<String, String>  line1 = new HashMap<>();
        line1.put("login","test1");
        line1.put("pass" , "123");
        table.add(line1);

        HashMap<String, String>  line2 = new HashMap<>();
        line2.put("login","test2");
        line2.put("pass" , "234");

        table.add(line2);

        System.out.println(table);

        System.out.println(table.get(1).get("pass"));


    }
}
