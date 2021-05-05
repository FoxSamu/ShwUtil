package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code float} and a {@code float} and returns an object.
 */
public interface RefFloatFloat2RefFn<P1, R> {
    R invoke(P1 p1, float p2, float p3);
}
