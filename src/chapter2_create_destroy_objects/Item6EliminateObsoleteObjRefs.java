package chapter2_create_destroy_objects;

/*
    While Java has garbage collection, which means you dont need to manually manage your memory
    There are still circumstances where you should be nulling obsolete references
    While this should be the exception, it should be done in classes that manage their own memory, such as a stack
 */
public class Item6EliminateObsoleteObjRefs {
    int[] exampleStack;
    private int size = 1024;
    private static final int MAX_SIZE = 1024;

    public int[] newStack(){
        exampleStack = new int[MAX_SIZE];
        return exampleStack;
    }

    public int pop(){
        //The memory leak error occurs here, as although you are decrementing the size
        //The old object at size+1 is still being referenced, and will NOT be garbage collected
        //While minor, this can return significant memory leaks when your program creates many stacks and decrements them
        return exampleStack[--size];
    }

    //The proper way to do this is here:
    public int betterPop(){
        int returnInt = exampleStack[size-1];
        //exampleStack[size] = null; Nullify the object here, and eliminate the obsolete reference
        return returnInt;


    }
}
