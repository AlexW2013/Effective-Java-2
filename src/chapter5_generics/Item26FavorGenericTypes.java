package chapter5_generics;

import java.util.LinkedList;

/*
    Try to have collection declarations use generic types
 */
public class Item26FavorGenericTypes <E> {
    //Instead of this...
    private LinkedList<Object> linkedL = new LinkedList<>();
    //...Do this
    private LinkedList<E> genericL = new LinkedList<E>();
}
