package net.shadew.util.function.rbool;

/**
 * A function that takes an object, a {@code short} and an {@code int} and returns a {@code boolean}.
 */
public interface RefShortInt2BoolFn<P1> {
    boolean invoke(P1 p1, short p2, int p3);
}