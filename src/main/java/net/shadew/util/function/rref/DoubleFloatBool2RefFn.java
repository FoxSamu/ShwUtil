package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code float} and a {@code boolean} and returns an object.
 */
public interface DoubleFloatBool2RefFn<R> {
    R invoke(double p1, float p2, boolean p3);
}
