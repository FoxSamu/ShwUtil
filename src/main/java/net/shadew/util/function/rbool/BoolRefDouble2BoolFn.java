package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code boolean}, an object and a {@code double} and returns a {@code boolean}.
 */
public interface BoolRefDouble2BoolFn<P2> {
    boolean invoke(boolean p1, P2 p2, double p3);
}
