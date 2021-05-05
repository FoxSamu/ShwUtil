package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, an {@code int} and a {@code long} and returns an object.
 */
public interface CharIntLong2RefFn<R> {
    R invoke(char p1, int p2, long p3);
}
