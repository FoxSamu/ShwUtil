package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code long}, a {@code short} and an object and returns a {@code boolean}.
 */
public interface LongShortRef2BoolFn<P3> {
    boolean invoke(long p1, short p2, P3 p3);
}
