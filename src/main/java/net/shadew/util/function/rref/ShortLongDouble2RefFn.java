package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code long} and a {@code double} and returns an object.
 */
public interface ShortLongDouble2RefFn<R> {
    R invoke(short p1, long p2, double p3);
}
