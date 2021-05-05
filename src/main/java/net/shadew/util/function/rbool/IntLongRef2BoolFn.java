package net.shadew.util.function.rbool;

/**
 * A function that takes an {@code int}, a {@code long} and an object and returns a {@code boolean}.
 */
public interface IntLongRef2BoolFn<P3> {
    boolean invoke(int p1, long p2, P3 p3);
}
