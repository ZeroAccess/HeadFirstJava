package chapter10;

/**
 * Created by robertsg on 5/3/2016.
 * This isn't exact as the formula is fairly basic but this does get it fairly close
 */

import java.util.*;

import static java.lang.System.out;

class FullMoons {
    static int DAY_IM = 1000 * 60 * 60 * 24;
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("EST"));
        c.set(2016,0,23,8,46);
        long day1 = c.getTimeInMillis();

        for (int x = 0; x < 60; x++) {
            day1 += (DAY_IM * 29.52);
            c.setTimeInMillis(day1);
            out.println(String.format("Next full moon on %1$tb %<te,%<tY", c));
        }
    }
}
