package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code short} and an {@code int} and returns an object.
 */
public interface LongShortInt2RefFn<R> {
    R invoke(long p1, short p2, int p3);
}
