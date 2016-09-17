package chapter5_generics;

import java.util.Collection;
import java.util.LinkedList;

/*
    Chapter 5: Generics in Java
    Generics: T, Object, Integer, Character, ect.

    For projects based on JDK 1.5 and beyond, dont use raw type definitions
 */
public class Item23DontUseRawTypes {

    //Dont do this if you want a collection of only integers, instead use parameterized types
    //This can cause a classcast exception, if a non-integer object is accidentally added into the collection
    public Collection rawIntColl;

    //Better. Adding a non-integer object will throw a compile time exception
    public Collection<Integer> intColl;
}
