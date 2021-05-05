package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code float}, a {@code long} and an object and returns a {@code boolean}.
 */
public interface FloatLongRef2BoolFn<P3> {
    boolean invoke(float p1, long p2, P3 p3);
}
