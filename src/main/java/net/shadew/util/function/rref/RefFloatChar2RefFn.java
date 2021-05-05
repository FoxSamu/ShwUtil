package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code float} and a {@code char} and returns an object.
 */
public interface RefFloatChar2RefFn<P1, R> {
    R invoke(P1 p1, float p2, char p3);
}
