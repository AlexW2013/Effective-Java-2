package chapter3_common_obj_methods;

/*
    Always override hashCode() if you override equals()!
    If you don't, any hash based collections(HashMap, HashSet, ...) will not properly work with your objects

    Contract for hashCode:
    1. Consistency: If called more than once on same object, must return same hash value
    2. If two objects are equal according to .equals(), must return same hashCode
    2.5: However, hashCode does not need to return different results for unequiv. objects. But it may be more efficient
    as you don't want too many objects in the same bucket.
 */
public class Item9AlwaysOverrideHashcode {

    @Override public int hashCode(){
        int code = 1234;

        //While this is legal, it is bad as all objects will end up in the same bucket!

        return code;
    }
}
