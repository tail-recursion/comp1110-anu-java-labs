package comp1110.lab2;

public class Countries {
    /*
    **Countries**

    Inside the package `comp1110.lab2` make a new class `Countries`. Inside your
    new class create an array of `String`s that has the names of the following
    countries: Germany, Argentina, Netherlands, Brazil. Print out the elements
    of the array on separate lines (you do not need to use a loop for this,
    just use fixed indices into the array).
     */
    static String[] countries= { "Germany", "Argentina", "Netherlands", "Brazil" };

    public static void main(String[] args) {
        for (String s : countries) System.out.println(s);
    }
}
