package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code long} and a {@code char} and returns an object.
 */
public interface LongLongChar2RefFn<R> {
    R invoke(long p1, long p2, char p3);
}
