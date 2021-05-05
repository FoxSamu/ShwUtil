package net.shadew.util.function.rint;

/**
 * A function that takes an object, a {@code long} and a {@code double} and returns an {@code int}.
 */
public interface RefLongDouble2IntFn<P1> {
    int invoke(P1 p1, long p2, double p3);
}
