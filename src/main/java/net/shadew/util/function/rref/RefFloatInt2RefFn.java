package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code float} and an {@code int} and returns an object.
 */
public interface RefFloatInt2RefFn<P1, R> {
    R invoke(P1 p1, float p2, int p3);
}
