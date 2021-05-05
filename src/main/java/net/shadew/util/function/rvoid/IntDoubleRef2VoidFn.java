package net.shadew.util.function.rvoid;

/**
 * A function that takes an {@code int}, a {@code double} and an object and returns nothing.
 */
public interface IntDoubleRef2VoidFn<P3> {
    void invoke(int p1, double p2, P3 p3);
}
