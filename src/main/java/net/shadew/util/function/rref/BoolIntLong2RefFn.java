package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, an {@code int} and a {@code long} and returns an object.
 */
public interface BoolIntLong2RefFn<R> {
    R invoke(boolean p1, int p2, long p3);
}
