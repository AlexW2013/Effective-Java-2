package chapter3_common_obj_methods;

/*
    Note: This has nothing to do with overriding .equals()!

    Always overriding toString will make a class more pleasant to use
    toString() is automatically invoked when an object is passed into printf, printlm, ect.
    If you dont override it, the returned info. may not be what you want
 */
public class Item10AlwaysOverrideToString {

    @Override public String toString(){
        String s = "";

        //Always try to return all interesting/valuable information in toString

        return s;
    }
}
