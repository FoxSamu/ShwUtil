package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code double} and a {@code float} and returns an object.
 */
public interface LongDoubleFloat2RefFn<R> {
    R invoke(long p1, double p2, float p3);
}
