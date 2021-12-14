package lesson6;

import org.apache.log4j.Logger;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Test");

        //1) .jar
        //2) .properties
        //3) [Class]

        Logger logger = Logger.getLogger("MainClass");
        logger.info("Test info");
        logger.debug("Test debug");
        logger.error("Test Error");


        Console console = new Console();
        console.printText();

        int [][] massive = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                System.out.print(massive[i][j]);
            }
            System.out.println();
        }
    }
}
