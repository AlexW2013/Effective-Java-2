package chapter8_general_programming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Using a for-each loop can avoid errors based on the iterator/index variable
 */
public class Item46PreferForEachLoops {

    public static void typesOfForLoops(){
        //Item 45: Minimize scope, and don't declare a variable unless you can initialize it
        List<Integer> arrayListOfInts = new ArrayList<>();
        int sum = 0;


        //Try to avoid using for loops to iterate over a collection/array
        for (int i = 0; i < arrayListOfInts.size(); i++) {
            sum += arrayListOfInts.get(i);
        }

        //Instead, use a for-each loop
        for (Integer i : arrayListOfInts) {
            sum += i;
        }
    }



    /*
        However, there are still some places that you can't use a for-each loop
        1. Filtering - You cant use a for-each loop when both iterating over an array WHILE needing to remove elements
           in the process. Still use .iterator() for this.
        2. Transforming - You may need the index/iterator to REPLACE(not modify!) an element in a collection. Example below
        3. Parallel iteration - You will still need explicit control over the index/iterator when traversing
           multiple collections in parallel.
     */

    //Transforming - Replacing: Re-assignment in a for-each loop will not work, as it simply creates a copy of each array element
    public static void main(String[] args){
        List<Integer> arrayListOfInts = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        for(Integer i :arrayListOfInts){
            if (i%2 == 0){
//                This does not do anything to the variable in the original array, as the foreach loop in the beginning
//                essentially makes a copy of the variable, such as Integer i = arrayListOfInts.get(index)
                i = 200;

//                However, you would be able to MODIFY an object here, as i.changeVar will still work, since
//                objects are modified by reference
//                ex: i.changeValueTo(200);
            }
        }

        System.out.println(arrayListOfInts.toString());
    }
}
