package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code long}, an object and a {@code short} and returns a {@code boolean}.
 */
public interface LongRefShort2BoolFn<P2> {
    boolean invoke(long p1, P2 p2, short p3);
}