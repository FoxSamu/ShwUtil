package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code short} and a {@code short} and returns an object.
 */
public interface LongShortShort2RefFn<R> {
    R invoke(long p1, short p2, short p3);
}
