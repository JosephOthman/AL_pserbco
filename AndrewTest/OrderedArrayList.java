import java.util.ArrayList;

public class OrderedArrayList {
    // should keep ArrayList ordered ALWAYS

    // has data that are ArrayLists

    // INSTANCE VARS
    ArrayList<Integer> _data;
    int _size;


    public OrderedArrayList() {
        _data = new ArrayList<Integer>(10);
        _size = 0;
    }

    // OVERLOADED CONSTRUCTOR - lets any instance of this class set a custom ordered array list 
    public OrderedArrayList(ArrayList<Integer> list) {
        _data = list;
        _size = list.size();
    }

    // ToString method
    public String toString() {
        return _data.toString();
    }

    // returns the value at index of _data only if the index is smaller than _size
    public int get(int index) {
        if (index >= _size) {
            System.out.println("Not a valid index of this Ordered ArrayList");
            return -1;
        }

        return _data.get(index);
    }

    // accessor method - returns size
    public int size() {
        return _size;
    }

    // SORTING ALGO - not run in constructor because assume the user inputed a sorted ArrayList, or the list is empty
    public void sort() {
        int oldVal = 0;


        for (int z = 0; z < (_size * _size); z++) {

            for (int i = 1; i < _size; i++) {
                if ( ((int)_data.get(i)) < ((int)_data.get(i-1))) {
                    oldVal = _data.get(i-1);
                    _data.set(i-1,_data.get(i));
                    _data.set(i,oldVal);
                }
            }
        }
    }


    public static void main(String[] args) {
        OrderedArrayList list = new OrderedArrayList();

        System.out.println(list);
        System.out.println(list.get(0));

        ArrayList<Integer> ar = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            ar.add((int)(Math.random()*15));
        }
        System.out.println(ar);

        OrderedArrayList newList = new OrderedArrayList(ar);

       
        System.out.println(newList);
        newList.sort();
        System.out.println(newList);

    }
}