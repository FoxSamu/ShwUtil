package net.shadew.util.function.rbool;

/**
 * A function that takes an object, a {@code char} and a {@code long} and returns a {@code boolean}.
 */
public interface RefCharLong2BoolFn<P1> {
    boolean invoke(P1 p1, char p2, long p3);
}
