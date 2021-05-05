package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code short} and an {@code int} and returns an object.
 */
public interface RefShortInt2RefFn<P1, R> {
    R invoke(P1 p1, Short p2, Int p3);
}
