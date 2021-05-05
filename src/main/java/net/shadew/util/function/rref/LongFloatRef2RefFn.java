package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code float} and an object and returns an object.
 */
public interface LongFloatRef2RefFn<P3, R> {
    R invoke(long p1, float p2, P3 p3);
}
