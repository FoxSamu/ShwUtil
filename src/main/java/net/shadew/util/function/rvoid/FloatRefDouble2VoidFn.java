package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code float}, an object and a {@code double} and returns nothing.
 */
public interface FloatRefDouble2VoidFn<P2> {
    void invoke(float p1, P2 p2, double p3);
}
