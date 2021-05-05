package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code long}, an object and a {@code long} and returns a {@code boolean}.
 */
public interface LongRefLong2BoolFn<P2> {
    boolean invoke(long p1, P2 p2, long p3);
}
