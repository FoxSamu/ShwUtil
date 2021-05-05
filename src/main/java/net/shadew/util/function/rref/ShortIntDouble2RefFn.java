package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, an {@code int} and a {@code double} and returns an object.
 */
public interface ShortIntDouble2RefFn<R> {
    R invoke(short p1, int p2, double p3);
}
