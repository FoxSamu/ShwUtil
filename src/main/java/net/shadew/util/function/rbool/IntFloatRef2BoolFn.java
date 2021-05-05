package net.shadew.util.function.rbool;

/**
 * A function that takes an {@code int}, a {@code float} and an object and returns a {@code boolean}.
 */
public interface IntFloatRef2BoolFn<P3> {
    boolean invoke(int p1, float p2, P3 p3);
}
