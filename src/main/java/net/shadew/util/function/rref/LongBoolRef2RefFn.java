package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code boolean} and an object and returns an object.
 */
public interface LongBoolRef2RefFn<P3, R> {
    R invoke(long p1, boolean p2, P3 p3);
}
