# AL_pserbco
## pserbco
#### Paul Serbanescu, Joseph Othman, Andrew Piatetsky

## ALTester
  Has method isSorted(ArrayList<Integer>), returning true if the list is sorted, false if not. The algorithm for this was to check each pair of consecutive
  elements in the ArrayList, and to check if the element with greater index is smaller than the element with smaller index. If this was ever true within
  the ArrayList, then the method returns false. Otherwise, the method returns true.
  
  Ex: [2,3,1]
  The method will compare the 2 and the 3. Because 3 is greater than 2, nothing is returned; the ArrayList as of now is considered to be sorted.
  The method then compares the 3 and the 1. Because the 1 is less than the 3, the method will now consider the ArrayList as unsorted, and will
  return false.

## OrderedArrayList
* OrderedArrayList() (default constructor): initializes _data to be a new ArrayList of Integers.
* toString(): returns _data.toString, using the toString method of class ArrayList.
* remove(int i): removes the element with index i in ArrayList _data; returns the value of the removed element.
* size(): returns _data.size()
* get(int i): returns _data.get(i), the value of the element at index i of ArrayList _data.
* addLinear(Integer newVal): it goes through each element in an ArrayList until it finds a value that is larger than newVal, then it adds newVal at the index (uses insert methods)
