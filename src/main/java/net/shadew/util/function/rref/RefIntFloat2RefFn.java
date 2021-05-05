package net.shadew.util.function.rref;

/**
 * A function that takes an object, an {@code int} and a {@code float} and returns an object.
 */
public interface RefIntFloat2RefFn<P1, R> {
    R invoke(P1 p1, int p2, float p3);
}
