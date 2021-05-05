package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code long} and a {@code long} and returns an object.
 */
public interface ShortLongLong2RefFn<R> {
    R invoke(short p1, long p2, long p3);
}
