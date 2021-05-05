package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code boolean}, an object and an {@code int} and returns a {@code boolean}.
 */
public interface BoolRefInt2BoolFn<P2> {
    boolean invoke(boolean p1, P2 p2, int p3);
}
