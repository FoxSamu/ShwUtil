package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code long}, a {@code long} and an object and returns a {@code boolean}.
 */
public interface LongLongRef2BoolFn<P3> {
    boolean invoke(long p1, long p2, P3 p3);
}
