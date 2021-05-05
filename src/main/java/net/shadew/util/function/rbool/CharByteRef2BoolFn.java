package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code char}, a {@code byte} and an object and returns a {@code boolean}.
 */
public interface CharByteRef2BoolFn<P3> {
    boolean invoke(char p1, byte p2, P3 p3);
}
