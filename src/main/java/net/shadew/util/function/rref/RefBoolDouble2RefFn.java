package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code boolean} and a {@code double} and returns an object.
 */
public interface RefBoolDouble2RefFn<P1, R> {
    R invoke(P1 p1, boolean p2, double p3);
}
