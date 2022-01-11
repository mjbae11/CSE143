// sample client code that manipulates two ArrayIntList objects

public class ArrayIntListClient {
    public static void main(String[] args) {
        ArrayIntList list1 = new ArrayIntList(200);
        ArrayIntList list2 = new ArrayIntList(500);
        ArrayIntList list3 = new ArrayIntList();
        list1.add(1);
        list1.add(82);
        list1.add(97);
        list2.add(7);
        list2.add(-8);
        System.out.println("list1 size = " + list1.size());
        System.out.println("list2 size = " + list2.size());
        System.out.println("list3 size = " + list3.size());
    }
}