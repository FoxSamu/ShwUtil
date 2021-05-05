package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, an {@code int} and a {@code short} and returns an object.
 */
public interface LongIntShort2RefFn<R> {
    R invoke(long p1, int p2, short p3);
}
