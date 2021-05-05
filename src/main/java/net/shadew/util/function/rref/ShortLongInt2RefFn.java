package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code long} and an {@code int} and returns an object.
 */
public interface ShortLongInt2RefFn<R> {
    R invoke(short p1, long p2, int p3);
}
