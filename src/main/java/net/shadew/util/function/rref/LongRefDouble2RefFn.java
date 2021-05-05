package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, an object and a {@code double} and returns an object.
 */
public interface LongRefDouble2RefFn<P2, R> {
    R invoke(long p1, P2 p2, double p3);
}
