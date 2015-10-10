package chapter2_create_destroy_objects;

/**
 * Created by AlexW on 10/10/15.
 */


//Consider using static factory methods to create an object instead of a constructor

public class Item1StaticFactoryMethods {

    public static void main(String [] args){

        //This is how using a normal constructor looks like:
        FactoryExample newFac = new FactoryExample(5);

        //This is what using a factory looks like
        FactoryExample factory = FactoryExample.createFactoryWithoutData();
        //A big benefit to this is that constructors have descriptive names, so it is much easier to read
        //In this example, you know the factory is initialized without any data


        //Other benefits include:
        // static factories are not required to return a brand new object, unlike constructors
        // static factories can turn an object of any subtype of their return type
        // they can also reduce text verbosity, in rare instances

        //Cons include:
        // classes without public or protected constructors, only private ones, cannot be subclassed
        // static factory methods are not distinguishable from other static methods, which might affect API readability
    }

}

class FactoryExample{
    int data;

    //A normal constructor has no return type
    public FactoryExample(int data){this.data = data;}

    //If desired, you can also use a PRIVATE constructor to completely prevent instantiation
    //without a factory! This is used in a singleton class
    private FactoryExample(){}

    //A factory is declared like static {classname}
    public static FactoryExample createFactoryWithoutData(){
        return new FactoryExample();
    }
}
