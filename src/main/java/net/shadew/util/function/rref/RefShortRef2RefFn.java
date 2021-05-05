package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code short} and an object and returns an object.
 */
public interface RefShortRef2RefFn<P1, P3, R> {
    R invoke(P1 p1, short p2, P3 p3);
}
