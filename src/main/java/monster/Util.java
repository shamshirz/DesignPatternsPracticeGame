package main.java.monster;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by Aaron on 4/30/2015.
 */
public class Util {

    public static Integer randInt(Integer lowerBound, Integer upperBound) {

        // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((upperBound - lowerBound) + 1) + lowerBound;

        return randomNum;
    }

}
