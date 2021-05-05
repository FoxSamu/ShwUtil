package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code double} and a {@code double} and returns an object.
 */
public interface LongDoubleDouble2RefFn<R> {
    R invoke(long p1, double p2, double p3);
}
