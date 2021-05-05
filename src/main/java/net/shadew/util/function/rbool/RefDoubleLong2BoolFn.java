package net.shadew.util.function.rbool;

/**
 * A function that takes an object, a {@code double} and a {@code long} and returns a {@code boolean}.
 */
public interface RefDoubleLong2BoolFn<P1> {
    boolean invoke(P1 p1, double p2, long p3);
}
