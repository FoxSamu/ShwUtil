package net.shadew.util.function.rbool;

/**
 * A function that takes an object, a {@code long} and a {@code short} and returns a {@code boolean}.
 */
public interface RefLongShort2BoolFn<P1> {
    boolean invoke(P1 p1, long p2, short p3);
}
