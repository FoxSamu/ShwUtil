package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code float}, a {@code double} and an object and returns nothing.
 */
public interface FloatDoubleRef2VoidFn<P3> {
    void invoke(float p1, double p2, P3 p3);
}