import java.util.ArrayList;

public class ALTester {

    public static boolean isSorted(ArrayList<Integer> list) {

        for (int i = 1; i < list.size(); i++) {
          if (((int)list.get(i)) < ((int)list.get(i-1))) {
            return false;
          }
        }

        return true;

    }

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

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 23; i++) {
    			list.add(i);
    		}

        System.out.println("Printing ordered list...");
        System.out.println(list);
        System.out.println("Is the list sorted? " + isSorted(list));

    		list.add(1);
        System.out.println("Printing unordered list...");
    		System.out.println(list);
    		System.out.println("Is the list sorted? " + isSorted(list));

    		System.out.println();

    		// not string representation (no idea if there is a string representation)
    		System.out.println(list.iterator());

    }
}
