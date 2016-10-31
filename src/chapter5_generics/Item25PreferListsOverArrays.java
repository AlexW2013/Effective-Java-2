package chapter5_generics;

import java.util.ArrayList;
import java.util.List;

/*
    Difference between arrays and generics:
    1. Arrays are covariant, not invariant; obj[] can be a subtype of superobj[]
    2. Arrays are reified; they enforce type constraints at runtime, NOT compile-time like generics

    Due to these attributes, try to avoid using arrays and generics together. Instead, use lists
 */
public class Item25PreferListsOverArrays {
    public static void main(){
        //This will throw an arraystoreexception at runtime
        Object[] intArray = new Integer[5];
        intArray[2] = "hello"; //This will throw an exception only at runtime; it will still compile

        //However, this will throw a compile error, which is much better for debugging purposes
        /*
        List<Object> listOfObjects = new ArrayList<Integer>();
        listOfObjects.add("hello");
        */
    }
}
