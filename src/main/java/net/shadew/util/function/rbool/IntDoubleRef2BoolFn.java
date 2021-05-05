package net.shadew.util.function.rbool;

/**
 * A function that takes an {@code int}, a {@code double} and an object and returns a {@code boolean}.
 */
public interface IntDoubleRef2BoolFn<P3> {
    boolean invoke(int p1, double p2, P3 p3);
}
