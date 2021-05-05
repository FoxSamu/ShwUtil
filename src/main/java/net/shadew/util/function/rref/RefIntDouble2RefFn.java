package net.shadew.util.function.rref;

/**
 * A function that takes an object, an {@code int} and a {@code double} and returns an object.
 */
public interface RefIntDouble2RefFn<P1, R> {
    R invoke(P1 p1, int p2, double p3);
}
