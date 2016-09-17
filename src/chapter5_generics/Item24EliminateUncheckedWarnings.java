package chapter5_generics;

import java.util.HashMap;
import java.util.Map;

/*
    Try to eliminate all unchecked warnings that you can, as they can cause classcast exceptions
    Removing all unchecked warnings will ensure your code is type safe
 */
public class Item24EliminateUncheckedWarnings {

    public static void main(){
        //This is an unchecked warning
        Map<String, Integer> uncheckedMap = new HashMap();

        Map<String, Integer> checkedMap = new HashMap<String, Integer>();
    }

}
