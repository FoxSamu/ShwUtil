package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code long} and an {@code int} and returns an object.
 */
public interface RefLongInt2RefFn<P1, R> {
    R invoke(P1 p1, long p2, int p3);
}
