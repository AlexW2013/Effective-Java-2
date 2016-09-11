package chapter4_classes_and_interfaces;

/*
    An immutable class is a class whose instances(new object) cannot be modified
    Any variable values cannot be changed from initialization

    Why make an immutable class? It can be easier to implement and maintain, as you do not need to worry about
    api changes and possible data errors.

    They are also thread-safe, and can be used as building blocks for other objects.
 */

//By using the final keyword, a class can not be subclassed/extended
public final class Item15MinimizeObjectMutability {
    //Use private variables, along with the keyword final
    private final int var = 15;

    //Ensure there are no accessor methods
}
