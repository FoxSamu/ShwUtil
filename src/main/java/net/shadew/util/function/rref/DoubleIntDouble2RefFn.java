package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, an {@code int} and a {@code double} and returns an object.
 */
public interface DoubleIntDouble2RefFn<R> {
    R invoke(double p1, int p2, double p3);
}
