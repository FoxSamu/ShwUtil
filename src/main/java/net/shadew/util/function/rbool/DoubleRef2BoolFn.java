package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code double} and an object and returns a {@code boolean}.
 */
public interface DoubleRef2BoolFn<P2> {
    boolean invoke(double p1, P2 p2);
}
