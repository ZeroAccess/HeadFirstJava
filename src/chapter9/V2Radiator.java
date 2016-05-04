package chapter9;

import java.util.ArrayList;

/**
 * Created by robertsg on 5/3/2016.
 */
class V2Radiator {
    V2Radiator(ArrayList list) {
        for(int x = 0; x<5; x++) {
            list.add(new SimUnit("V2Radiator"));
        }
    }
}

class V3Radiator extends V2Radiator {
    V3Radiator(ArrayList lglist) {
        super(lglist);
        for(int g = 0; g < 10; g++) {
            lglist.add(new SimUnit("V3Radiator"));
        }
    }
}

class RetentionBot {
    RetentionBot(ArrayList rlist) {
        rlist.add(new SimUnit("Retention"));
    }
}

class SimUnit {
    String botType;
    static int v2PowerLevel;
    static int v3PowerLevel;
    static int RetentionPowerLevel;

    SimUnit(String type) {
        botType = type;
        calculate();
    }
    int powerUse() {
        if("Retention".equals(botType)) {
            return 2;
        } else {
            return 4;
        }
    }

    void calculate() {
        switch(botType){
            case "V2Radiator":
                v2PowerLevel += 4;
                break;
            case "V3Radiator":
                v3PowerLevel += 4;
                break;
            case "Retention":
                RetentionPowerLevel += 2;
                break;
            default:
                break;
        }
    }
}
