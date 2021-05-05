package net.shadew.util.function.rref;

/**
 * A function that takes an object, an {@code int} and an {@code int} and returns an object.
 */
public interface RefIntInt2RefFn<P1, R> {
    R invoke(P1 p1, int p2, int p3);
}
