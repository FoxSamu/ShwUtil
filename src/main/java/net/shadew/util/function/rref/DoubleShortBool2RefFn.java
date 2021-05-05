package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code short} and a {@code boolean} and returns an object.
 */
public interface DoubleShortBool2RefFn<R> {
    R invoke(double p1, short p2, boolean p3);
}