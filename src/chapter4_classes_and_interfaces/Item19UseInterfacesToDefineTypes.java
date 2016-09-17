package chapter4_classes_and_interfaces;

/*
    Never use a constant interface; an interface where no methods are defined, only constants.
    Instead, use utility classes that contain these constants.

    An interface should only be used to show what instances of a class can do.
 */
public class Item19UseInterfacesToDefineTypes {

    //Dont do this!!
    interface exampleConstantInterface {
        //Reminder: all variables are implicitly static final for interfaces
        static final int secondsPerHour = 3600;

        int minutesPerHour = 60;
    }

    //Instead, use a utility class as a component
    class exampleUtilityClass {
        static final int secondsPerHour = 3600;
        static final int minutesPerHour = 60;
    }
}
