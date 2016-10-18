package chapter7_methods;

import java.time.Period;
import java.util.Date;

/*
    Defensive programming: Always treat your code like clients are attempting to break it. Add defensive checks when necessary
 */
public class Item39MakeDefensiveCopiesWhenNeeded {

    public void dateExample(){
        Date start = new Date();
        Date end = new Date();
        //Since the Date object passed in is modified...
        //...there is a small window of time where end.setTime can actually modify the parameters passed into dateMethod
        dateMethod(start, end);
        end.setTime(5);
    }

    public void dateMethod(Date s, Date e){
        //Initially, if you compared start and end, it may hold true in the beginning but may change later throughout the function


        //By making defensive copies beforehand, if the parameters passed in are modified, the defensive copies
        //are not changed at all
        Date start = new Date(s.getTime());
        Date end = new Date(e.getTime());

        //A comparison here between start and end will always be safe, as they are copies of the previous objects
        if (start.compareTo(end) > 0){
            //Do something
        }


    }
}
