package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code double} and an object and returns an object.
 */
public interface RefDoubleRef2RefFn<P1, P3, R> {
    R invoke(P1 p1, double p2, P3 p3);
}
