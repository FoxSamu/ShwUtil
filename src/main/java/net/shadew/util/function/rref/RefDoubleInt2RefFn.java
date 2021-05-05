package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code double} and an {@code int} and returns an object.
 */
public interface RefDoubleInt2RefFn<P1, R> {
    R invoke(P1 p1, double p2, int p3);
}
