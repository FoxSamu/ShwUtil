package net.shadew.util.function.rint;

/**
 * A function that takes a {@code double}, a {@code short} and an object and returns an {@code int}.
 */
public interface DoubleShortRef2IntFn<P3> {
    int invoke(double p1, short p2, P3 p3);
}