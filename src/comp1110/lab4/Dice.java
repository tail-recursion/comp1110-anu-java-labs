package comp1110.lab4;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        /*
        In the Java package `comp1110.lab4`, within your labs repo, create a new Java
        class, `Dice`, that prints 10 randomly-generated integers. Each time you run
        the program it should, with very high probability, print a different set of
        integers. The integers should be strictly between 9 and 16. That is, each
        of the numbers will be in the set of numbers {10, 11, 12, 13, 14, 15}.  You
        should make use of the `java.util.Random` library, as discussed in lectures.
         */
        Random random = new Random();
        for (int i=0; i < 10; i++) {
            int r = random.nextInt(6) + 10;
            System.out.println(r);
        }
    }
}
