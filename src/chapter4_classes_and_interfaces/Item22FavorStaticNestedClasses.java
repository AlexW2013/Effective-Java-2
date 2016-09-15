package chapter4_classes_and_interfaces;

/*
    For inner(nested) classes that do not require access to it's parent instance, always make it static.
    This can save time and space, as there will be only one instance of a member class

 */
public class Item22FavorStaticNestedClasses {

    void callNestedStaticClass(){
        //Creating a normal nested class
        normalNestedClass normalNested = new normalNestedClass();
        normalNested.printMsg();

        //Creating a static nested class
        Item22FavorStaticNestedClasses.staticNestedClass newNested = new Item22FavorStaticNestedClasses.staticNestedClass();
        newNested.printMsg();
    }

    //Each non-static nested class created will have its own instance, which can take up needless space
    class normalNestedClass{
        void printMsg(){
            System.out.println("This is a static nested class!");
        }
    }

    static class staticNestedClass{
        void printMsg(){
            System.out.println("This is a static nested class!");
        }
    }
}
