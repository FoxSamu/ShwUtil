package net.shadew.util.function.rbool;

/**
 * A function that takes an object, a {@code boolean} and a {@code long} and returns a {@code boolean}.
 */
public interface RefBoolLong2BoolFn<P1> {
    boolean invoke(P1 p1, boolean p2, long p3);
}
