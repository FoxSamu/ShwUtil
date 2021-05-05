package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code boolean}, an object and a {@code long} and returns a {@code boolean}.
 */
public interface BoolRefLong2BoolFn<P2> {
    boolean invoke(boolean p1, P2 p2, long p3);
}
