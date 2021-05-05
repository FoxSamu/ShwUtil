package net.shadew.util.function.rref;

/**
 * A function that takes an object and a {@code boolean} and returns an object.
 */
public interface RefBool2RefFn<P1, R> {
    R invoke(P1 p1, boolean p2);
}
