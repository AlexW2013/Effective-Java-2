package chapter7_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
    For any methods that return an array of objects, do not return null; instead, return an empty array.
    Why? This way, you can prevent unwanted errors such as nullpointer exceptions, or additional code that
    is required to handle the null case.
 */
public class Item43ReturnEmptyArraysNotNulls {

    List<Integer> size;

    //Avoid this, as you will have to handle the null case
    public List<Integer> returnSizeNull(){
        if (size.size() == 0){
            return null;
        }
        //Returning a copy of an array will prevent modifications to the original array
        List<Integer> sizeCopy = new ArrayList<>();
        Collections.copy(size, sizeCopy);
        return sizeCopy;
    }

    //Do this instead
    public List<Integer> returnSizeEmpty(){
        if (size.size() == 0){
            return new ArrayList<Integer>();
        }
        List<Integer> sizeCopy = new ArrayList<>();
        Collections.copy(size, sizeCopy);
        return sizeCopy;
    }
}
