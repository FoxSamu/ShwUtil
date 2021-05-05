package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code double} and a {@code boolean} and returns an object.
 */
public interface DoubleDoubleBool2RefFn<R> {
    R invoke(double p1, double p2, boolean p3);
}
