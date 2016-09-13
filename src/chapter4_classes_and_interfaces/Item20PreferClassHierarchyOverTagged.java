package chapter4_classes_and_interfaces;

/*
    A tagged class is a class that can come in two or more types, such as a shape class representing a circle or square.
    This tagged class may have instance variables that are only valid for certain types.

    This is bad, and proper class hierarchies should be used instead
 */
public class Item20PreferClassHierarchyOverTagged {

    //Reminder: enum is a special java type, essentially a class, used to define constants
    enum shape {RECTANGLE, CIRCLE}

    //For typed classes, certain instance variables would only be for certain enums
    //This is bad, as the tagged class will become verbose and hard to maintain/read through

    //ex: Radius is only for circle
    int radius;

    //Height and width only for rectangle
    int height, width;

    //There may also be specific methods such as for circleArea(), and rectArea()


    //Instead of using tagged/complex single classes, use a proper class hierarchy instead, so specific methods/vars are separated
    abstract class shapes{
        abstract double area();
    }

    class Circle extends shapes {
        double radius;
        double area(){
            return radius * 3.14;
        }
    }

    class Rectangle extends shapes {
        double height, width;
        double area(){
            return height * width;
        }
    }

}
