package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code short} and a {@code long} and returns an object.
 */
public interface IntShortLong2RefFn<R> {
    R invoke(int p1, short p2, long p3);
}
