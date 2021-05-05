package net.shadew.util.function.rvoid;

/**
 * A function that takes an {@code int}, a {@code float} and an object and returns nothing.
 */
public interface IntFloatRef2VoidFn<P3> {
    void invoke(int p1, float p2, P3 p3);
}
