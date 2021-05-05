package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code double}, a {@code float} and an object and returns nothing.
 */
public interface DoubleFloatRef2VoidFn<P3> {
    void invoke(double p1, float p2, P3 p3);
}
