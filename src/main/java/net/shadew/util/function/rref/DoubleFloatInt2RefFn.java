package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code float} and an {@code int} and returns an object.
 */
public interface DoubleFloatInt2RefFn<R> {
    R invoke(double p1, float p2, int p3);
}
