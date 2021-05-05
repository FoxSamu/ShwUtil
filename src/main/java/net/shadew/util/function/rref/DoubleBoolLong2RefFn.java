package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code boolean} and a {@code long} and returns an object.
 */
public interface DoubleBoolLong2RefFn<R> {
    R invoke(double p1, boolean p2, long p3);
}
