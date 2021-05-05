package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long} and a {@code short} and returns an object.
 */
public interface LongShort2RefFn<R> {
    R invoke(long p1, short p2);
}
