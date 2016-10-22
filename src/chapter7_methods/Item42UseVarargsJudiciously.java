package chapter7_methods;

/*
    Take care when using var-args, as they can take zero arguments, and may cause run-time errors
    instead of compile-time errors
 */
public class Item42UseVarargsJudiciously {

    //Varargs can be zero or more arguments
    public void sum(int... args){
        int sum = 0;
        for (int a: args){
            sum += a;
        }
    }


    //However, since varargs can be empty, you may run into run-time errors
    public void sumAgain(int... args){
        //This is not valid, but will not be caught by the compiler
        int first = args[0];
    }
}
