package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, an {@code int} and a {@code float} and returns an object.
 */
public interface DoubleIntFloat2RefFn<R> {
    R invoke(double p1, int p2, float p3);
}
