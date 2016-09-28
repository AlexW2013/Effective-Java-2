package chapter6_enums_and_annotations;

/*
    Enums: a new type introduced in java 1.5
    Instead of using final int constants to represent variables, use enums instead

 */
public class Item30UseEnumsOverIntConstants {
    //Dont do this!
    public static final int APPLE = 1;
    public static final int ORANGE = 2;

    //Instead, use enums
    public enum Fruit {
        APPLE,
        ORANGE
    }

    //Enums can also contain data
    public enum Planet {
        MERCURY (1.6e+10);

        double mass;

        Planet(double mass){
            this.mass = mass;
        }
    }
}
