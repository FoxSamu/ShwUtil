package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, an object and an {@code int} and returns an object.
 */
public interface DoubleRefInt2RefFn<P2, R> {
    R invoke(double p1, P2 p2, int p3);
}
