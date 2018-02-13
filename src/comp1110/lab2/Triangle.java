package comp1110.lab2;

import java.util.Scanner;

public class Triangle {
    /*
        **Triangle**

        Create a class `Triangle` within the `comp1110.lab2` package, that draws
        simple triangles using ASCII characters and prints to standard output. The
        program should read in from the console an integer which represents the
        height (in characters) of the triangle. Use the `*` character to draw the
        resulting triangle. The first line should have one`*`, the second will have
        a `*` followed by one space, followed by a `*`, the third will have three
        spaces, the fourth will have five, etc. The last line will have (height x 2) - 1
        `*`'s. For example, for an input of 5, the output might look like this
        (here a '_' is drawn to represent a space character):
        ```
        ____*
        ___*_*
        __*___*
        _*_____*
        *********
        ```

                ```
         ____*
         ___*_*
         __*___*
         _*_____*
        _*_______*
        ***********
        ```
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int num_spaces_inside = 0; // increases by 1 each level
        int num_spaces_outside = h-1; // decreases by 1 each level
        for (int i=0; i < h; i++) {
            if (i==h-1) { // last row
                for (int j=0; j < 2*h-1; j++) {
                    System.out.print("*");
                }
            }
            else if (i==0) {
                for (int j=0; j<num_spaces_outside; j++) System.out.print(" ");
                System.out.print("*");
                for (int j=0; j<num_spaces_outside; j++) System.out.print(" ");
                num_spaces_inside++;
                num_spaces_outside--;
            }
            else {
                for (int j=0; j<num_spaces_outside; j++) System.out.print(" ");
                System.out.print("*");
                for (int j=0; j<num_spaces_inside; j++) System.out.print(" ");
                System.out.print("*");
                for (int j=0; j<num_spaces_outside; j++) System.out.print(" ");
                num_spaces_inside += 2;
                num_spaces_outside--;
            }
            System.out.println("");
        }
    }
}
