package net.shadew.util.function.rbool;

/**
 * A function that takes an {@code int}, a {@code boolean} and an object and returns a {@code boolean}.
 */
public interface IntBoolRef2BoolFn<P3> {
    boolean invoke(int p1, boolean p2, P3 p3);
}
