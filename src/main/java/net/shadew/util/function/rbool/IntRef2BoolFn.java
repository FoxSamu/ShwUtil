package net.shadew.util.function.rbool;

/**
 * A function that takes an {@code int} and an object and returns a {@code boolean}.
 */
public interface IntRef2BoolFn<P2> {
    boolean invoke(int p1, P2 p2);
}
