package net.shadew.util.function.rref;

/**
 * A function that takes an object, an {@code int} and a {@code boolean} and returns an object.
 */
public interface RefIntBool2RefFn<P1, R> {
    R invoke(P1 p1, int p2, boolean p3);
}
