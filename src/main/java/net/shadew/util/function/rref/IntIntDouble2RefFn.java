package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, an {@code int} and a {@code double} and returns an object.
 */
public interface IntIntDouble2RefFn<R> {
    R invoke(int p1, int p2, double p3);
}
