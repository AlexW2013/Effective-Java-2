package chapter4_classes_and_interfaces;

/*
 A function object is a class that explicitly performs operations on other objects.
 For strategies that may act on many different types of objects, a function interface can be used
 */
public class Item21FunctionObjectsRepresentStrategies {

}

//This object is only used to compare the length of two different string
class StringComparator{
    //Since this class is used as a function object, and has no instance variables, we only need one instance of this class
    //Therefore, we can make this class a singleton, to save memory
    private static final StringComparator stringCompInstance = new StringComparator();
    private StringComparator(){}

    public StringComparator getStringCompInstance(){
        return stringCompInstance;
    }

    //The main purpose of this function object: to compare the length of two strings
    public boolean isLongerThan(String s1, String s2){
        return s1.length() > s2.length();
    }
}

//An interface can be used as a baseline strategy; for example the comparator interface
//Any function object that wants to compare two objects of an identical type can implement this interface
interface Comparator<T>{
    public boolean compare(T t1, T t2);
}
