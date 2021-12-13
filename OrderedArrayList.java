// Clyde "Thluffy" Sinclair
// APCS pd00
// Lab02
// 2021-12-13

/**********************************************
 * class OrderedArrayList
 * wrapper class for ArrayList
 * maintains invariant that elements are ordered (ascending)
 * (SKELETON)
 **********************************************/


import java.util.ArrayList;

public class OrderedArrayList
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables
  public OrderedArrayList()
  {
    _data = new ArrayList<Integer>(); // empty constructor means inital capacity of 10
  }

  public String toString()
  {
    return _data.toString();
  }

  public Integer remove( int i )
  {
    Integer oldVal = _data.get(i);
    _data.remove(i);
    return oldVal;
  }

  public int size()
  {
    return _data.size();
  }

  public Integer get( int i )
  {
    return _data.get(i);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
    boolean skip = false;
    int N = _data.size();
    for (int i = 0; i < N; i++) {
        if (_data.get(i) >= newVal) {
            _data.add(i, newVal);
            skip = true;
            break;
        }
    }
    if (skip == false) {
        _data.add(newVal);
    }
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {
    // int N = _data.size();
    // while (N >= 1) {
    //     int middle = 1 + (N - 1) / 2;
  
    //     if (_data.get(middle) < newVal) {
    //         _data.add(middle+1, newVal);
    //     } else if (_data.get(middle) > newVal) {
    //         _data.add(middle-1, newVal);
    //     } else {
    //         _data.add(middle, newVal);
    //     }
    //     N--;
    // }
    // if (N == 0) {
    //     _data.add(newVal);
    // }
  }

  // main method solely for testing purposes
  public static void main( String[] args )
  {

    OrderedArrayList Franz = new OrderedArrayList();

    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );

    /*-----v-------move-me-down-----------------v--------*/

    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
      Franz.addBinary( (int)( 50 * Math.random() ) );

    System.out.println( Franz );


      /*=====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList
