package chapter2_create_destroy_objects;

/*
Consider using a builder when there are many constructors being overloaded due to
many parameters, as it can improve readability
*/
public class Item2UseBuilder {

    public static void main(String[] args) {
        //Using the normal constructor, which may get confusing as you dont know which int corresponds to which variable
        BuilderExample classicBuilder = new BuilderExample(15, 25, false);

        //Using a builder instead, which can improve readability
        BuilderExample newBuilder = new BuilderExample.Builder(25).wheels(4).build();
    }
}



class BuilderExample{
    int data;
    int wheels;
    int height;
    boolean active;

    //Normally, you can overload multiple constructors to initiate what you want
    //However, a con to this is that it can become very hard to read/write when there are many constructors
    public BuilderExample(int data, int wheels){
        this.data = data;
        this.wheels = wheels;
    }

    public BuilderExample(int data, int wheels, boolean active){
        this.data = data;
        this.wheels = wheels;
        this.active = active;
    }


    //However, an alternative to this is to use a builder, like so
    //Declare it as a static class, as it is called by the actual class itself, not an instance
    public static class Builder {
        //You can set required variables to be initialized by placing them in the builder constructor
        private int data;

        //You can also set default values, like so;
        private int wheels = 4;
        private int height = 50;
        private boolean active = false;

        //builder constructor used to initialize required variables, as this must be called each time the builder is used
        public Builder(int data){
            this.data = data;
        }

        //Next, you can set optional variables
        public Builder wheels(int wheels){
            this.wheels = wheels;
            return this;
        }

        public Builder active(boolean active){
            this.active = active;
            return this;
        }

        //Since all builder variables are now set, you can call build() to return the actual object
        public BuilderExample build(){
            return new BuilderExample(this);
        }

    }

    //A builder is passed in by the build() function, and this constructor is used to return the actual object
    private BuilderExample(Builder builder){
        data = builder.data;
        wheels = builder.wheels;
        height = builder.height;
        active = builder.active;
    }
}
