package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code boolean} and a {@code float} and returns an object.
 */
public interface RefBoolFloat2RefFn<P1, R> {
    R invoke(P1 p1, boolean p2, float p3);
}
