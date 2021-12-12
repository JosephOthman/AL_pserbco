import java.util.ArrayList;

public class AlTester {

	public static boolean isSorted(ArrayList<Integer> list) {

		for (int i = 1; i < list.size(); i++) {
			if (((int)list.get(i)) < ((int)list.get(i-1))) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(10);

		System.out.println(list);

		for (int i = 0; i < 24; i++) {
			list.add((int)(Math.random()*10));
		}

		
		System.out.println(list);
		System.out.println("Is the list sorted?" + isSorted(list));


		list.clear();
		System.out.println(list);

		for (int i = 0; i < 24; i+= 2) {
			list.add(i);
		}
		list.add(1);
		System.out.println(list);
		System.out.println("Is the list sorted?" + isSorted(list));

		System.out.println();

		// not string representation (no idea if there is a string representation)
		System.out.println(list.iterator());
	}
}