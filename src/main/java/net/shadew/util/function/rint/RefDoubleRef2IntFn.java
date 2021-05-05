package net.shadew.util.function.rint;

/**
 * A function that takes an object, a {@code double} and an object and returns an {@code int}.
 */
public interface RefDoubleRef2IntFn<P1, P3> {
    int invoke(P1 p1, double p2, P3 p3);
}
