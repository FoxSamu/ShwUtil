package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code long} and a {@code short} and returns an object.
 */
public interface ShortLongShort2RefFn<R> {
    R invoke(short p1, long p2, short p3);
}
