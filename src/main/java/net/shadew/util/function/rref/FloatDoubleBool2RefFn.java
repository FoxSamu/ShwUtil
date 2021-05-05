package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code double} and a {@code boolean} and returns an object.
 */
public interface FloatDoubleBool2RefFn<R> {
    R invoke(float p1, double p2, boolean p3);
}
