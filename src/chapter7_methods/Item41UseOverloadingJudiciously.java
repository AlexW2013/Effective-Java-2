package chapter7_methods;

/*
    The choice for which overloaded function is used is decided at compile time.
    The choice for which overridden function is used is decided at runtime.


    Try to avoid confusing uses of overloaded methods.
    A good policy to follow is to never overload a method with an identical number of parameters.
 */
public class Item41UseOverloadingJudiciously {

    //Try to avoid doing this
    public void overLoaded(int n){

    }

    //While this is legal, as both methods take in different parameters, it can be confusing which method is called
    public void overLoaded(double d){

    }
}
