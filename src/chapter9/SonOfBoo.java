package chapter9;

/**
 * Created by robertsg on 5/3/2016.
 */
public class SonOfBoo extends Boo {

    public SonOfBoo() {
        super("boo");
    }

    public SonOfBoo(int i) {
        super("Fred");
    }

    public SonOfBoo(String s) {
        super(42);
    }

//    Third Option symbol: constructor Boo()
//    public SonOfBoo(int i, String s) {
//
//    }

//    First Option symbol: constructor Boo(string, string)
//    public SonOfBoo(String a, String b, String c) {
//        super(a,b);
//    }

    public SonOfBoo(int i, int j) {
        super("man", j);
    }

//    Second Option symbol: constructor Boo(int, string)
//    public SonOfBoo(int i, int x, int y) {
//        super(i, "star");
//    }

}
