package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code short}, an {@code int} and an object and returns a {@code boolean}.
 */
public interface ShortIntRef2BoolFn<P3> {
    boolean invoke(short p1, int p2, P3 p3);
}
