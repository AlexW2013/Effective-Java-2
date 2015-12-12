package chapter2_create_destroy_objects;


import java.util.HashMap;

/*
    Try to look out for unnecessary object creation, especially when creation is expensive
    Try your hardest to reuse objects, but it is still best to initialize and create objects/variables
    with the smallest possible scope, as compiler optimizations make creating small objects cheap
 */
public class Item5AvoidCreatingUnnecessaryObjects {

    //To prevent creation of expensive objects each time a method is called, you can initialize them in
    //initializer blocks, like so
    //Look to do this when certain methods are called extremely often, as constant creation can be a resource hog

    //An instance initializer is initialized each time an instance is created
    {
        //Expensive object creation in here
        HashMap<Integer, String> expensiveMap = new HashMap<Integer, String>();
    }
    //On the other hand, a class initializer block is initialized when the class itself is loaded
    static{
        //Expensive object that is shared across all instances of this class
    }



    //Take care that autoboxing doesnt create a huge resource hog!
    public void autoBox(){
        Integer sum = 0;
        //This is bad, as Java autoboxes Integer and int, which will create a huge amount of Integer instances
        //as an Integer i instance is created each time to be added to sum
        //use int sum instead of Integer sum!

        //best to do this before:
        int intFromInt = sum;

        for (int i = 0; i < 100000; i++) {
            intFromInt += i; //This is not autoboxed for each loop!
            sum += i;        //This is, and can cause slowdowns
        }
    }
}
