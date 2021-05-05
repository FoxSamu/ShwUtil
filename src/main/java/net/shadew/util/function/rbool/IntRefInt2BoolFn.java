package net.shadew.util.function.rbool;

/**
 * A function that takes an {@code int}, an object and an {@code int} and returns a {@code boolean}.
 */
public interface IntRefInt2BoolFn<P2> {
    boolean invoke(int p1, P2 p2, int p3);
}
