package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code double} and an {@code int} and returns an object.
 */
public interface IntDoubleInt2RefFn<R> {
    R invoke(int p1, double p2, int p3);
}
