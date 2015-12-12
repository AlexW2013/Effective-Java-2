package chapter3_common_obj_methods;

/*
    To implement comparable, implement the interface and override the method compareTo()
    This is not done automatically for created object classes

    The rules/general contract it follows is similar to .equals()

    Why implement this class? Because if you do, you allow many generic algo's and collections to
    interact with your class, which include many Java value classes

    Examples for good classes to implement comparable are any classes that have some sort of
    natural ordering, such as alphabetically or numerically based on some variable

 */
public class Item12ImplementComparable implements Comparable<Item12ImplementComparable> {


    //x.compareTo(y) returns -1 if x < y, 0 if x == y, or 1 if x > y
    //1.compareTo(2) => -1
    @Override
    public int compareTo(Item12ImplementComparable o) {
        return 0;
    }
}
