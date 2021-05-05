package net.shadew.util.function.rbool;

/**
 * A function that takes an object, a {@code byte} and an object and returns a {@code boolean}.
 */
public interface RefByteRef2BoolFn<P1, P3> {
    boolean invoke(P1 p1, byte p2, P3 p3);
}
