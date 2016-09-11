package chapter4_classes_and_interfaces;

/*
    Encapsulation: Hide internal data by making variables private/protected, if they do not need to be accessed by outside classes
    Try to make each class as inaccessible as possible

    Top-level class: Any non nested class, such as Item13Min

    - private: Accessible only from top-level class where it is declared. Only nested classes can be declared private,
            as nobody else would be able to access a non-nested class
    - default: Accessible from any other class in the same package
    - protected: Accessible from any other class in the same package, and from any subclasses in any package
    - public: Accessible from anywhere
 */
public class Item13MinimizeAccessibility {


    //Only a nested class can be declared private. This class can only be accessed within Item13Minimize, its parent class
    private class Item13NestedClass {

    }
}
