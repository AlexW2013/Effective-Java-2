package chapter4_classes_and_interfaces;

/*
    Interfaces: Multiple can be implemented; Only allows declaration of vars/methods, no method implementation. All
    declared methods MUST be defined in any class that implements the interface.

    Abstract class: Only one can be extended; Unlike interfaces, abstract classes can have implementations of certain
    methods. Only abstract methods MUST be implemented; non-abstract methods are inherited for all child classes.


    Why prefer interfaces over abstract classes? It is easier for existing classes to be changed to implement an interface,
    compared to extending an abstract class. If multiple classes extend an abstract class, the abstract class must be
    high up in the "structure tree", as there could be conflict with other ancestor classes.

    Benefits of an abstract class: It is easier to add a method common to all subclasses, as you can simply implement
    the method in the abstract class, by defining a non-abstract method; you can't do this in an interface, and must add
    the method in all class files that require it.
 */


public class Item18InterfacesOverAbstractClasses {

    abstract class exampleAbstractClass {

        //Unlike interfaces, variables do not need to be static final, and do not need to be instantiated
        protected int var;

        void printNonAbs(){
            System.out.println("You dont need to implement this in a child class, as its not an abstract method!");
        }

        //This MUST be implemented in any class that extents exampleAbstractClass
        abstract protected void printAbs();
    }

    class extendsAbstract extends exampleAbstractClass {
        //Abstract class methods do not need to be public
        protected void printAbs(){
            System.out.println("This must be implemented in child classes");
        }
    }




    interface exampleInterface{
        //Variables in interfaces are inherently public static final; One instance are shared amongst ALL classes that
        //implement this interface
        //Refresher:    Final primitive variables cannot change in value
        //              Final object variables can be modified, but cannot have their reference change
        int pubStatFinalVar = 0;

        //All interface methods are inherently public
        void printAbs();
    }

    class extentsInterface implements exampleInterface {
        public void printAbs(){
            System.out.println("This must be implemented in child classes");
        }
    }
}
