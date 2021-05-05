package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long} and a {@code double} and returns an object.
 */
public interface LongDouble2RefFn<R> {
    R invoke(long p1, double p2);
}
