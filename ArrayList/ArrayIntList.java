// Class ArrayIntList can be used to store a list of integers.


// an object encapsulates state and exposes behavior.
        // encapsulation protects the innards of the state (class)
public class ArrayIntList {
    private int[] elementData; // list of integers
    private int size;          // current number of elements in the list
    
    // can have more than one construtor
        // called overloading
    
    public ArrayIntList() {
        this(100);
    }
    // constructs a list with a capacity of 100
    public ArrayIntList(int capacity) {
        elementData = new int[capacity];
        size = 0;
    }

    // getters/ and setters
    // post: returns the current number of elements in the list
    public int size() {
        return size;
    }
    
    // STYLING GUIDE: 
        // contract
        // pre-conditions: index >= 0 and index < size() (throws IndexOutOfBoundsException if not)
        // post-conditions: returns the value at the given index
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        
        return elementData[index];
    }

    // returns a comma-separated, bracketed version of the list
    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            String result = "[" + elementData[0];
            for (int i = 1; i < size; i++) {
                result += ", " + elementData[i];
            }
            result += "]";
            return result;
        }
    }

    public int indexOf (int value) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(int value) {
        // boolean zen
            /*(if (indexOf(value) >= 0) {
            //     returns true;
            // }   else {
            //     return false;
            } 
            */
        return (indexOf(value)) >= 0;
    }
    
    // appends the given value to the end of the list
    public void add(int value) {
        elementData[size] = value;
        size++;
    }

    public void add (int index, int value) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData [i - 1];
        }
        elementData[index] = value;
        size++;
    }

    public void addAll (ArrayIntList other) {
        for (int i = 0; i < other.size; i++) {
            add (other.elementData[i]);
        }
    }

    public void remove (int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
    }
}