package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code double}, an object and an object and returns a {@code boolean}.
 */
public interface DoubleRefRef2BoolFn<P2, P3> {
    boolean invoke(double p1, P2 p2, P3 p3);
}
