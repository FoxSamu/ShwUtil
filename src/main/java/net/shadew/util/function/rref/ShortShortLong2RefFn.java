package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code short} and a {@code long} and returns an object.
 */
public interface ShortShortLong2RefFn<R> {
    R invoke(short p1, short p2, long p3);
}
