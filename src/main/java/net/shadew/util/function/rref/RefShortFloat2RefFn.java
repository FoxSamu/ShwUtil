package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code short} and a {@code float} and returns an object.
 */
public interface RefShortFloat2RefFn<P1, R> {
    R invoke(P1 p1, Short p2, Float p3);
}
