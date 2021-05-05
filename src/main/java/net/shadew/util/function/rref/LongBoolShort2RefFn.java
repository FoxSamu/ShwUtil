package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code boolean} and a {@code short} and returns an object.
 */
public interface LongBoolShort2RefFn<R> {
    R invoke(long p1, boolean p2, short p3);
}
