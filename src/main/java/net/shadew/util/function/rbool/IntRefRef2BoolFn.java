package net.shadew.util.function.rbool;

/**
 * A function that takes an {@code int}, an object and an object and returns a {@code boolean}.
 */
public interface IntRefRef2BoolFn<P2, P3> {
    boolean invoke(int p1, P2 p2, P3 p3);
}
