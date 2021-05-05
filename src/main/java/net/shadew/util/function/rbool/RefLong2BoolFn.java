package net.shadew.util.function.rbool;

/**
 * A function that takes an object and a {@code long} and returns a {@code boolean}.
 */
public interface RefLong2BoolFn<P1> {
    boolean invoke(P1 p1, long p2);
}
