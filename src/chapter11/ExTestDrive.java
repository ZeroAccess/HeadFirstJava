package chapter11;

/**
 * Created by robertsg on 5/9/2016.
 * */

class MyEx extends Exception {}

public class ExTestDrive {
    public static void main(String[] args) {
        String test = args[0];
        System.out.println("t");
        try {
            doRisky(test);
            System.out.println("o");
        } catch (MyEx e) {
            System.out.println("a");

        } finally {
            System.out.println("w");
        }
        System.out.println("s");
    }

    static void doRisky(String t) throws MyEx {
        System.out.println("h");
        if("yes".equals(t)) {
            throw new MyEx();
        }
        System.out.println("r");
    }
}