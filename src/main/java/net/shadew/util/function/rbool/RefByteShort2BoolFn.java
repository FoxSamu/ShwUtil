package net.shadew.util.function.rbool;

/**
 * A function that takes an object, a {@code byte} and a {@code short} and returns a {@code boolean}.
 */
public interface RefByteShort2BoolFn<P1> {
    boolean invoke(P1 p1, byte p2, short p3);
}