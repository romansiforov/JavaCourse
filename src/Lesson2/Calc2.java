package Lesson2;

import com.sun.source.tree.ReturnTree;

public class Calc2 {
    public int sumDouble(int var1, int var2) {
        int tempResult = (var1 + var2) * 2;
        System.out.println("Double sum = " + tempResult);
        return tempResult;
    }

    public String sumDouble(int var1, String str1) {
        String tempResult = var1 + str1 + var1 + str1;
        System.out.println("Double sum = " + tempResult);
        return tempResult;
    }

    /**
     * "11"+5 = 16
     *
     * @param str1
     * @param var2
     * @return
     */
    public Integer sumDouble(String str1, int var2) {
        try {
            Integer tempResult = (Integer.parseInt(str1) + var2) * 2;
            System.out.println("Double sum = " + tempResult);
            return tempResult;
        } catch (NumberFormatException e) {
            System.out.println("Error : " + e);
            return 999;
        } catch (Exception e) {
            System.out.println("Error : " + e);
            return 888;
        } finally {
            System.out.println("Finally");
        }
    }
}
