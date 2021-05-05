package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code double} and an {@code int} and returns an object.
 */
public interface ShortDoubleInt2RefFn<R> {
    R invoke(short p1, double p2, int p3);
}
