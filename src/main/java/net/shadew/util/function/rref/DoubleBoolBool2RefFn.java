package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code boolean} and a {@code boolean} and returns an object.
 */
public interface DoubleBoolBool2RefFn<R> {
    R invoke(double p1, boolean p2, boolean p3);
}
