package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, an object and a {@code long} and returns an object.
 */
public interface BoolRefLong2RefFn<P2, R> {
    R invoke(boolean p1, P2 p2, long p3);
}
