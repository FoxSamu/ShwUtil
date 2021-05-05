package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code long} and a {@code short} and returns an object.
 */
public interface LongLongShort2RefFn<R> {
    R invoke(long p1, long p2, short p3);
}
