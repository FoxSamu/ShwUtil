package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code double} and a {@code char} and returns an object.
 */
public interface LongDoubleChar2RefFn<R> {
    R invoke(long p1, double p2, char p3);
}
