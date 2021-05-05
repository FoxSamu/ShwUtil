package net.shadew.util.function.rbool;

/**
 * A function that takes an object, a {@code float} and a {@code long} and returns a {@code boolean}.
 */
public interface RefFloatLong2BoolFn<P1> {
    boolean invoke(P1 p1, float p2, long p3);
}
