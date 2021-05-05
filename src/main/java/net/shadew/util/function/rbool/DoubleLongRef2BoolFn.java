package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code double}, a {@code long} and an object and returns a {@code boolean}.
 */
public interface DoubleLongRef2BoolFn<P3> {
    boolean invoke(double p1, long p2, P3 p3);
}
