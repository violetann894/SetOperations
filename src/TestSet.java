import java.util.ArrayList;

/**
 * The TestSet class is the holder of the main method to test the SetOperations class.
 * @author Rachel Hussmann
 */
public class TestSet {
    public static void main(String[] args) {
        //Initializes the ArrayList that will hold the sample values
        ArrayList<String> sample = new ArrayList<>();

        //Adding the sample values to the sample ArrayList
        sample.add("Monday");
        sample.add("Tuesday");
        sample.add("Wednesday");
        sample.add("Thursday");
        sample.add("Friday");
        sample.add("Saturday");
        sample.add("Sunday");

        //Initializes the ArrayLists that will be used to test the union, intersect and complement methods
        ArrayList<String> array1 = new ArrayList<>();
        ArrayList<String> array2 = new ArrayList<>();

        //Adding values to array1
        array1.add("Monday");
        array1.add("Tuesday");
        array1.add("Wednesday");

        //Adding values to array2
        array2.add("Wednesday");
        array2.add("Thursday");
        array2.add("Friday");

        //Created the SetOperations object to use in testing
        SetOperations tester = new SetOperations();

        //Finds and prints out the union between array1 and array2
        System.out.println("Union: " + tester.union(array1, array2));

        //Finds and prints out the intersection between array1 and array2
        System.out.println("Intersect: " + tester.intersect(array1, array2));

        //Finds and prints out the ArrayList that is the complement to array1
        System.out.println("Complement: " + tester.complement(array1, sample));
    }
}
