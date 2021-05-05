package net.shadew.util.function.rbool;

/**
 * A function that takes an object, an object and a {@code long} and returns a {@code boolean}.
 */
public interface RefRefLong2BoolFn<P1, P2> {
    boolean invoke(P1 p1, P2 p2, long p3);
}
