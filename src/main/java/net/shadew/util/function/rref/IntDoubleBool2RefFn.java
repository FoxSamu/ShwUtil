package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code double} and a {@code boolean} and returns an object.
 */
public interface IntDoubleBool2RefFn<R> {
    R invoke(int p1, double p2, boolean p3);
}
