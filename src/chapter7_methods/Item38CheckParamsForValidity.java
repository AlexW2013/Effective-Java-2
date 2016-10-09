package chapter7_methods;

/*
    For any methods that require restrictions on parameters passed in, document and
    enforce all these restrictions at the beginning of the method
 */
public class Item38CheckParamsForValidity {

    //This method acts only on positive integers; check the validity at the beginning, and document it
    //However, such a check can be skipped if it is extremely costly, such as checking all indices in a large array
    public void noNegativesPassedInm(int param){
        //Only positive integers may be passed in
        if (param < 0){
            //You can throw an exception here if you want
            throw new IllegalArgumentException("Param must be positive, it is: " + param);
        }
    }
}
