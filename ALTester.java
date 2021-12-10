import java.util.ArrayList;

public class ALTester {
    public static void main(String[] args) { 
        // =================== PRE TESTS =================== //
        // similar to how we did new SuperArray() <- parentheses are needed because ArrayList has methods and constructors
        ArrayList<Integer> altest = new ArrayList<Integer>(); // you do not define memory size at initialization
        // ArrayLists have built in toString
        System.out.println(altest); // prints [] not some memory val

        altest.add(5);
        System.out.println("Printing altest after adding 5...");
        System.out.println(altest);

        altest.add(20);
        System.out.println("Printing altest after adding 20...");
        System.out.println(altest);

        System.out.println("Printing the size of altest...");
        System.out.println(altest.size());

        int SIZE = altest.size();

        for (int i = 0; i < SIZE; i++) {
            altest.add((int)(Math.random()*5));
        }

        System.out.println("Printing altest after adding 2 random numbers...");
        System.out.println(altest);

        // =================== END PRE TESTS =================== //


        // ~~~~~~~~~~~~~~~ START ALTEST ~~~~~~~~~~~~~~~ //
        // create ArrayList with 23 Integers
        // determine whether sorted or not
        // imlement class OrderedArrayList, wrapper class for ArrayList maintaining ordered state always
    }
}