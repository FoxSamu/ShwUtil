package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code short} and a {@code long} and returns an object.
 */
public interface DoubleShortLong2RefFn<R> {
    R invoke(double p1, short p2, long p3);
}
