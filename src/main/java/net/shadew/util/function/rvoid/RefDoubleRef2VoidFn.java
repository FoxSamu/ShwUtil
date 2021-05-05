package net.shadew.util.function.rvoid;

/**
 * A function that takes an object, a {@code double} and an object and returns nothing.
 */
public interface RefDoubleRef2VoidFn<P1, P3> {
    void invoke(P1 p1, double p2, P3 p3);
}
