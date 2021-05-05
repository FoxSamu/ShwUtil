package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code long}, a {@code char} and an object and returns a {@code boolean}.
 */
public interface LongCharRef2BoolFn<P3> {
    boolean invoke(long p1, char p2, P3 p3);
}
