package chapter6_enums_and_annotations;

/*

 */
public class Item32UseEnumsetOverBitfields {
    //Instead of using bitfields
    public static final int STYLE_BOLD = 1 << 1;

    //Use enums
    public enum Font { BOLD, ITALIC };

}
