package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code long}, a {@code float} and a {@code double} and returns a {@code boolean}.
 */
public interface LongFloatDouble2BoolFn {
    boolean invoke(long p1, float p2, double p3);
}
