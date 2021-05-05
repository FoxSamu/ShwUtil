package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code char}, an object and a {@code byte} and returns a {@code boolean}.
 */
public interface CharRefByte2BoolFn<P2> {
    boolean invoke(char p1, P2 p2, byte p3);
}
