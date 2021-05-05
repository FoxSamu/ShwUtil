package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, an object and a {@code long} and returns an object.
 */
public interface FloatRefLong2RefFn<P2, R> {
    R invoke(float p1, P2 p2, long p3);
}
