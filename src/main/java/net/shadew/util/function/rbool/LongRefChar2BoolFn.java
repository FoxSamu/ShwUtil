package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code long}, an object and a {@code char} and returns a {@code boolean}.
 */
public interface LongRefChar2BoolFn<P2> {
    boolean invoke(long p1, P2 p2, char p3);
}
