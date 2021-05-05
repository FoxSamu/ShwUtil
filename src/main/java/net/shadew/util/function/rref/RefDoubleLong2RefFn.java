package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code double} and a {@code long} and returns an object.
 */
public interface RefDoubleLong2RefFn<P1, R> {
    R invoke(P1 p1, double p2, long p3);
}
