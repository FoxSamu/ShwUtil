package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code double}, an object and a {@code float} and returns a {@code boolean}.
 */
public interface DoubleRefFloat2BoolFn<P2> {
    boolean invoke(double p1, P2 p2, float p3);
}
