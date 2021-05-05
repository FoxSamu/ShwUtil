package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code short} and a {@code char} and returns an object.
 */
public interface RefShortChar2RefFn<P1, R> {
    R invoke(P1 p1, short p2, char p3);
}
