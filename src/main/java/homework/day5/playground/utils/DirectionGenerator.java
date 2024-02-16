package homework.day5.playground.utils;


import java.util.Random;

import static javax.swing.SpringLayout.*;

public class DirectionGenerator {


    public static String generateDirection() {
        Random random = new Random();
        int myInt = random.nextInt(1, 39);
        if (myInt > 0 && myInt <= 9) {
            return NORTH;

        } else if (myInt > 9 && myInt <= 19) {
            return SOUTH;
        } else if (myInt > 19 && myInt <= 29) {
            return WEST;
        } else {
            return EAST;
        }
    }
}
