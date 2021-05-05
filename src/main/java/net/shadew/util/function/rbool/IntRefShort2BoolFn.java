package net.shadew.util.function.rbool;

/**
 * A function that takes an {@code int}, an object and a {@code short} and returns a {@code boolean}.
 */
public interface IntRefShort2BoolFn<P2> {
    boolean invoke(int p1, P2 p2, short p3);
}
