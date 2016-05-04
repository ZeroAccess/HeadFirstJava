package chapter9;

import java.util.ArrayList;

/**
 * Created by robertsg on 5/3/2016.
 */
public class TestLifeSupportSim {
    public static void main(String[] args) {
        ArrayList aList = new ArrayList();
        V2Radiator v2 = new V2Radiator(aList);
        V3Radiator v3 = new V3Radiator(aList);
        for(int z = 0; z < 20; z++) {
            RetentionBot ret = new RetentionBot(aList);
        }

        System.out.println("V2Radiator Power Level: " + SimUnit.v2PowerLevel);
        System.out.println("V3Radiator Power Level: " + SimUnit.v3PowerLevel);
        System.out.println("Retention Power Level: " + SimUnit.RetentionPowerLevel);
    }
}
