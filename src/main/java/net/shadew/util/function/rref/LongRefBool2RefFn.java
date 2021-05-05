package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, an object and a {@code boolean} and returns an object.
 */
public interface LongRefBool2RefFn<P2, R> {
    R invoke(long p1, P2 p2, boolean p3);
}
