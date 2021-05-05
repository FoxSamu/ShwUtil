package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, an {@code int} and an {@code int} and returns an object.
 */
public interface DoubleIntInt2RefFn<R> {
    R invoke(double p1, int p2, int p3);
}
