package net.shadew.util.function.rref;

/**
 * A function that takes an object, an object and a {@code boolean} and returns an object.
 */
public interface RefRefBool2RefFn<P1, P2, R> {
    R invoke(P1 p1, P2 p2, boolean p3);
}
