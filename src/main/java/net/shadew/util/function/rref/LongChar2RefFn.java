package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long} and a {@code char} and returns an object.
 */
public interface LongChar2RefFn<R> {
    R invoke(long p1, char p2);
}
