package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code short} and an {@code int} and returns an object.
 */
public interface DoubleShortInt2RefFn<R> {
    R invoke(double p1, short p2, int p3);
}
