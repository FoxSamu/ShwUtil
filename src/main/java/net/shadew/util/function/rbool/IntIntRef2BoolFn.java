package net.shadew.util.function.rbool;

/**
 * A function that takes an {@code int}, an {@code int} and an object and returns a {@code boolean}.
 */
public interface IntIntRef2BoolFn<P3> {
    boolean invoke(int p1, int p2, P3 p3);
}
