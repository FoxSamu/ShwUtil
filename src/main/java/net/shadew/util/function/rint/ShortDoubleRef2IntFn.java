package net.shadew.util.function.rint;

/**
 * A function that takes a {@code short}, a {@code double} and an object and returns an {@code int}.
 */
public interface ShortDoubleRef2IntFn<P3> {
    int invoke(short p1, double p2, P3 p3);
}
