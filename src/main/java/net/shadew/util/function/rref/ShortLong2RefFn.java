package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short} and a {@code long} and returns an object.
 */
public interface ShortLong2RefFn<R> {
    R invoke(short p1, long p2);
}
