package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code float}, an {@code int} and an object and returns a {@code boolean}.
 */
public interface FloatIntRef2BoolFn<P3> {
    boolean invoke(float p1, int p2, P3 p3);
}
