package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code short} and a {@code short} and returns an object.
 */
public interface RefShortShort2RefFn<P1, R> {
    R invoke(P1 p1, short p2, short p3);
}
