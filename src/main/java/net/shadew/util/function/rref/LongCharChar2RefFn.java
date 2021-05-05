package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code char} and a {@code char} and returns an object.
 */
public interface LongCharChar2RefFn<R> {
    R invoke(long p1, char p2, char p3);
}
