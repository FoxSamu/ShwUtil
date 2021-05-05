package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code long} and a {@code double} and returns an object.
 */
public interface DoubleLongDouble2RefFn<R> {
    R invoke(double p1, long p2, double p3);
}
