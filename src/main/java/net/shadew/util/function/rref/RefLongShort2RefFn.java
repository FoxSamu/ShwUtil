package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code long} and a {@code short} and returns an object.
 */
public interface RefLongShort2RefFn<P1, R> {
    R invoke(P1 p1, long p2, short p3);
}
