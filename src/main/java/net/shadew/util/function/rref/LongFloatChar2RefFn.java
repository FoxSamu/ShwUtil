package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code float} and a {@code char} and returns an object.
 */
public interface LongFloatChar2RefFn<R> {
    R invoke(long p1, float p2, char p3);
}
