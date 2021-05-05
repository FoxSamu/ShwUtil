package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code long}, a {@code float} and an object and returns a {@code boolean}.
 */
public interface LongFloatRef2BoolFn<P3> {
    boolean invoke(long p1, float p2, P3 p3);
}
