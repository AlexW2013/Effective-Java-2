package chapter6_enums_and_annotations;

/*
    Enums have an ordinal() method, which returns numerical position of each enum constant
 */
public class Item31UseInstanceFieldsOverOrdinals {


    public enum Example{
        //ordinal() of ONE is 0, of TWO is 1.
//        ONE, TWO, THREE;
//        public int getExampleValue(){return ordinal() +1;}


        //Instead of using ordinal, store the value associated with an enum in an instance field instead
        FOUR(4), FIVE(5);


        private int exampleValue;
        Example(int value){
            this.exampleValue = value;
        }
        public int getExampleValue(){return exampleValue;}
    }
}
