package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code float}, an object and a {@code double} and returns a {@code boolean}.
 */
public interface FloatRefDouble2BoolFn<P2> {
    boolean invoke(float p1, P2 p2, double p3);
}
