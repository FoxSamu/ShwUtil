package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code char} and a {@code short} and returns an object.
 */
public interface LongCharShort2RefFn<R> {
    R invoke(long p1, char p2, short p3);
}
