package lesson3;

import java.sql.SQLOutput;
import java.util.Locale;

public class MainClassString {
    public static void main(String[] args) {
        String line = "test";

        System.out.println(line.length());
        System.out.println(line.toUpperCase());
        System.out.println("-----------------");
        System.out.println(line.substring(1,2));
        System.out.println(line.substring(3));

        String line2 = " Testing 2 ";
        System.out.println("'"+line2.trim()+"'");

        String line3 = new String("test");
        if (line.equals(line3)){
            System.out.println("Equals");
        }
        else {
            System.out.println("Not equals");
        }

        String line4 = "test;test1;test2";
        String []arrayString = line4.split(";");
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }

        System.out.println(line4.replace(";","@"));

        System.out.println(line4.split(";")[2].toUpperCase().substring(0,4));

    }
}
