package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code double}, a {@code double} and an object and returns a {@code boolean}.
 */
public interface DoubleDoubleRef2BoolFn<P3> {
    boolean invoke(double p1, double p2, P3 p3);
}
