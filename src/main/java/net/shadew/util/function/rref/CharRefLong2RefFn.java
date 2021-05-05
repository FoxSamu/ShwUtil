package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, an object and a {@code long} and returns an object.
 */
public interface CharRefLong2RefFn<P2, R> {
    R invoke(char p1, P2 p2, long p3);
}
