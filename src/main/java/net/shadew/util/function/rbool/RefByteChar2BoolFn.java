package net.shadew.util.function.rbool;

/**
 * A function that takes an object, a {@code byte} and a {@code char} and returns a {@code boolean}.
 */
public interface RefByteChar2BoolFn<P1> {
    boolean invoke(P1 p1, byte p2, char p3);
}
