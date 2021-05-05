package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code long} and a {@code boolean} and returns an object.
 */
public interface DoubleLongBool2RefFn<R> {
    R invoke(double p1, long p2, boolean p3);
}
