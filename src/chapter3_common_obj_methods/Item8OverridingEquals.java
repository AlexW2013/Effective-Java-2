package chapter3_common_obj_methods;

/*
    If you decide to override equals for an object class that you created, you should always follow the contract:
    1. Reflexive: x.equals(x) is ALWAYS true
    2. Symmetric: x.equals(y) must return/can only return true iff y.equals(x) also does
    3. Transitive: if x.equals(z) returns same as y.equals(z), x.equals(y) must return the same
    4. Consistent: multiple invocations must always return the same value
    5. For any non-null reference x, x.equals(null) is always false.

    Why is it important to maintain the contract? Because many other functions and objects assume the contract is held,
    such as hashmaps and other common objects, interaction with your class could return unexpected results
 */
public class Item8OverridingEquals {


    //Quick review: An overriden method can only be called by a child class with super, such as super.equals()
    @Override public boolean equals(Object o){

        //Symmetric: an example of a violation is forgetting case-sensitivity for certain parts of the .equals() comparison

        //Transitive: This can be broken if a class is extended, and another variable is added to the child class
        //EX: car.equals(SUV) could return differently from SUV.equals(car), if you ignore certain variables
        //In OO languages, you cannot extend an instantiable class and add a variable while still preserving the equals contract

        //Consistency: Don't have unreliable resources in .equals, such as IP, as they may change

        return true;
    }

    /*
        Best practices for overriding equals:
        1. Use == to check for personal reference first, simply for efficiency
        2. Use instanceof to check for equiv types, and return false if not
        3. Cast arguments to correct type
        4. Check all fields
     */
}
