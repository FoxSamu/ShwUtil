package net.shadew.util.function.rbool;

/**
 * A function that takes an object, a {@code double} and an {@code int} and returns a {@code boolean}.
 */
public interface RefDoubleInt2BoolFn<P1> {
    boolean invoke(P1 p1, double p2, int p3);
}
