package net.shadew.util.function.rref;

/**
 * A function that takes an object and a {@code short} and returns an object.
 */
public interface RefShort2RefFn<P1, R> {
    R invoke(P1 p1, Short p2);
}
