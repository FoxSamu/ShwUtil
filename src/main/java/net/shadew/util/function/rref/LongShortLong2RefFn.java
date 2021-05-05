package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code short} and a {@code long} and returns an object.
 */
public interface LongShortLong2RefFn<R> {
    R invoke(long p1, short p2, long p3);
}
