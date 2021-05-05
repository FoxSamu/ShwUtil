package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code long} and an object and returns an object.
 */
public interface LongLongRef2RefFn<P3, R> {
    R invoke(long p1, long p2, P3 p3);
}
