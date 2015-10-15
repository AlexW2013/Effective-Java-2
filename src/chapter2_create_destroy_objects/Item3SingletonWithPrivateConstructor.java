package chapter2_create_destroy_objects;

/*
A singleton is a class that is ONLY instantiated once, and never again
This is done by using a private constructor, so nothing else can instantiate it
Next, a single instance is created, and this is the only instance ever returned
 */
public class Item3SingletonWithPrivateConstructor {

    public static void main(String [] args){
        //With a singleton, you can ensure that one instance will be shared across ALL classes in your program
        SingletonExample instance = SingletonExample.returnInstance();
        instance.setData(5);
        instance.activate(true);
    }

}


class SingletonExample{
    private int data;
    private boolean active;

    //Must be declared static, so it is part of the actual class itself
    //No other class can refer to or modify this instance
    //Since the instance is declared static, all calls to returnInstance will refer to the same object
    private static final SingletonExample singletonInstance = new SingletonExample();

    private SingletonExample(){
        data = 0;
        active = false;
    }

    public void setData(int data){
        this.data = data;
    }

    public void activate(boolean active){
        this.active = active;
    }

    //This is how you get the actual singleton object
    public static SingletonExample returnInstance(){
        return singletonInstance;
    }
}
