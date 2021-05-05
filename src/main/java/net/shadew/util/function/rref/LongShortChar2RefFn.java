package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code short} and a {@code char} and returns an object.
 */
public interface LongShortChar2RefFn<R> {
    R invoke(long p1, short p2, char p3);
}
