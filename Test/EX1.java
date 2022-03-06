package Test;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("please enter name and ID in the same row: ");
        String name = scr.next();
        long ID = scr.nextLong();
        EX1 ex1 = new EX1();
        System.out.println("the name is: " + name);
        System.out.println("the new ID is: " + (EX1.newId(ID)));
    }

    public static String newId(long id) {
        String replaceIdToString = Long.toString(id);
        int unit = (int) id % 10;
        int pos = (int) id / 10 % 10;
        String newIdString = replaceIdToString.substring(0, replaceIdToString.length() - pos)
                + unit + replaceIdToString.substring(replaceIdToString.length() - pos);
        return newIdString;
    }
}
