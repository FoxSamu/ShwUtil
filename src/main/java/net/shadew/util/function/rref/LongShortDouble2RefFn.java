package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code short} and a {@code double} and returns an object.
 */
public interface LongShortDouble2RefFn<R> {
    R invoke(long p1, short p2, double p3);
}
