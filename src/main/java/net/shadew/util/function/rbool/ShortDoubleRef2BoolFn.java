package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code short}, a {@code double} and an object and returns a {@code boolean}.
 */
public interface ShortDoubleRef2BoolFn<P3> {
    boolean invoke(short p1, double p2, P3 p3);
}
