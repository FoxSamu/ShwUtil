package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code long} and a {@code long} and returns an object.
 */
public interface IntLongLong2RefFn<R> {
    R invoke(int p1, long p2, long p3);
}
