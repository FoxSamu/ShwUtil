package net.shadew.util.function.rbool;

/**
 * A function that takes an object, an {@code int} and an {@code int} and returns a {@code boolean}.
 */
public interface RefIntInt2BoolFn<P1> {
    boolean invoke(P1 p1, int p2, int p3);
}
