package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code char} and a {@code double} and returns an object.
 */
public interface LongCharDouble2RefFn<R> {
    R invoke(long p1, char p2, double p3);
}
