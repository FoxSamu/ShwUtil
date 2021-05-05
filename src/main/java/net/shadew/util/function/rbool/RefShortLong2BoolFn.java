package net.shadew.util.function.rbool;

/**
 * A function that takes an object, a {@code short} and a {@code long} and returns a {@code boolean}.
 */
public interface RefShortLong2BoolFn<P1> {
    boolean invoke(P1 p1, short p2, long p3);
}
