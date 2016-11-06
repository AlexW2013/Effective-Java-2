package chapter8_general_programming;

import java.math.BigDecimal;

/*
    Don't use float or double if any precise decimal answers are required, as they can
    return inaccurate results.

    Instead, use BigDecimal, as it is precise. The downsides to BigDecimal is that it is slower and also
    less convenient, as you need to call specific BigDecimal methods to add/subtract and so on.
 */
public class Item48AvoidFloatAndDoubleForExact {
    public void bigDecimalExample(){
        double d1, d2;
        d1 = 1.005;
        d2 = 1.006;
        //This is bad, as d3 may be 0.00999999 since doubles do not guarantee precision
        double d3 = d2 - d1;

        //Instead, use BigDecimal
        BigDecimal b1, b2;
        b1 = new BigDecimal("1.005");
        b2 = new BigDecimal("1.005");
        BigDecimal b3 = b2.subtract(b1);
    }
}
