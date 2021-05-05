package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code float} and a {@code short} and returns an object.
 */
public interface RefFloatShort2RefFn<P1, R> {
    R invoke(P1 p1, float p2, short p3);
}
