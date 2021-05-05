package net.shadew.util.function.rbool;

/**
 * A function that takes an object, an {@code int} and a {@code double} and returns a {@code boolean}.
 */
public interface RefIntDouble2BoolFn<P1> {
    boolean invoke(P1 p1, int p2, double p3);
}
