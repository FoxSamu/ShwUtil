package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code float}, a {@code double} and an object and returns a {@code boolean}.
 */
public interface FloatDoubleRef2BoolFn<P3> {
    boolean invoke(float p1, double p2, P3 p3);
}
