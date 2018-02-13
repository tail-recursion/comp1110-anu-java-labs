package comp1110.lab2;

public class Reverse {
    /*
    **Reverse**

    Make a new class `Reverse` within the `comp1110.lab2` package and using a
    `while` loop, write a program that prints (on separate lines) the numbers
    between and including 10 and 30 in reverse order. i.e. the program should
    print on separate lines: 30 29 28 ... 10.

    Test your program using the `L2 Reverse` test.
    */
    public static void main(String[] args) {
        for (int i=30; i >=10; i--) {
            System.out.println(i);
        }
    }
}
