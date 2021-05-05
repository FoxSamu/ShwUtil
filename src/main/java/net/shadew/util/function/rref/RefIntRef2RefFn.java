package net.shadew.util.function.rref;

/**
 * A function that takes an object, an {@code int} and an object and returns an object.
 */
public interface RefIntRef2RefFn<P1, P3, R> {
    R invoke(P1 p1, int p2, P3 p3);
}
