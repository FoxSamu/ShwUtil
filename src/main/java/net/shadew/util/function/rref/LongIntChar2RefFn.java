package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, an {@code int} and a {@code char} and returns an object.
 */
public interface LongIntChar2RefFn<R> {
    R invoke(long p1, int p2, char p3);
}
