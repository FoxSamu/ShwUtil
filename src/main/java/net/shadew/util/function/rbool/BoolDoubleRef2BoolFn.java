package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code boolean}, a {@code double} and an object and returns a {@code boolean}.
 */
public interface BoolDoubleRef2BoolFn<P3> {
    boolean invoke(boolean p1, double p2, P3 p3);
}
