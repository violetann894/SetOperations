import java.util.ArrayList;

/**
 * The TestSet class is the holder of the main method to test the SetOperations class.
 * @author Rachel Hussmann
 */
public class TestSet {
    public static void main(String[] args) {
        ArrayList<String> sample = new ArrayList<>();
        sample.add("Monday");
        sample.add("Tuesday");
        sample.add("Wednesday");
        sample.add("Thursday");
        sample.add("Friday");
        sample.add("Saturday");
        sample.add("Sunday");

        ArrayList<String> array1 = new ArrayList<>();
        ArrayList<String> array2 = new ArrayList<>();

        array1.add("Monday");
        array1.add("Tuesday");
        array1.add("Wednesday");

        array2.add("Wednesday");
        array2.add("Tuesday");
        array2.add("Friday");

        SetOperations tester = new SetOperations();

        System.out.println("Union: " + tester.union(array1, array2));

        System.out.println("Intersect: " + tester.intersect(array1, array2));

        System.out.println("Complement: " + tester.complement(array2, sample));
    }
}
