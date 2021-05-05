package net.shadew.util.function.rbool;

/**
 * A function that takes an object, an {@code int} and an object and returns a {@code boolean}.
 */
public interface RefIntRef2BoolFn<P1, P3> {
    boolean invoke(P1 p1, int p2, P3 p3);
}
