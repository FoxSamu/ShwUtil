package net.shadew.util.function.rint;

/**
 * A function that takes a {@code double}, an object and a {@code short} and returns an {@code int}.
 */
public interface DoubleRefShort2IntFn<P2> {
    int invoke(double p1, P2 p2, short p3);
}