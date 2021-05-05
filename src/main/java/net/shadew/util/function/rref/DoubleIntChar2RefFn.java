package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, an {@code int} and a {@code char} and returns an object.
 */
public interface DoubleIntChar2RefFn<R> {
    R invoke(double p1, int p2, char p3);
}
