package chapter8_general_programming;

/*
    Try to minimize local variable scope whenever possible.

    Declare a variable where it is first used, instead of at the top level.

    Also, try not to declare a variable unless you can initialize it. If there is not enough info
    to initialize a variable, do not declare it yet.
 */
public class Item45MinimizeScopeOfLocalVariables {

    //Dont do this, as it pollutes the global namespace and may cause hidden bugs if another method accesses this variable
    int methodVar = 6;

    public void intMethod(){
        //Instead, declare the variable here where it is first used
        //Review: variables can have the same name if they have different scopes. The local scope variable will be used instead
        int methodVar = 7;
        System.out.println(methodVar);
    }

}
