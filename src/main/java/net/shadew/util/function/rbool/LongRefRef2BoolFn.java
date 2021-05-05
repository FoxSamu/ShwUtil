package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code long}, an object and an object and returns a {@code boolean}.
 */
public interface LongRefRef2BoolFn<P2, P3> {
    boolean invoke(long p1, P2 p2, P3 p3);
}
