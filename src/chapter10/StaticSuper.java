package chapter10;

/**
 * Created by robertsg on 5/3/2016.
 */
public class StaticSuper {

    static {
        System.out.println("super static block");
    }

    StaticSuper() {
        System.out.println("super constructor");
    }
}