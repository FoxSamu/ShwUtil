package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, an object and a {@code short} and returns an object.
 */
public interface LongRefShort2RefFn<P2, R> {
    R invoke(long p1, P2 p2, short p3);
}
