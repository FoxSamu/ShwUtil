package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code long} and an object and returns an object.
 */
public interface RefLongRef2RefFn<P1, P3, R> {
    R invoke(P1 p1, long p2, P3 p3);
}
