package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code float} and a {@code short} and returns an object.
 */
public interface LongFloatShort2RefFn<R> {
    R invoke(long p1, float p2, short p3);
}
