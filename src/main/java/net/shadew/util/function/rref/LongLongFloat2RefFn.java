package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code long} and a {@code float} and returns an object.
 */
public interface LongLongFloat2RefFn<R> {
    R invoke(long p1, long p2, float p3);
}
