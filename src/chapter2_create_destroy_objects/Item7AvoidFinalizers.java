package chapter2_create_destroy_objects;

/*
    You should try your hardest to avoid finalizers, as they are unpredictable and usually unnecessary
    1. Never do anything time critical in a finalizer, as there is no guarantee they will be executed promptly
    2. Never use a finalizer to update a critial persistent state, for same reasons and that finalizers may not get executed at all
    3. There is a very expensive performance hit when using finalizers
 */
public class Item7AvoidFinalizers {

    //A finalizer is something used for object destruction, like below:
    //Finalize is also called by the garbage collector when it determines that no more references to an object exists
    public void finalizerExample(){

        Object newObj = new Object();

        //...

        //newObj.finalize();

        //If you must terminate a resrouce, use a try.. finally loop, and use terminate()
        try{
            //Do what must be done with object here
        }finally{
            newObj.terminate(); //Explicit termination method
        }

    }
}
