package net.shadew.util.function.rbool;

/**
 * A function that takes an object, an {@code int} and a {@code long} and returns a {@code boolean}.
 */
public interface RefIntLong2BoolFn<P1> {
    boolean invoke(P1 p1, int p2, long p3);
}
