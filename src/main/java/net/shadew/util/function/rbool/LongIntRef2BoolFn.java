package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code long}, an {@code int} and an object and returns a {@code boolean}.
 */
public interface LongIntRef2BoolFn<P3> {
    boolean invoke(long p1, int p2, P3 p3);
}
