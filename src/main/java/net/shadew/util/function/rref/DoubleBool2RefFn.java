package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double} and a {@code boolean} and returns an object.
 */
public interface DoubleBool2RefFn<R> {
    R invoke(double p1, boolean p2);
}
