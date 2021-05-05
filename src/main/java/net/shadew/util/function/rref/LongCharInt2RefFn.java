package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code char} and an {@code int} and returns an object.
 */
public interface LongCharInt2RefFn<R> {
    R invoke(long p1, char p2, int p3);
}
