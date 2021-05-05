package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code boolean} and an {@code int} and returns an object.
 */
public interface DoubleBoolInt2RefFn<R> {
    R invoke(double p1, boolean p2, int p3);
}
