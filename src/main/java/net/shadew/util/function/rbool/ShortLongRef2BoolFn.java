package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code short}, a {@code long} and an object and returns a {@code boolean}.
 */
public interface ShortLongRef2BoolFn<P3> {
    boolean invoke(short p1, long p2, P3 p3);
}
