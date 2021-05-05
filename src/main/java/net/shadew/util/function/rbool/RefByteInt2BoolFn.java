package net.shadew.util.function.rbool;

/**
 * A function that takes an object, a {@code byte} and an {@code int} and returns a {@code boolean}.
 */
public interface RefByteInt2BoolFn<P1> {
    boolean invoke(P1 p1, byte p2, int p3);
}
