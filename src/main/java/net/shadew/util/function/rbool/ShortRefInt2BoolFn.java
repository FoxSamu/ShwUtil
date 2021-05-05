package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code short}, an object and an {@code int} and returns a {@code boolean}.
 */
public interface ShortRefInt2BoolFn<P2> {
    boolean invoke(short p1, P2 p2, int p3);
}
