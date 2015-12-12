package chapter2_create_destroy_objects;

/*
    While Java has garbage collection, which means you dont need to manually manage your memory
    There are still circumstances where you should be nulling obsolete references
    While this should be the exception, it should be done in classes that manage their own memory, such as a stack
 */

class testObj{
    int data;
}

public class Item6EliminateObsoleteObjRefs {
    //int[] examplestack; There is no need to null primitive types like an int; you cannot nullify them even if you wanted too
    testObj[] exampleStack; //You should only nullify a stack if it holds actual data objects
    private int size = 1024;
    private static final int MAX_SIZE = 1024;

    public testObj[] newStack(){
        exampleStack = new testObj[MAX_SIZE];
        return exampleStack;
    }

    public testObj pop(){
        //The memory leak error occurs here, as although you are decrementing the size
        //The old object at size+1 is still being referenced, and will NOT be garbage collected
        //While minor, this can return significant memory leaks when your program creates many stacks and decrements them
        return exampleStack[--size];
    }

    //The proper way to do this is here:
    public testObj betterPop(){
        testObj returnInt = exampleStack[size-1];
        exampleStack[size] = null; //Nullify the object here, and eliminate the obsolete reference.
        return returnInt;


    }
}
