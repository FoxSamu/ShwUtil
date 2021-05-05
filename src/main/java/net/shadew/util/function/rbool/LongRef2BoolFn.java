package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code long} and an object and returns a {@code boolean}.
 */
public interface LongRef2BoolFn<P2> {
    boolean invoke(long p1, P2 p2);
}
