import java.util.ArrayList;

public class OrderedArrayList {
    // should keep ArrayList ordered ALWAYS

    // has data that are ArrayLists

    // INSTANCE VARS
    ArrayList _data;
    int _size;


    public OrderedArrayList() {
        _data = new ArrayList(10);
        _size = 0;
    }

    // OVERLOADED CONSTRUCTOR - lets any instance of this class set a custom ordered array list 
    public OrderedArrayList(ArrayList<Integer> list) {
        _data = list;
    }

    // returns the value at index of _data only if the index is smaller than _size
    public int get(int index) {
        if (index >= _size) {
            System.out.println("Not a valid index of this Ordered ArrayList");
            return -1;
        }

        return _data[index];
    }

    // accessor method - returns size
    public int size() {
        return _size;
    }


    public static void main(String[] args) {
        OrderedArrayList list = new OrderedArrayList();

        System.out.println(list);
    }
}