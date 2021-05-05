package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code long}, a {@code double} and an object and returns a {@code boolean}.
 */
public interface LongDoubleRef2BoolFn<P3> {
    boolean invoke(long p1, double p2, P3 p3);
}
