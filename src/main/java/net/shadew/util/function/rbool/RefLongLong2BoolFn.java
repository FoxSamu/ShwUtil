package net.shadew.util.function.rbool;

/**
 * A function that takes an object, a {@code long} and a {@code long} and returns a {@code boolean}.
 */
public interface RefLongLong2BoolFn<P1> {
    boolean invoke(P1 p1, long p2, long p3);
}
