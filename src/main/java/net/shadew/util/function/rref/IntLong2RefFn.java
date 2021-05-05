package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int} and a {@code long} and returns an object.
 */
public interface IntLong2RefFn<R> {
    R invoke(int p1, long p2);
}