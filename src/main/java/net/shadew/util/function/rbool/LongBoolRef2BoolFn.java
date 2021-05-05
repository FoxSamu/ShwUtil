package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code long}, a {@code boolean} and an object and returns a {@code boolean}.
 */
public interface LongBoolRef2BoolFn<P3> {
    boolean invoke(long p1, boolean p2, P3 p3);
}
