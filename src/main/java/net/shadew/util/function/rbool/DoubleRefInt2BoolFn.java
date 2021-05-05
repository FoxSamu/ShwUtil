package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code double}, an object and an {@code int} and returns a {@code boolean}.
 */
public interface DoubleRefInt2BoolFn<P2> {
    boolean invoke(double p1, P2 p2, int p3);
}
