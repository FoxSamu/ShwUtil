package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, an {@code int} and a {@code boolean} and returns an object.
 */
public interface DoubleIntBool2RefFn<R> {
    R invoke(double p1, int p2, boolean p3);
}
