package chapter4_classes_and_interfaces;

/*
    In public classes, never use public instance variables; instead, make then private and use methods to modify the values
 */
public class Item14UseAccessorMethodsInPublicClasses {

    public int accessVar; //Dont do this! This is not thread-safe, and does not benefit from encapsulation.

    private int accessVarV2; //Do this instead, and modify the values with get/set methods


    public int getAccessVar(){
        return accessVarV2;
    }

    public void setAccessVar(int newv){
        this.accessVarV2 = newv;
    }
}
