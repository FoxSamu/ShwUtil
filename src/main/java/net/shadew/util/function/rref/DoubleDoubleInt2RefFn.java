package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code double} and an {@code int} and returns an object.
 */
public interface DoubleDoubleInt2RefFn<R> {
    R invoke(double p1, double p2, int p3);
}
