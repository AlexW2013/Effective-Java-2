package chapter2_create_destroy_objects;

/*
   Using a private constructor, like one used in a singleton class, you can make a class non-instantiable, as nobody
   else outside of the class itself can call its constructor due to the private tag
 */

public class Item4noninstantiableClassPrivateConstructor {

    //Nobody else can call this constructor other than this class, so the class can never be instantiated
    private Item4noninstantiableClassPrivateConstructor(){

    }
    //A side effect of this is that this class can never be subclassed, as all child constructors
    //must invoke the superclass constructor, explicitly or implicitly
}
