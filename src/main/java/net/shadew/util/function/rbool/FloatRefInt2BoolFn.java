package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code float}, an object and an {@code int} and returns a {@code boolean}.
 */
public interface FloatRefInt2BoolFn<P2> {
    boolean invoke(float p1, P2 p2, int p3);
}
