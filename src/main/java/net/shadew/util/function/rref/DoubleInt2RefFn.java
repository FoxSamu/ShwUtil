package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double} and an {@code int} and returns an object.
 */
public interface DoubleInt2RefFn<R> {
    R invoke(double p1, int p2);
}
