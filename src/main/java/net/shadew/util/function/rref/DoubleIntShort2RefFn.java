package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, an {@code int} and a {@code short} and returns an object.
 */
public interface DoubleIntShort2RefFn<R> {
    R invoke(double p1, int p2, short p3);
}
