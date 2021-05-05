package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code boolean}, a {@code long} and an object and returns a {@code boolean}.
 */
public interface BoolLongRef2BoolFn<P3> {
    boolean invoke(boolean p1, long p2, P3 p3);
}
