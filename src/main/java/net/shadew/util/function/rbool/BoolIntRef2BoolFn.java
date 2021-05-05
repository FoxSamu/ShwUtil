package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code boolean}, an {@code int} and an object and returns a {@code boolean}.
 */
public interface BoolIntRef2BoolFn<P3> {
    boolean invoke(boolean p1, int p2, P3 p3);
}
