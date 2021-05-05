package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code double}, an object and a {@code long} and returns a {@code boolean}.
 */
public interface DoubleRefLong2BoolFn<P2> {
    boolean invoke(double p1, P2 p2, long p3);
}
