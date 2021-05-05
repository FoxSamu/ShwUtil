package net.shadew.util.function.rint;

/**
 * A function that takes a {@code double} and an object and returns an {@code int}.
 */
public interface DoubleRef2IntFn<P2> {
    int invoke(double p1, P2 p2);
}
