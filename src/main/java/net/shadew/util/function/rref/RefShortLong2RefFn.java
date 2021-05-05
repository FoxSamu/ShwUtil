package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code short} and a {@code long} and returns an object.
 */
public interface RefShortLong2RefFn<P1, R> {
    R invoke(P1 p1, short p2, long p3);
}
