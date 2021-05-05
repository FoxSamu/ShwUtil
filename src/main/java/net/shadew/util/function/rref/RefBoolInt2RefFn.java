package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code boolean} and an {@code int} and returns an object.
 */
public interface RefBoolInt2RefFn<P1, R> {
    R invoke(P1 p1, boolean p2, int p3);
}
